package com.examples;

/**
 * Created by gabriele on 27/08/17.
 */
public class Node {

    private Node nodeUp;
    private Node nodeDown;
    private Value value;

    public Node(Value value) {
        this.nodeUp = null;
        this.nodeDown = null;
        this.value = value;
    }

    public Node(Node nodeUp, Node nodeDown, Value value) {
        this.nodeUp = nodeUp;
        this.nodeDown = nodeDown;
        this.value = value;
    }

    public Value getValue() {
        return value;
    }

    public Node getNodeUp() {
        return nodeUp;
    }

    public Node getNodeDown() {
        return nodeDown;
    }

    public void setNodeDown(Node nodeDown) {
        this.nodeDown = nodeDown;
    }

    public void setNodeUp(Node nodeUp) {
        this.nodeUp = nodeUp;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    static class Value {
        private double spotPrice;
        private double optionPrice;

        public Value(double spotPrice, double optionPrice) {
            this.spotPrice = spotPrice;
            this.optionPrice = optionPrice;
        }

        public double getSpotPrice() {
            return spotPrice;
        }

        public double getOptionPrice() {
            return optionPrice;
        }
    }
}
