package section7;

public class DFS {

    // 자연수 N이 입력되면 N까지의 모든 수가 입력되는 것

    public void Dfs(int n) {

        if(n==0) return;
        else {
            Dfs(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        DFS T = new DFS();
        T.Dfs(3);
    }

}
