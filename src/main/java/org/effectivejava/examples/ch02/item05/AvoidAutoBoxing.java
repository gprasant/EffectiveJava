package org.effectivejava.examples.ch02.item05;

public class AvoidAutoBoxing {

    public static void main(String[] args) {
        long sum = 0L; // If this was declared as Long, there would be severe perf problems.
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
