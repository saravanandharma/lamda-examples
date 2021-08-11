package com.saravanan;

public class LamdaWithExceptionEx {
    public static void main(String []a) throws EmptyArrayException
    {
        double[] values = {1.0, 2.0, 3.0, 4.0};

        //This block lamda computes average of double array

        LamdaWithExceptionIntf average = (n) -> {
            double sum = 0;

            if(n.length == 0)
                throw new EmptyArrayException();

            for(int i=0; i< n.length; i++)
                sum += n[i];

            return sum / n.length;
        };

        System.out.println(" The average is " + average.func(values));

        //This cuases the EmtryArrayException
        System.out.println(" Average of 0 sum is ="+ average.func(new double[0]));
    }
}
