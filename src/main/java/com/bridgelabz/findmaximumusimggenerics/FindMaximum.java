package com.bridgelabz.findmaximumusimggenerics;

public class FindMaximum
{
    public  Integer findIntegerMax(Integer num1,Integer num2,Integer num3)
    {
        Integer max=num1;
        if(num2.compareTo(max)>0)
        {
            max=num2;
        }
        if(num3.compareTo(max)>0)
        {
            max=num3;
        }
        return max;
    }
}
