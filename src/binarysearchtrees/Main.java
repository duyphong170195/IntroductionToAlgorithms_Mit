package binarysearchtrees;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Initialization of a Hashtable
        // using Generics
        Hashtable<Integer, String> ht2
                = new Hashtable<Integer, String>();

        ht2.put(1, "four");
        ht2.put(1, "three");
        ht2.put(2, "five");
        ht2.put(3, "six");
        System.out.println("Mappings of ht2 : " + ht2);

//        Node rootNode = new Node(50);
//        Node rootNode1L = new Node(25);
//        Node rootNode1R = new Node(60);
//        Node rootNode2L = new Node(26);
//        Node rootNode3R = new Node(27);
//        Node rootNode3L = new Node(42);
//        Node rootNode4R = new Node(45);
        Node rootNode = new Node(10);
        Node rootNode1L = new Node(2);
        Node rootNode1R = new Node(7);
        Node rootNode2L = new Node(8);
        Node rootNode3R = new Node(4);
        rootNode.setLeft(rootNode1L);
        rootNode.setRight(rootNode1R);
        rootNode1L.setLeft(rootNode2L);
        rootNode1L.setRight(rootNode3R);

        Node binarySearchTree = new Node();

        binarySearchTree.convertBinaryTreeToBinarySearchTree(rootNode, binarySearchTree);
        binarySearchTree.printGivenPreorderTraversal(binarySearchTree);

//        rootNode.insertNode(rootNode1L, rootNode);
//        rootNode.insertNode(rootNode1R, rootNode);
//        rootNode.insertNode(rootNode2L, rootNode);
//        rootNode.insertNode(rootNode3R, rootNode);
//        rootNode.insertNode(rootNode3L, rootNode);
//        rootNode.insertNode(rootNode4R, rootNode);
//        rootNode.printGivenPreorderTraversal(rootNode);

    }
}
