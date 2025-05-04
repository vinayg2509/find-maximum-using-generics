package com.bridgelabz.findmaximumusimggenerics;

class FindMaximum<E extends Comparable<E>>
{

    E[] values;

    @SafeVarargs
    FindMaximum(E...values)
    {
        this.values=values;
    }


    public E printMax(E max)
    {
        System.out.println("Maximum value is: " + max);
        return max;
    }


    // Static generic method to find max of variable argumnet
    @SafeVarargs
    public static <E extends Comparable<E>> Comparable<E>findMax(E... values)
    {
        if (values == null || values.length == 0)
        {
            throw new IllegalArgumentException("At least one value required");
        }

       Comparable max = values[0];
        for (Comparable val : values)
        {
            if (val.compareTo(max) > 0)
            {
                max = val;
            }
        }
        return max;

    }
}
