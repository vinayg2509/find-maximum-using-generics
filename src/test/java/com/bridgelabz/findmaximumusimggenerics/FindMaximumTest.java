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

    // TC 1.1: Max at 1st position
    @Test
    public void findIntegerMaxAtFirstPosition()
    {
        Integer a=40;
        Integer b=00;
        Integer c=90;
        Integer actualResult= findMaximum.findIntegerMax(a,b,c);
        assertEquals(a,actualResult,"Test data invalid: first number is not the maximum.");
    }

    // TC 1.2: Max at 2nd position
    @Test
    public void findIntegerMaxAtSecondPosition()
    {
        Integer a = 40;
        Integer b = 100;
        Integer c = 9;
        Integer actualResult = findMaximum.findIntegerMax(a, b, c);
        assertEquals(a,actualResult,"Test data invalid: second number is not the maximum.");
    }
    // TC 1.3: Max at 3rd position
    @Test
    public void findIntegerMaxAtThirdPosition()
    {
        Integer a = 40;
        Integer b = 100;
        Integer c = 900;
        Integer actualResult = findMaximum.findIntegerMax(a, b, c);
        assertEquals(a,actualResult,"Test data invalid: third number is not the maximum.");
    }

}