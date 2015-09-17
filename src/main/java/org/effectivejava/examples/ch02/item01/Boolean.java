package org.effectivejava.examples.ch02.item01;

/**
 * Created by pguruprasad on 9/16/15.
 */
public class Boolean {
    private static Boolean TRUE;
    private static Boolean FALSE;

    // Other Stuff
    public static Boolean valueOf(boolean b) {
        return b? Boolean.TRUE : Boolean.FALSE;
    }
    // Other Stuff
}
