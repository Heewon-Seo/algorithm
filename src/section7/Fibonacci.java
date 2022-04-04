package section7;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    // 재귀보다는 for문이 성능이 좋음
    // Stack Frame이 계속 생기기 때문에

    static int[] fibo;

    public int answer(int a) {
        // 피보나치 수열: 앞의 2개 수를 합하여 다음 숫자가 되는 수열
        // a개의 피보나치 수열을 출력하는 함수를 작성

        if(fibo[a]>0) { // 이미 fibo[a]의 값이 구해져있을 경우 바로 return 처리
            return fibo[a];
        }
        if(a==1) return fibo[a]=1;
        else if(a==2) return fibo[a]=1;
        else return fibo[a]=answer(a-2)+answer(a-1);

    }

    public static void main(String[] args) {
        Fibonacci T = new Fibonacci();
        int n = 45;
        fibo = new int[n+1];
        T.answer(n);

        for(int i=1; i<=n; i++) System.out.println(fibo[i]);
    }
}
