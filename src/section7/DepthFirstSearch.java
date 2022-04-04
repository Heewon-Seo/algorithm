package section7;

class Node {
    /*
    Node의 구조
    -----------
      1(root)  --> 객체의 주소를 저장
    -----------
    lt   |  rt
    -----------
     */


    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt = rt = null;
    }

}

public class DepthFirstSearch {

    Node root;
    public void DFS(Node root) {
        if(root==null) return;
        else {
            System.out.println("전위순회 "+root.data); // 전위순회
            DFS(root.lt);
            System.out.println("중위순회 "+root.data); // 중위순회
            DFS(root.rt);
            System.out.println("후위순회 "+root.data); // 후위순회
        }
    }

    public static void main(String[] args) {
        /*
        ** 이진트리순회 **

                [1]
                / \
              /    \
            [2]    [3]
            /\      /\
          /   \    /   \
         [4] [5]  [6]  [7]

         전위 순회 출력: 1 - 2 - 4 - 5 - 3 - 6 - 7
         중위 순위 출력: 4 - 2 - 5 - 1 - 6 - 3 - 7
         후위 순위 출력: 4 - 5 - 2 - 6 - 7 - 3 - 1
         */

        DepthFirstSearch tree = new DepthFirstSearch();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.DFS(tree.root);

    }
}


