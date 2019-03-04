package com.examples;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

/**
 * Created by gabriele on 27/08/17.
 */
public class BinomialOptionPricing {

    public static double  optionPriceCallEuropeanBinomial(double s, double k, double r, double y, double sigma, double t, int steps){
        double deltaT = t/steps;
        double R = Math.exp(r*deltaT);
        double u = Math.exp(sigma*Math.sqrt(deltaT));
        double d = 1/u;
        double su = s*u;
        double sd = s*d;
        double p = (R - d)/(u - d);
        double intrinsecVal = Math.max((su - k),0)*p + Math.max((sd -k ),0)*(1-p);
        double callPrice = (intrinsecVal)*Math.exp(-r*deltaT);

        return callPrice;
    }

    public BinaryTree treeBuilder(double s, double R, double u, double d, double p, int steps) {
        Node.Value rootNodeValue = new Node.Value(s,0.0);
        //binarytreeimpl binaryTree = new binarytreeimpl(rootNodeValue);
        for(int i = 1; i < steps; i++){
            for(int k = 0; k < i+1; k++) {
                //binaryTree.addDown();
            }
        }
        return null;
    }

    public static double[][] buildPricesTree(double s, int n, double u, double d){
        double[][] priceVals = new double[n+1][n+1];
        priceVals[0][0] = s;
        for(int i = 1; i<n+1; i++ ) {
            priceVals[i][0] = priceVals[i-1][0]*u;
            for(int j=1; j<i+1; j++) {
                priceVals[i][j] = priceVals[i-1][j-1] * d;
            }
        }
        return priceVals;
    }

    public static double[][] calculateIntrinsecValues(double[][] priceVals, double k, int n) {
        double[][] optValues = new double[n+1][n+1];
        for(int i=0; i<n+1; i++){
            optValues[n][i] = Math.max(priceVals[n][i]-k,0);
        }
        return optValues;
    }

    public static void main(String... args) {

        //inputs: s, k, r, y, sigma, exp in years, no steps
        double k = 100.0;
        double s = 100.0;
        double r = 0.01;
        double y = 0.01;
        double sigma = 0.2;
        double T = 1.0;
        int n = 1;
        double callPrice = optionPriceCallEuropeanBinomial(s,k,r,y,sigma,T,n);

        double[][] priceVals = buildPricesTree(s, n, 1.2, 0.8);

        double[][] optionsIntrinsecVals = calculateIntrinsecValues(priceVals,k,n);



        System.out.println(callPrice);

    }
}
