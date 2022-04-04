package section7;

import java.util.ArrayList;
import java.util.List;

public class DFS2 {

    public void Dfs2(int n) {

        // 10진수가 입력되면 2진수로 변환화여 출력하는 프로그램 작성

        if(n==0) {
            return;
        } else {
            Dfs2(n/2);
            System.out.print(n%2);
        }

    }

    public static void main(String[] args) {
        DFS2 T = new DFS2();
        T.Dfs2(11);
    }


}
