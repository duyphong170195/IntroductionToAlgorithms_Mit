package binarysearchtrees;

public class Node {

    private int number;
    private int subtreeSize;
    private Node left;
    private Node right;

    public Node() {
    }

    public Node(int number) {
        this.number = number;
    }

    public int getSubtreeSize() {
        return subtreeSize;
    }

    public void setSubtreeSize(int subtreeSize) {
        this.subtreeSize = subtreeSize;
    }

    public Node(int number, Node left, Node right) {
        this.number = number;
        this.left = left;
        this.right = right;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void insertNode(Node node, Node currentNode, int subtreeSize) {
        if(currentNode.number > node.getNumber()) {
            if(currentNode.left == null) {
                currentNode.left = node;
                return;
            }
            insertNode(node, currentNode.left, currentNode.left.subtreeSize);
        } else {
            if(currentNode.right == null) {
                currentNode.right = node;
                return;
            }
            insertNode(node, currentNode.right, subtreeSize);
        }

    }

//    public void insertNode(Node node, Node currentNode)
//    {
//        if(this.number > node.getNumber()) {
//            if(this.left == null) {
//                this.left = node;
//                return;
//            }
//            insertNode(node, this.left);
//        } else {
//            if(this.right == null) {
//                this.right = node;
//                return;
//            }
//            insertNode(node, this.right);
//        }
//    }
}
