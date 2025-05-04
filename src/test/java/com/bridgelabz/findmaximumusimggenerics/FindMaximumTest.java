package com.bridgelabz.findmaximumusimggenerics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindMaximumTest
{

    @Test
    public void findIntegerMax()
    {
        Comparable actualResult= FindMaximum.findMax(10,20,30,40,650,40,60);
        assertEquals(650,actualResult);

    }

    @Test
    public void findFloatMax()
    {
        Comparable actualResult= FindMaximum.findMax(10.9f,20.97f,55.4f,56.4f);
        assertEquals(56.4f,actualResult);
    }

    @Test
    public void findStringMax()
    {
        Comparable actualResult= FindMaximum.findMax("Apple","apple","Banana","Peach","peach");
        assertEquals("peach",actualResult);
    }

}