package org.effectivejava.examples.ch02.Item16;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        InstrumentedSet<Integer> s = new InstrumentedSet<Integer>(new HashSet());
        s.add(1);
        s.add(2);
        s.addAll(Arrays.asList(3, 4));
        System.out.println(s.getAddCount());

        InstrumentedHashSet<Integer> s2 = new InstrumentedHashSet<Integer>();
        s2.add(1);
        s2.add(2);
        s2.addAll(Arrays.asList(3, 4));
        System.out.println(s.getAddCount());
    }
}
