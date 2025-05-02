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

    public  Float findFloatMax(Float num1,Float num2,Float num3)
    {
        Float max=num1;
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

    public String findStringMax(String s1,String s2,String s3)
    {
        String max=s1;

        if(s2.compareTo(max)>0)
        {
            max=s2;
        }
        if(s3.compareTo(max)>0)
        {
            max=s3;
        }

        return  max;
    }
}
