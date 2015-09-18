package org.effectivejava.examples.ch02.item04;

public class UtilityClass {
    // Suppress instantiation with private constructor.
    // This also prevents sub classing of the original class.
    private UtilityClass() {
        throw new AssertionError("Class must not be instantiated");
    }
}
