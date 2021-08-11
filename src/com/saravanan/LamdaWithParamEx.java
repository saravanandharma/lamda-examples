package com.saravanan;

public class LamdaWithParamEx {

    public static void main(String [] a){
        //Lamda expression that testt if anum is even
        BlockLamdaFactorialIntf isEven =(n) -> (n%2)==0;

        if(isEven.test(43))
            System.out.println("43 is Even");
        else
            System.out.println("43 is NOT Even");


        if(isEven.test(50))
            System.out.println("50 is Even");
        else
            System.out.println("50 is NOT Even");
    }
}
