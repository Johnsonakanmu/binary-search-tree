package org.johnsoncodelove;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        // Insert nodes
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        // Traversals
        System.out.println("In-order Traversal:");
        bst.inorder();

        System.out.println("Pre-order Traversal:");
        bst.preorder();

        System.out.println("Post-order Traversal:");
        bst.postorder();

        // Search
        System.out.println("\nSearching 40: " + bst.search(40));
        System.out.println("Searching 100: " + bst.search(100));

        // Delete
        System.out.println("\nDeleting 30...");
        bst.delete(30);

        System.out.println("In-order after deletion:");
        bst.inorder();
    }
}