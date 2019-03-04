package com.examples;

/**
 * Created by gabriele on 21/10/17.
 */
public class BreadFirstSearch {

    class Node
    {
        int data;
        Node left, right;
        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    class BinaryTree {
        Node root;

        public BinaryTree() {
            root = null;
        }
    }
}
