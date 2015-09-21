package org.effectivejava.examples.ch02.item06;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }


//    This version of pop has a memory leak because it does not null out the currently popped element.
//    public Object pop (){
//        if(size == 0) {
//            throw new EmptyStackException();
//        }
//        return elements[--size];
//    }

    public Object pop (){
        if(size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }


    private void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
