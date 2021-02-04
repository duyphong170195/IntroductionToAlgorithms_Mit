package binarysearchtrees;

import java.util.LinkedList;
import java.util.List;

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

    public void insertNode(Node node, Node currentNode) {
        if(currentNode.number > node.getNumber()) {
            if(currentNode.left == null) {
                currentNode.left = node;
                return;
            }
            insertNode(node, currentNode.left);
        } else {
            if(currentNode.right == null) {
                currentNode.right = node;
                return;
            }
            insertNode(node, currentNode.right);
        }

    }

    public void printGivenPreorderTraversal(Node node) {
        if(node == null) {
            return;
        }

        System.out.println(node.getNumber());
        printGivenPreorderTraversal(node.getLeft());
        printGivenPreorderTraversal(node.getRight());
    }
    public void getDataFromBinaryTree(Node node, List<Integer> listIntegers) {
        if(node == null) {
            return;
        }

        listIntegers.add(node.getNumber());
        getDataFromBinaryTree(node.getLeft(), listIntegers);
        getDataFromBinaryTree(node.getRight(), listIntegers);
    }

}
