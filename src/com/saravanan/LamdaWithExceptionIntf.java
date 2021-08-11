package com.saravanan;

public interface LamdaWithExceptionIntf {
    double func(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception{
    EmptyArrayException(){
        super(" Array Empty");
    }
}
