package com.saravanan;

public class BlockLamdaFactorialEx {

    public static void main(String[] a) {
        // block lamda that computes the factorial of an int value
        LamdaWithParamIntf factorial = (n) -> {
            int result =1;

            for(int i=1; i<=n; i++)
                result = i * result;

            return result;
            };

        System.out.println(" Factorial of 3 ="+ factorial.func(3));
        System.out.println(" Factorial of 10 ="+ factorial.func(10));
    }

}

