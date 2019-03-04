package com.examples.stringmanipulation;

/**
 * Created by gabriele on 25/02/19.
 */
public class StringDecoderCounter {

    /**
     * given a =1, b= 2, ..., z = 26 ; find the number of ways a string can be encoded
     * ex. : '111' => 3 {'aaa', 'ka', 'ak'}
     * '001' not allowed
     *
     */
    public static int getNumOfEncodesHelper(String str) {

        char[] charArr = str.toCharArray();

        if (str.length() == 0) {
            return 0;
        }
        if (str.length() == 1) {
            return 1;
        }

        if (Integer.parseInt(str.substring(2)) <= 26) {
            return getNuOfEncodes(str.substring(0,1), 0) + getNuOfEncodes(str.substring(0,2),1)
                    + getNuOfEncodes(str.substring(2, str.length()-1),2);

        } else {
            return getNuOfEncodes(str.substring(0,1), 0) + getNuOfEncodes(str.substring(2, str.length()-1),2);
        }
        //num(i) + num(n-1-i)

    }

    public static int getNuOfEncodes(String str, int s) {

        if (str.length() == s) {
                
        }

        return 0;
    }


    public static void main(String... args) {

        String str = "111";

        System.out.println(getNumOfEncodesHelper(str));

    }

}
