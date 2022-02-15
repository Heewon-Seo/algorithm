package section1;

import java.util.Scanner;

public class LongestWord {
    public String solution(String str) {
        String answer = "";

//        int m = Integer.MIN_VALUE;
        // 가장 작은 값으로 초기화 됨

        String[] array = str.split(" ");

        for(String word : array) {
//            int len = word.length();
//            if(len>m) {
//                m = len;
//                answer = word;
//            }
            if(answer.length() < word.length()) {
                answer = word;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        LongestWord l = new LongestWord();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.println(l.solution(str));

    }
}
