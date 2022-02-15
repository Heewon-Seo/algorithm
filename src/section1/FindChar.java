package section1;

import java.util.Locale;
import java.util.Scanner;

public class FindChar {

    public int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

//        for(int i = 0 ; i < str.length() ; i++) {
//            if(str.charAt(i)==t) {
//                answer++;
//            }
//        }

        for(char x : str.toCharArray()) {
            if(x==t) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        FindChar f = new FindChar();
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        char c = scan.next().charAt(0);
        System.out.println(f.solution(str,c));

    }
}
