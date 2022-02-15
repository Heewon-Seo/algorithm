package study;

public class RamenProgram {

    public static void main(String[] args) {

        try {
            RamenCook ramenCook = new RamenCook(Integer.parseInt(args[0]));
            new Thread(ramenCook, "A").start(); // 1번 스레드
            new Thread(ramenCook, "B").start(); // 2번 스레드
            new Thread(ramenCook, "C").start(); // 3번 스레드
            new Thread(ramenCook, "D").start(); // 4번 스레드
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    static class RamenCook implements Runnable {

        private int ramenCount;
        private String[] burners = {"_", "_", "_", "_"};


        public RamenCook(int count) {
            ramenCount = count;
        }


        @Override
        public void run() {

            while (ramenCount > 0) {

                synchronized (this) { // 한번에 한 스레드만 쓸 수 있음
                    ramenCount--;

                    System.out.println(
                            Thread.currentThread().getName()
                            + ": " + ramenCount + "개 남음"
                    );
                }

                for(int i = 0; i < burners.length; i++) {
                    if(!burners[i].equals("_")) continue;

                    synchronized (this) {
                        // if (burners[i].equals("_") {
                        burners[i] = Thread.currentThread().getName();
                        System.out.println(
                                "              "
                                + Thread.currentThread().getName()
                                + ": [" + (i + 1) + "] 번 버너 ON"
                        );
                        showBurners();
                        // }
                    }

                    try {
                        Thread.sleep(2000); // 스레드를 일정시간 정지
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    synchronized (this) {
                        burners[i] = "_";
                        System.out.println(
                                "                        "
                                + Thread.currentThread().getName()
                                + ": [" + (i + 1) + "] 번 버너 OFF"
                        );
                        showBurners();
                    }
                    break;
                }

                try {
                    Thread.sleep(Math.round(1000 * Math.random()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }


        private void showBurners() {

            String stringToPrint =
                    "                          ";

            for (int i = 0 ; i < burners.length ; i++) {
                stringToPrint += (" " + burners[i]);
            }

            System.out.println(stringToPrint);

        }
    }





}
