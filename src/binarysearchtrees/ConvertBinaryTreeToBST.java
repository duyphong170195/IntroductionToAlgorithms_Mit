package binarysearchtrees;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ConvertBinaryTreeToBST {

    public static void main(String[] args) {
        Node rootNode = new Node(10);
        Node rootNode1L = new Node(2);
        Node rootNode1R = new Node(7);
        Node rootNode2L = new Node(8);
        Node rootNode3R = new Node(4);
        Node rootNode4R = new Node(11);
        Node rootNode5R = new Node(5);
        rootNode.setLeft(rootNode1L);
        rootNode.setRight(rootNode1R);
        rootNode1L.setLeft(rootNode2L);
        rootNode1L.setRight(rootNode3R);
        rootNode2L.setRight(rootNode4R);
        rootNode3R.setRight(rootNode5R);

        LinkedList<Integer> integerList= convertBinaryTreeToSortedArray(rootNode);
        Node binarySearchTree = convertListToBST(integerList, 0, integerList.size() - 1);
        binarySearchTree.printGivenPreorderTraversal(binarySearchTree);

    }

    public static LinkedList<Integer> convertBinaryTreeToSortedArray(Node binaryTree) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        binaryTree.getDataFromBinaryTree(binaryTree, linkedList);
        Collections.sort(linkedList);
        return linkedList;
    }

//    public static Node convertArrayToBST(LinkedList<Integer> integerList) {
//        int size = integerList.size();
//        if(size ==0) {
//            return new Node();
//        }
//
//        Node binarySearchTree = new Node(integerList.get(size/2));
//        integerList.remove(integerList.get(size/2));
//
//        while (integerList.size() != 0) {
//            binarySearchTree.insertNode(new Node(integerList.pop()), binarySearchTree);
//        }
//
//        return binarySearchTree;
//    }
    public static Node convertListToBST(List<Integer> integerList, int start, int end) {
        if(start > end) {
            return null;
        }
        int sizeOnTwo = (start + end)/2;
        Node binarySearchTree = new Node(integerList.get(sizeOnTwo));
        if(start < end){
            binarySearchTree.setLeft(convertListToBST(integerList, start, sizeOnTwo - 1));
            binarySearchTree.setRight(convertListToBST(integerList, sizeOnTwo + 1, end));
        }
        return binarySearchTree;
    }

    public static Node convertListToBST(List<Integer> integerList) {
        int size = integerList.size();
        if(size == 1) {
            return new Node(integerList.get(0));
        }
        int sizeOnTwo = integerList.size()/2;
        Node binarySearchTree = new Node(integerList.get(sizeOnTwo));

        List<Integer> subLeftArray = integerList.subList(0, sizeOnTwo);
        List<Integer> subRightArray = integerList.subList(sizeOnTwo+1, size);
        if(subLeftArray.size() > 0) {
            binarySearchTree.insertNode(convertListToBST(subLeftArray), binarySearchTree);
        }
        if(subRightArray.size() > 0) {
            binarySearchTree.insertNode(convertListToBST(subRightArray), binarySearchTree);
        }

        return binarySearchTree;
    }
}
