package org.effectivejava.examples.ch02.item17;
// Item 17: Design and document for inheritance
// Do not call overridable methods from constructors of inheritable classes
public class Super {
    public Super() {
        overrideMe();
        System.out.println("Running super constructor");
    }
    public void overrideMe() {}
}
