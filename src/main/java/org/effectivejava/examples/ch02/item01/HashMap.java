package org.effectivejava.examples.ch02.item01;


import java.util.List;
import java.util.Map;

public class HashMap<K, V> {
    // fluff
    public static <K, V> HashMap<K, V> newInstance() {
        return new HashMap<K, V>();
    }
    // fluff
}

// Use this like
// Map<String, List<String>> m = HashMap.newInstance();