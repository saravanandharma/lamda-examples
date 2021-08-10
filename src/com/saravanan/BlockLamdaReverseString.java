package com.saravanan;

public class BlockLamdaReverseString {
    public static void main(String []a){

        //Block lamda to reverse a String
        StringFunc reverseStr = (str) -> {
          String result ="";
          int i;

          for(i = str.length()-1; i>=0; i--)
              result+= str.charAt(i);

          return result;
        };

        System.out.println(" Reverse of Saravanan => "+ reverseStr.func("Saravanan"));
        System.out.println(" Reverse of Dharmalingam => "+ reverseStr.func("Dharmalingam"));
        System.out.println(" Reverse of MadaM => "+ reverseStr.func("MadaM"));
    }
}
