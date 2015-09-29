package org.effectivejava.examples.ch02.item12;

/*
    Item12: Implement Comparable interface for value classes
 */

public class PhoneNumber implements Comparable<PhoneNumber>{
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

    private void rangeCheck(int arg, int max, String name) {
        if (arg < 0 || arg > max)
            throw new IllegalArgumentException(name + ": " + arg);
    }

    public int compareTo(PhoneNumber pn) {
        // compare areaCode
        if (areaCode < pn.areaCode)
            return -1;
        else if (areaCode > pn.areaCode)
            return 1;
        // compare prefix
        else if (prefix < pn.prefix)
            return -1;
        else if (prefix > pn.prefix)
            return 1;
        //compare line number
        else if (line < pn.line)
            return -1;
        else if (line > pn.line)
            return 1;

        return 0; // objects are equal
    }

    public int betterCompareTo(PhoneNumber pn) {
        int areaDiff = areaCode - pn.areaCode;
        if (areaDiff != 0)
            return areaDiff;

        int prefixDiff = prefix - pn.prefix;
        if (prefixDiff != 0)
            return prefixDiff;

        // area code and prefix are equal. Compare the lineNumber
        return line - pn.line;
    }
}
