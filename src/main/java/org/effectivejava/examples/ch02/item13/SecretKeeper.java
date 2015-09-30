package org.effectivejava.examples.ch02.item13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecretKeeper {
    // Item 13: Minimize the accessibility of classes and members

    // potential security hole - because non zero length arrays are mutable.
    public static final Integer[] INTS = {1, 2};

    //method 1:with the field as private, expose a public unModifiableList
    public static final List<Integer> VALUES = Collections.unmodifiableList(Arrays.asList(INTS));
}
