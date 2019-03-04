package com.examples.binarytreeimpl;

import java.util.Comparator;

/**
 * Created by gabriele on 02/09/17.
 */
public class GenericBinaryTree<T extends Comparable<? super T>> {

    private BinaryNode<T> root;
    //private Comparator<? super T> cmp;

    public GenericBinaryTree(){
        this.root = null;
    }

//    public GenericBinaryTree(Comparator<? super T> c){
//        root = null;
//        cmp = c;
//    }

    public boolean isEmpty(){ return root == null; }

    public boolean contains(T data){
        return contains(data, root);
    }

    private boolean contains(T element, BinaryNode<T> node){
        if(node == null)
            return false;

        int compareResult = element.compareTo(node.element);

        if(compareResult<0)
            return contains(element, node.left);
        else if(compareResult>0)
            return contains(element, node.right);
        else
            return true;
    }

    public T findMin() {
        if(isEmpty())
            return null; //TODO: throw exception
        else return findMin(root).element;
    }
    private BinaryNode<T> findMin(BinaryNode<T> node) {
        if(node == null)
            return null;
        else if(node.left == null)
            return node;
        else return findMin(node.left);
    }
    public T findMax() {
        if(isEmpty())
            return null;
        else return findMax(root).element;
    }

    public BinaryNode<T> findMax(BinaryNode<T> node) {
        if(node == null)
            return null;
        else if(node.right == null)
            return node;
        else return findMax(node.right);

        //non-recursive implementation:
//        if(node!=null)
//            while(node.right!=null)
//                node = node.right;
//        return node;
    }

    public void insert(T value) {
        root = insert(value, root);
    }

    public void remove(T value) {
        root = remove(value, root);
    }

    private BinaryNode<T> insert(T value, BinaryNode<T> node) {
        if(node == null){
            return new BinaryNode<T>(value, null, null);
        }

        int compareResult = value.compareTo(node.element);

        if(compareResult<0){
            node.left = insert(value, node.left);
        }else if(compareResult > 0){
            node.right = insert(value, node.right);
        }
        return null;
    }

    private BinaryNode<T> remove(T value, BinaryNode<T> node) {
        if(node == null)
            return node;

        int compareResult = value.compareTo(node.element);

        if(compareResult < 0)
            node.left = remove(value, node);
        else if(compareResult>0)
            node.right = remove(value, node);
        else if(node.left != null && node.right != null) {
            //node.element = findMin(node.right).element;
            node.right = remove(node.element, node.right);
        }
        else
            node = (node.left != null) ? node.left : node.right;

        return node;
    }
}
