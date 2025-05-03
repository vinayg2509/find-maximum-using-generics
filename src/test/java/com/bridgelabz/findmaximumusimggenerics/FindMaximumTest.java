package com.bridgelabz.findmaximumusimggenerics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class gitFindMaximumTest
{

    FindMaximum findMaximum= new FindMaximum();

    public void findFloatMax()
    {
        Float actualResult= findMaximum .findFloatMax(10.0f,40.9f,30.3f);
        assertEquals(40.9f,actualResult);
        System.out.println("Maximum value found: " + actualResult);
    }
    // TC 1.1: Max at 1st position
    @Test
    public void findFloatMaxAtFirstPosition()
    {
        Float a=400.0f;
        Float b=00.5f;
        Float c=90.f;
        Float actualResult= findMaximum.findFloatMax(a,b,c);
        assertEquals(a,actualResult,"Test data invalid: first number is not the maximum.");
    }

    // TC 1.2: Max at 2nd position
    @Test
    public void findFloatMaxAtSecondPosition()
    {


        Float a = 40f;
        Float b = 100f;
        Float c = 9f;
        Float actualResult = findMaximum.findFloatMax(a, b, c);
        assertEquals(b,actualResult,"Test data invalid: second number is not the maximum.");

    }
    // TC 1.3: Max at 3rd position
    @Test
    public void findFloatMaxAtThirdPosition()
    {

        Float a = 40f;
        Float b = 100f;
        Float c = 900f;
        Float actualResult = findMaximum.findFloatMax(a, b, c);
        assertEquals(c,actualResult,"Test data invalid: third number is not the maximum.");

    }
}