package com.saravanan;

public class BlockLamdaReverseStringEx {

        //Block lamda to reverse a String
     public static BlockLamdaReverseStringIntf reverseStr = (str) -> {
            String result ="";
            int i;

            for(i = str.length()-1; i>=0; i--)
                result+= str.charAt(i);

            return result;
        };

    public static void main(String []a){

        System.out.println(" Reverse of Saravanan => "+ reverseStr.func("Saravanan"));
        System.out.println(" Reverse of Dharmalingam => "+ reverseStr.func("Dharmalingam"));
        System.out.println(" Reverse of MadaM => "+ reverseStr.func("MadaM"));
    }
}
