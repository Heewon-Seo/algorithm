package section7;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public int answer(int a) {
        // 피보나치 수열: 앞의 2개 수를 합하여 다음 숫자가 되는 수열
        // a개의 피보나치 수열을 출력하는 함수를 작성

        if(a==1) return 1;
        else if(a==2) return 1;
        else return answer(a-2)+answer(a-1);

    }

    public static void main(String[] args) {
        Fibonacci T = new Fibonacci();
        System.out.println(T.answer(3));
    }
}
