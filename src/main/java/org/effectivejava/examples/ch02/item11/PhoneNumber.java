package org.effectivejava.examples.ch02.item11;

import java.util.HashMap;
import java.util.Map;
/*
    Item11: Override clone judiciously
 */

public class PhoneNumber {
    private final short areaCode;
    private final short prefix;
    private final short line;

    public PhoneNumber(int area, int prefix, int line) {
        rangeCheck(area, 999, "area code");
        rangeCheck(prefix, 999, "prefix");
        rangeCheck(prefix, 9999, "line");
        this.areaCode = (short) area;
        this.prefix = (short) prefix;
        this.line = (short) line;
    }

    public short getAreaCode() { return areaCode; }
    public short getPrefix() { return prefix; }
    public short getLine() { return line; }

    private void rangeCheck(int arg, int max, String name) {
        if (arg < 0 || arg > max)
            throw new IllegalArgumentException(name + ": " + arg);
    }

    @Override public boolean equals(Object o) {
        if(o == this)
            return true;
        else if (!(o instanceof PhoneNumber))
            return false;
        PhoneNumber pn = (PhoneNumber)o;

        return this.areaCode == pn.areaCode
                && this.prefix == pn.prefix
                && this.line   == pn.line;
    }

    private volatile int hashCode;
    @Override public int hashCode() {
        int result = hashCode;

        if (result == 0) {
            result = 17;
            result = 31 * result + areaCode;
            result = 31 * result + prefix;
            result = 31 * result + line;
            hashCode = result;
        }
        return result;
    }

    @Override public String toString() {
        return String.format("(%03d) %03d-%04d", areaCode, prefix, line);
    }

    @Override public PhoneNumber clone() {
        try {
            return (PhoneNumber) super.clone();
        } catch(CloneNotSupportedException ex) {
            throw new AssertionError();
        }
    }
}
