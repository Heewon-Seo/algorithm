/*
창영이는 강산이의 비밀번호를 훔치기 위해서 강산이가 사용하는 컴퓨터에 키로거를 설치했다.
며칠을 기다린 끝에 창영이는 강산이가 비밀번호 창에 입력하는 글자를 얻어냈다.

키로거는 사용자가 키보드를 누른 명령을 모두 기록한다. 따라서, 강산이가 비밀번호를 입력할 때,
화살표나 백스페이스를 입력해도 정확한 비밀번호를 알아낼 수 있다.

강산이가 비밀번호 창에서 입력한 키가 주어졌을 때, 강산이의 비밀번호를 알아내는 프로그램을 작성하시오.
강산이는 키보드로 입력한 키는 알파벳 대문자, 소문자, 숫자, 백스페이스, 화살표이다.

첫째 줄에 테스트 케이스의 개수가 주어진다.

각 테스트 케이스는 한줄로 이루어져 있고, 강산이가 입력한 순서대로 길이가 L인 문자열이 주어진다.
(1 ≤ L ≤ 1,000,000)

강산이가 백스페이스를 입력했다면, '-'가 주어진다.
이때 커서의 바로 앞에 글자가 존재한다면, 그 글자를 지운다.

화살표의 입력은 '<'와 '>'로 주어진다.
이때는 커서의 위치를 움직일 수 있다면, 왼쪽 또는 오른쪽으로 1만큼 움직인다.

나머지 문자는 비밀번호의 일부이다.

물론, 나중에 백스페이스를 통해서 지울 수는 있다.

만약 커서의 위치가 줄의 마지막이 아니라면,
커서 및 커서 오른쪽에 있는 모든 문자는 오른쪽으로 한 칸 이동한다.

***input
2 // test case 개수
<<BP<A>>Cd- // 테스트케이스1

ThIsIsS3Cr3t // 테스트케이스2

***output
BAPC
ThIsIsS3Cr3t

[ ] [ ] [ ] [ ] [ ]

 */

// < 화살표 왼쪽
// > 화살표 오른쪽
// - 백스페이스

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    static LinkedList<Character> newInput;

    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Main obj = new Main();

        int num = Integer.parseInt(bf.readLine());

        String[] arr = new String[num];

        for(int i = 0 ; i < num ; i++) {
//            System.out.print("- ");
            arr[i] = bf.readLine();
        }

        for (String input : arr) {
            System.out.println(obj.returnInputs(input));
        }


    }


    String  returnInputs(String input) {
        char[] myInput = input.toCharArray();

        int start = 0;
        int myInputLength = myInput.length;

        for(int i = 0; i < myInputLength ; i++) {
            if(Character.isAlphabetic(myInput[i]) || Character.isDigit(myInput[i])) {
                // 맨앞에 백스페이스나 화살표는 지운다
                // myInput[0] .. myInput[i-1] 까지 무시
                // myInput[i] .. myInput[마지막] 까지 로직처리..
                start = i;
                break;
            }
        }

        newInput = new LinkedList<>();
        ListIterator<Character> list = newInput.listIterator();


        for(int i = start ; i < myInputLength ; i++) {
//            System.out.println(myInput[i]);
            switch(myInput[i]) {
                case '<' :
                    if(list.hasPrevious()) {
                        list.previous();
                    }
                    break;
                case '>' :
                    if(list.hasNext()) {
                        list.next();
                    }
                    break;
                case '-' :
                    if(list.hasPrevious()) {
                        list.previous();
                        list.remove();
                    }
                    break;
                default :
                    list.add(myInput[i]);
            }
        }

        StringBuilder answer = new StringBuilder();

        for (Character character : newInput) {
            answer.append(character.toString());
        }

        return answer.toString();

    }
}
