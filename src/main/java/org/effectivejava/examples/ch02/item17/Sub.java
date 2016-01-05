package org.effectivejava.examples.ch02.item17;

import java.util.Date;

public class Sub extends Super{
    private final Date date;

    Sub() {
        date = new Date();
        System.out.println("Running sub constructor");
    }

    @Override public void overrideMe() {
        System.out.println(date);
    }

    public static void main(String[] args) {
        Sub s = new Sub();
        s.overrideMe();
    }
}
