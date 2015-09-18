package org.effectivejava.examples.ch02.item05;

public class AvoidAutoBoxing {

    public static void main(String[] args) {
        long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
