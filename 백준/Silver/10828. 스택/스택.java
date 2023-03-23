import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {

    static int[] stack;
    int curr;

    public Main() {
        stack = new int[100000];
        Arrays.fill(stack, -1);
        curr = 0;
    }

    void push(int x) { //정수 X를 스택에 넣는 연산이다.
        stack[curr++] = x;
    }

    int pop() {
//        스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다.
//        만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

        if(curr>0) {
            return stack[--curr];
        } else {
            return -1;
        }

    }

    int size() { // 스택에 들어있는 정수의 개수를 출력한다.
        return curr;
    }

    int empty() { // 스택이 비어있으면 1, 아니면 0을 출력한다.
        if(curr>0) {
            return 0;
        } else {
            return 1;
        }
    }

    int top() {
        // 스택의 가장 위에 있는 정수를 출력한다.
        // 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        if(curr>0) {
            return stack[curr-1];
        } else {
            return -1;
        }
    }

    public static void main(String[] args) throws IOException {

        Main main = new Main();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        String[] arr = new String[num];

        for(int i = 0 ; i < num ; i++) {
           
            arr[i] = bf.readLine();
        }

        for (String input : arr) {
            String[] cmd = input.split(" ");

            switch (cmd[0]) {
                case "push":
                    main.push(Integer.parseInt(cmd[1]));
                    break;
                case "top":
                    System.out.println(main.top());
                    break;
                case "size":
                    System.out.println(main.size());
                    break;
                case "empty":
                    System.out.println(main.empty());
                    break;
                case "pop":
                    System.out.println(main.pop());
                    break;
            }
        }
    }
}
