package study;

public class BinaryTree {

    static class Node {
        int data;
        Node left;
        Node right;
    }

    static class Tree {
        public Node root;

        public void setRoot(Node node) {
            this.root = node;
        }

        public Node getRoot() {
            return root;
        }

        public Node makeNode(Node left, int data, Node right) {
            Node node = new Node();

            node.data = data;
            node.left = left;
            node.right = right;

            return node;
        }

        // 재귀함수 (recursion function)
        // 자기 자신을 계속 호출하는 함수
        // 재귀함수 -> for, while로 대체 가능
        // but 배열의 안의 요소가 배열안의 또 배열이 있을수도 있기 때문에
        // 이러면 for, while로는 코드가 길고 복잡해짐
        // 재귀함수로 작성하면 보다 효율적으로 코드를 작성할 수 있음
        // 각종 정렬 알고리즘에도 재귀적 사고로 푸는것이 아주 좋다
        // 다만 성능 문제가 발생할 수 있음
        // 스택이 넘칠 경우에는 터져버림
        // 선형 알고리즘을 만들어서 (꼬리 재귀 최적화) 하면 됨

        // 하노이의 탑 게임


        public void inorder(Node node) {
            if(node != null) {
                inorder(node.left);
                System.out.println(node.data);
                inorder(node.right);
            }
        }

        public void preorder(Node node) {
            if(node != null) {
                System.out.println(node.data);
                preorder(node.left);
                preorder(node.right);
            }
        }

        public void postorder(Node node) {
            if(node != null) {
                postorder(node.left);
                postorder(node.right);
                System.out.println(node.data);
            }
        }
    }

    public static void main(String[] args) {

        Tree t = new Tree();
        Node n4 = t.makeNode(null, 4, null);
        Node n5 = t.makeNode(null, 5, null);
        Node n2 = t.makeNode(n4, 2, n5);
        Node n3 = t.makeNode(null, 3, null);
        Node n1 = t.makeNode(n2, 1, n3);
        t.setRoot(n1);
        t.preorder(t.getRoot());


    }
}
