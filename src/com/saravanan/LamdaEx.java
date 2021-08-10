package com.saravanan;

public class LamdaEx {


    public static void main(String[] args) {

        MyNumber myNumber; // interface reference

        myNumber =   () -> 123.45;   // lamda expression returns a constant value

 	    System.out.println( " A constant value :"+ myNumber.getValue() );


 	    // Return a random number
        myNumber= () -> Math.random() * 1000;

        System.out.println( " A Random value :"+ myNumber.getValue() );
        System.out.println( " Again Random value :"+ myNumber.getValue() );

        //myNumber=() -> "123.45" ; // Wont work as it doesnt return double but String.

    }
}
