package com.bridgelabz.findmaximumusimggenerics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaximumTest
{

    FindMaximum findMaximum= new FindMaximum();

    //Method to find Max string
    @Test
    public  void findIntegerMax()
    {
       Comparable actualResult=  findMaximum.findGenericsMax(100,400,300);
       assertEquals(400,actualResult);
    }

    @Test
    public  void findFloatMax()
    {
        Comparable actualResult= findMaximum.findGenericsMax(100.0f,400.8f,300.7f);
        assertEquals(400.8f,actualResult);
    }

    @Test
    public  void findStringMax()
    {
        Comparable actualResult= findMaximum.findGenericsMax("100","200","300");
        assertEquals("300",actualResult);
    }

    // TC 1.1: Max at 1st position
    @Test
    public void findIntegerMaxAtFirstPosition()
    {
        Integer a=400;
        Integer b=00;
        Integer c=90;
        Comparable actualResult= findMaximum.findGenericsMax(a,b,c);
        assertEquals(a,actualResult,"Test data invalid: first number is not the maximum.");
    }

    // TC 1.2: Max at 2nd position
    @Test
    public void findIntegerMaxAtSecondPosition()
    {
        Integer a = 40;
        Integer b = 100;
        Integer c = 9;
        Comparable actualResult = findMaximum.findGenericsMax(a, b, c);
        assertEquals(b,actualResult,"Test data invalid: second number is not the maximum.");
    }
    // TC 1.3: Max at 3rd position
    @Test
    public void findIntegerMaxAtThirdPosition()
    {
        Integer a = 40;
        Integer b = 100;
        Integer c = 900;
        Comparable actualResult = findMaximum.findGenericsMax(a, b, c);
        assertEquals(c,actualResult,"Test data invalid: third number is not the maximum.");
    }

    // TC 1.1: Max at 1st position
    @Test
    public void findFloatMaxAtFirstPosition()
    {
        Float a=400.0f;
        Float b=00.5f;
        Float c=90.f;
        Comparable actualResult= findMaximum.findGenericsMax(a,b,c);
        assertEquals(a,actualResult,"Test data invalid: first number is not the maximum.");
    }

    // TC 1.2: Max at 2nd position
    @Test
    public void findFloatMaxAtSecondPosition()
    {


        Float a = 40f;
        Float b = 100f;
        Float c = 9f;
        Comparable actualResult = findMaximum.findGenericsMax(a, b, c);
        assertEquals(b,actualResult,"Test data invalid: second number is not the maximum.");

    }
    // TC 1.3: Max at 3rd position
    @Test
    public void findFloatMaxAtThirdPosition()
    {

        Float a = 40f;
        Float b = 100f;
        Float c = 900f;
        Comparable actualResult = findMaximum.findGenericsMax(a, b, c);
        assertEquals(c,actualResult,"Test data invalid: third number is not the maximum.");

    }

    //TC 1.1 Max in first position
    @Test
    public  void findStringMaxAtFirstPosition()
    {
        String s1="banana";
        String s2="Apple";
        String s3="apple";
        Comparable actualResult=findMaximum.findGenericsMax(s1,s2,s3);
        assertEquals(s1,actualResult,"Test data invalid: first string  is not the maximum string");
    }

    //TC 1.2 Max in second position
    @Test
    public  void findStringMaxAtSecondPosition()
    {
        String s1="Dog";
        String s2="dog";
        String s3="App";
        Comparable actualResult=findMaximum.findGenericsMax(s1,s2,s3);
        assertEquals(s2,actualResult,"Test data invalid: second string  is not the maximum string");

    }

    //TC 1.3 Max in third position
    @Test
    public  void findStringMaxAtThirdPosition()
    {
        String s1="apple";
        String s2="banana";
        String s3="peach";
        Comparable actualResult=findMaximum.findGenericsMax(s1,s2,s3);
        assertEquals(s3,actualResult,"Test data invalid: third string  is not the maximum string");
    }

}