import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        int[] arr = new int[num];

        for(int i = 0 ; i < num ; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }

        Stack<Integer> newStack = new Stack<>();

        for(int cmd: arr) {
            if(cmd==0) {
                newStack.pop();
            } else {
                newStack.push(cmd);
            }
        }

        int result = 0;
        for(int stackNum : newStack) {
            result += stackNum;
        }

        System.out.println(result);
    }
}
