package com.saravanan;

public class GenericFuncationalInterfaceEx {
    public static void main(String a[]){

        //Use a String-based version of GenericFunc
        GenericFunc<String> reverse =(str) -> {
            String result = "";
            int i;

            for(i = str.length()-1; i>=0; i--)
                result +=str.charAt(i);

            return result;
        };

        //Use an Integer based version of GenericFunc
        GenericFunc<Integer> factorial = (number) -> {
            int result = 1;
            for(int i=1; i<=number; i++)
                result =i*number;

            return result;
        };

        //Call reversal func
        System.out.println("Call reversal func");
        System.out.println("Reversal of Dharmalingam = "+ reverse.func("Dharmalingam"));
        System.out.println("Reversal of Saravanan = "+ reverse.func("Saravanan"));
        System.out.println("Reversal of MamA = "+ reverse.func("MamA"));

        //Call Factorial func
        System.out.println("Call Factorial func");
        System.out.println("Factorial  of 5 = "+ factorial.func(5));
        System.out.println("Factorial  of 15 = "+ factorial.func(15));
        System.out.println("Factorial  of 1 = "+ factorial.func(1));

    }
}
