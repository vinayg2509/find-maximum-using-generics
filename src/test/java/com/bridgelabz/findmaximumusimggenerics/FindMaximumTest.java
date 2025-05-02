package com.bridgelabz.findmaximumusimggenerics;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindMaximumTest
{
    FindMaximum findMaximum= new FindMaximum();
    //UC-1 method to find Integer max
    @Test
    public void findIntegerMax()
    {
        Integer actualResult= findMaximum .findIntegerMax(10,40,30);
        assertEquals(40,actualResult);

        System.out.println("Maximum value found: " + actualResult);
    }


    //UC-2 method to find Float max
    @Test
    public void findFloatMax()
    {
        Float actualResult= findMaximum .findFloatMax(100.0f,400.5f,30.3f);
        assertEquals(400.5f,actualResult);

        System.out.println("Maximum value found: " + actualResult);
    }

}