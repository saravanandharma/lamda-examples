package com.saravanan;

public class LamdaAsArgEx {
    public static String lamdaAsArgEx(LamdaAsArgIntf lamdaAsArgFunc, String str){
        return lamdaAsArgFunc.someFunc(str);
    }

    public static void main(String []a){
        String simResult, blockResult="" ;
        String initialStr = "This is my text";

        // Simple lamda as Arg
        simResult = lamdaAsArgEx((str) -> str.toUpperCase(), initialStr);

        // Block lamda as Arg
        blockResult = lamdaAsArgEx((str)->{
            return str.replaceAll("\\s", "");   // This RegEx Removes all the empty spaces in the String
        }, initialStr);

        //Call the Lamda functions
        System.out.println("Simple lamda as arg: "+ simResult);

        //block lamda
        System.out.println("block lamda as arg: "+ blockResult);

        //Of course, its possible to pass a LamdaAsArgIntf created lamda function as instance reverseStr refers
        // to LamdaAsArgIntf.

        LamdaAsArgIntf reverseStr = (str) -> {
            String result ="";
            int i;

            for(i = str.length()-1; i>=0; i--)
                result+= str.charAt(i);

            return result;
        };

        System.out.println("Reverse string => "+ lamdaAsArgEx(reverseStr, initialStr));

    }

}
