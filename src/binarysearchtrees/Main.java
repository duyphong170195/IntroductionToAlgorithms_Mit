package binarysearchtrees;

public class Main {

    public static void main(String[] args) {
        // Initialization of a Hashtable
        // using Generics
        Node rootNode = new Node(50);
        Node rootNode1L = new Node(25);
        Node rootNode1R = new Node(60);
        Node rootNode2L = new Node(26);
        Node rootNode3R = new Node(27);
        Node rootNode3L = new Node(42);
        Node rootNode4R = new Node(45);


        rootNode.insertNodeWithSubsizeTree(rootNode1L, rootNode);
        rootNode.insertNodeWithSubsizeTree(rootNode1R, rootNode);
        rootNode.insertNodeWithSubsizeTree(rootNode2L, rootNode);
        rootNode.insertNodeWithSubsizeTree(rootNode3R, rootNode);
        rootNode.insertNodeWithSubsizeTree(rootNode3L, rootNode);
        rootNode.insertNodeWithSubsizeTree(rootNode4R, rootNode);

    }
}
