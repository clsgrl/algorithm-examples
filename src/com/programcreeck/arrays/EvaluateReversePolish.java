package com.programcreeck.arrays;

import java.util.Stack;

/**
 * Created by gabriele on 20/10/17.
 */
public class EvaluateReversePolish {

    /*
    * [2,1,+,3,*] -> (2+1)*3 = 9
    * [4,13,5,/,+] -> (4 + (13/5)) = 6
    * */

    public static void main(String... args) {
        String[] arr = new String[]{"2","1","+","3","*"};
        String operators = "+-*/";

        Stack<String> operands = new Stack<>();

        for(String el : arr) {
            if(!operators.contains(el)){
                operands.push(el);
            }else{
                String first = operands.pop();
                String second = operands.pop();
                int result = compute(Integer.parseInt(first), Integer.parseInt(second), el.toCharArray()[0]);
                operands.push(String.valueOf(result));
            }
        }
        String finalResult = operands.pop();

        System.out.println(finalResult);
    }

    private static int compute(int a, int b, char operand) {
        int result;
        switch(operand) {
            case '+' :
                result = a + b;
                break;
            case '-' :
                result = a - b;
                break;
            case '*' :
                result = a * b;
                break;
            case '/' :
                result = a / b;
                break;
            default :
                result = 0;
        }

        return result;

    }
}
