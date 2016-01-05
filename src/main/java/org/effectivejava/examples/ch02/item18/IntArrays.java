package org.effectivejava.examples.ch02.item18;

import java.util.AbstractList;
import java.util.Collections;
import java.util.List;

public class IntArrays {
    static List<Integer> intArrayAsList(final int[] a) {
        if (a == null)
            throw new NullPointerException();

        return new AbstractList<Integer>() {
            @Override
            public Integer get(int index) {
                return a[index];
            }

            @Override
            public Integer set(int index, Integer element) {
                Integer x = a[index];
                a[index] = element;
                return x;
            }

            @Override
            public int size() {
                return a.length;
            }
        };
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i;

        List<Integer> list = intArrayAsList(numbers);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
