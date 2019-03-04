package com.examples.binarytreeimpl;

/**
 * Created by gabriele on 02/09/17.
 */
public class BinaryNode<T> {

    T element;
    BinaryNode left;
    BinaryNode right;

    BinaryNode(T element){
        this(element, null, null);
    }

    BinaryNode(T element, BinaryNode left, BinaryNode right){
        this.element = element;
        this.left = left;
        this.right = right;
    }


}
