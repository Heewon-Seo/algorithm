package section1;

import java.util.Scanner;

public class ChangeCase {
    public String solution(String str) {
        String answer = "";

//        for (char x : str.toCharArray()) {
//            if (Character.isLowerCase(x)) {
//                answer += Character.toUpperCase(x);
//            } else {
//                answer += Character.toLowerCase(x);
//            }
//        }

        // 아스키 코드로 하는 법
        // 대문자는 65 ~ 90
        // 소문자는 97 ~ 122
        // 소문자에서 32를 빼면 대문자가 됨
        for(char x : str.toCharArray()) {
            if(x>=97 && x<=122) {
                answer += (char)(x-32);
            } else {
                answer += (char)(x+32);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        ChangeCase c = new ChangeCase();
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        System.out.println(c.solution(str));
    }
}
