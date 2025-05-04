package com.bridgelabz.findmaximumusimggenerics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindMaximumTest
{

    @Test
    public void findIntegerMax()
    {
        FindMaximum findMaximum=new FindMaximum(10,40,60);
        Comparable actualResult= findMaximum.testMaximum();
        assertEquals(60,actualResult);
    }

    @Test
    public void findFloatMax()
    {
        FindMaximum findMaximum=new FindMaximum(10.88f,40.0f,60.8f);
        Comparable actualResult= findMaximum.testMaximum();
        assertEquals(60.8f,actualResult);
    }

    @Test
    public void findStringMax()
    {
        String a="apple";
        String b="Apple";
        String c="banana";
        FindMaximum findMaximum=new FindMaximum(a,b,c);
        Comparable actualResult= findMaximum.testMaximum();
        assertEquals(c,actualResult);
    }

    // TC 1.1: Max at 1st position
    @Test
    public void findIntegerMaxAtFirstPosition()
    {
        Integer a=400;
        Integer b=00;
        Integer c=90;
        FindMaximum findMaximum=new FindMaximum(a,b,c);
        Comparable actualResult= findMaximum.testMaximum();
        assertEquals(a,actualResult,"Test data invalid: first number is not the maximum.");
    }

    // TC 1.2: Max at 2nd position
    @Test
    public void findIntegerMaxAtSecondPosition()
    {
        Integer a=400;
        Integer b=1000;
        Integer c=90;
        FindMaximum findMaximum=new FindMaximum(a,b,c);
        Comparable actualResult= findMaximum.testMaximum();
        assertEquals(b,actualResult,"Test data invalid: second number is not the maximum.");
    }
    // TC 1.3: Max at 3rd position
    @Test
    public void findIntegerMaxAtThirdPosition()
    {
        Integer a = 40;
        Integer b = 100;
        Integer c = 900;
        FindMaximum findMaximum=new FindMaximum(a,b,c);
        Comparable actualResult= findMaximum.testMaximum();
        assertEquals(c,actualResult,"Test data invalid: third number is not the maximum.");
    }

    // TC 1.1: Max at 1st position
    @Test
    public void findFloatMaxAtFirstPosition()
    {
        Float a=400.0f;
        Float b=00.5f;
        Float c=90.f;
        FindMaximum findMaximum=new FindMaximum(a,b,c);
        Comparable actualResult= findMaximum.testMaximum();
        assertEquals(a,actualResult,"Test data invalid: first number is not the maximum.");
    }

    // TC 1.2: Max at 2nd position
    @Test
    public void findFloatMaxAtSecondPosition()
    {
        Float a = 40f;
        Float b = 100f;
        Float c = 9f;
        FindMaximum findMaximum=new FindMaximum(a,b,c);
        Comparable actualResult= findMaximum.testMaximum();
        assertEquals(b,actualResult,"Test data invalid: second number is not the maximum.");

    }
    // TC 1.3: Max at 3rd position
    @Test
    public void findFloatMaxAtThirdPosition()
    {

        Float a = 40f;
        Float b = 100f;
        Float c = 900f;
        FindMaximum findMaximum=new FindMaximum(a,b,c);
        Comparable actualResult= findMaximum.testMaximum();
        assertEquals(c,actualResult,"Test data invalid: third number is not the maximum.");

    }

    //TC 1.1 Max in first position
    @Test
    public  void findStringMaxAtFirstPosition()
    {
        String a="banana";
        String b="Apple";
        String c="apple";
        FindMaximum findMaximum=new FindMaximum(a,b,c);
        Comparable actualResult= findMaximum.testMaximum();
        assertEquals(a,actualResult,"Test data invalid: first string  is not the maximum string");
    }

    //TC 1.2 Max in second position
    @Test
    public  void findStringMaxAtSecondPosition()
    {
        String a="banana";
        String b="peach";
        String c="apple";
        FindMaximum findMaximum=new FindMaximum(a,b,c);
        Comparable actualResult= findMaximum.testMaximum();
        assertEquals(b,actualResult,"Test data invalid: second string  is not the maximum string");
    }

    //TC 1.3 Max in third position
    @Test
    public  void findStringMaxAtThirdPosition()
    {
        String a="banana";
        String b="peach";
        String c="strawberry";
        FindMaximum findMaximum=new FindMaximum(a,b,c);
        Comparable actualResult= findMaximum.testMaximum();
        assertEquals(c,actualResult,"Test data invalid: third string  is not the maximum string");
    }
}