package com.bridgelabz.findmaximumusimggenerics;

class FindMaximum<E extends Comparable<E>> {

    E a, b, c;

     FindMaximum(E a, E b, E c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Instance method that uses static generic method
    public E testMaximum() {
        return FindMaximum.findMax(a, b, c);
    }

    // Static generic method to find max of 3 values
    public static <E extends Comparable<E>> E findMax(E a, E b, E c) {
        E max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
}
