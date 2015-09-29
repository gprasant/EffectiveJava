package org.effectivejava.examples.ch02.item12;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Wordlist {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>();
        Collections.addAll(words, args);

        System.out.println(words);
    }
}
