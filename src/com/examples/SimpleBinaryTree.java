package com.examples;

/**
 * Created by gabriele on 27/08/17.
 */
public class SimpleBinaryTree {

    private Node root;

    public SimpleBinaryTree() {
        this.root = null;
    }

    public static class Node {
        Node left;
        Node right;
        int data;

        Node(int newData){
            this.left = null;
            this.right = null;
            this.data = newData;
        }
    }

    public boolean lookup(int data){
        return lookup(root, data);
    }

    private boolean lookup(Node node, int data){
        if(node == null){
            return false;
        }

        if(node.data < data){
            return lookup(node.right, data);
        }else{
            return lookup(node.left, data);
        }
    }

    public Node insert(Node node, int data) {
        if(node == null){
            node = new Node(data);
        }else{
            if(data <= node.data){
                node.left = insert(node.left, data);
            }
            else {
                node.right = insert(node.right, data);
            }
        }

        return node;
    }

    public int size() {
        return size(root);
    }

    // returns the number of nodes in the tree
    private int size(Node root) {
        int size = 0;
        if(root == null){
            return size;
        }
        else{
            int left = size(root.left);
            int right = size(root.right);
            return size += (left+right);
        }
    }


    public static void main(String... args) {
        SimpleBinaryTree bt = new SimpleBinaryTree();
        Node root = null;
        bt.insert(root, 2);
        bt.insert(root, 1);
        bt.insert(root, 3);

        System.out.println(bt.size());

    }

}
