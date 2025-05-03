package com.bridgelabz.findmaximumusimggenerics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaximumTest
{

    FindMaximum findMaximum= new FindMaximum();

    //Method to find Max string
    @Test
    public  void findStringMax()
    {
       String actualResult= findMaximum.findStringMax("Dog","Cat","doll");
       assertEquals("doll",actualResult);
    }

    //TC 1.1 Max in first position
    @Test
    public  void findStringMaxAtFirstPosition()
    {
        String s1="banana";
        String s2="Apple";
        String s3="apple";
        String actualResult=findMaximum.findStringMax(s1,s2,s3);
        assertEquals(s1,actualResult,"Test data invalid: first string  is not the maximum string");
    }

    //TC 1.2 Max in second position
    @Test
    public  void findStringMaxAtSecondPosition()
    {
        String s1="Dog";
        String s2="dog";
        String s3="App";
        String actualResult=findMaximum.findStringMax(s1,s2,s3);
        assertEquals(s2,actualResult,"Test data invalid: second string  is not the maximum string");

    }

    //TC 1.3 Max in third position
    @Test
    public  void findStringMaxAtThirdPosition()
    {
        String s1="apple";
        String s2="banana";
        String s3="peach";
        String actualResult=findMaximum.findStringMax(s1,s2,s3);
        assertEquals(s3,actualResult,"Test data invalid: third string  is not the maximum string");
    }
}