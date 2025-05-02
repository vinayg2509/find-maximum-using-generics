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
        Integer c=9;
        if(a.compareTo(b)>0 && a.compareTo(c)>0)
        {
            Integer actualResult= findMaximum.findIntegerMax(a,b,c);
            assertEquals(a,actualResult);

            System.out.println("TC 1.1 - Inputs: a = " + a + ", b = " + b + ", c = " + c);
            System.out.println("Maximum value found: " + actualResult);

        }
        else {
            fail("Test data invalid: first number is not the maximum.");
        }

    }

    // TC 1.2: Max at 2nd position
    @Test
    public void findIntegerMaxAtSecondPosition()
    {


        Integer a = 40;
        Integer b = 100;
        Integer c = 9;
        Integer actualResult = findMaximum.findIntegerMax(a, b, c);
        if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {

            assertEquals(b, actualResult);

            System.out.println("TC 1.2 - Inputs: a = " + a + ", b = " + b + ", c = " + c);
            System.out.println("Maximum value found: " + actualResult);

        } else {
            fail("Test data invalid: second number is not the maximum.");
        }

    }
    // TC 1.3: Max at 3rd position
    @Test
    public void findIntegerMaxAtThirdPosition()
    {

        Integer a = 40;
        Integer b = 100;
        Integer c = 900;
        Integer actualResult = findMaximum.findIntegerMax(a, b, c);

        if (c.compareTo(a) > 0 && c.compareTo(b) > 0) {

            assertEquals(c, actualResult);

            System.out.println("TC 1.3 - Inputs: a = " + a + ", b = " + b + ", c = " + c);
            System.out.println("Maximum value found: " + actualResult);

        } else {
            fail("Test data invalid: third number is not the maximum.");
        }

    }

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
        if(a.compareTo(b)>0 && a.compareTo(c)>0)
        {
            Float actualResult= findMaximum.findFloatMax(a,b,c);
            assertEquals(a,actualResult);

            System.out.println("TC 1.1 - Inputs: a = " + a + ", b = " + b + ", c = " + c);
            System.out.println("Maximum value found: " + actualResult);

        }
        else {
            fail("Test data invalid: first number is not the maximum.");
        }

    }

    // TC 1.2: Max at 2nd position
    @Test
    public void findFloatMaxAtSecondPosition()
    {


        Float a = 40f;
        Float b = 100f;
        Float c = 9f;
        Float actualResult = findMaximum.findFloatMax(a, b, c);
        if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {

            assertEquals(b, actualResult);

            System.out.println("TC 1.2 - Inputs: a = " + a + ", b = " + b + ", c = " + c);
            System.out.println("Maximum value found: " + actualResult);

        } else {
            fail("Test data invalid: second number is not the maximum.");
        }

    }
    // TC 1.3: Max at 3rd position
    @Test
    public void findFloatMaxAtThirdPosition()
    {

        Float a = 40f;
        Float b = 100f;
        Float c = 900f;
        Float actualResult = findMaximum.findFloatMax(a, b, c);
        if (c.compareTo(a) > 0 && c.compareTo(b) > 0) {

            assertEquals(c, actualResult);

            System.out.println("TC 1.3 - Inputs: a = " + a + ", b = " + b + ", c = " + c);
            System.out.println("Maximum value found: " + actualResult);
        } else {
            fail("Test data invalid: third number is not the maximum.");
        }

    }
}