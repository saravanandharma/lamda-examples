package com.saravanan;

public class LamdaEx {


    public static void main(String[] args) {

        LamdaIntf lamdaIntf; // interface reference

        lamdaIntf =   () -> 123.45;   // lamda expression returns a constant value

 	    System.out.println( " A constant value :"+ lamdaIntf.getValue() );


 	    // Return a random number
        lamdaIntf = () -> Math.random() * 1000;

        System.out.println( " A Random value :"+ lamdaIntf.getValue() );
        System.out.println( " Again Random value :"+ lamdaIntf.getValue() );

        //myNumber=() -> "123.45" ; // Wont work as it doesnt return double but String.

    }
}
