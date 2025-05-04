package com.bridgelabz.findmaximumusimggenerics;

import java.util.Arrays;
import java.util.Optional;

import static java.time.chrono.JapaneseEra.values;

class FindMaximum<E extends Comparable<E>>
{

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
