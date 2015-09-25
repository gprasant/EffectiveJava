package org.effectivejava.examples.ch02.item09;

import java.util.HashMap;
import java.util.Map;
/*
    Item 9: Always override hashCode when you override equals

    Rules to follow while overriding HashCode()
    1. For the same object, hashCode() should return the same integer if the value fields do not change.
    2. If two objects are equal according to the equals() method, they must return the same hashCode() value
    3. If two objects are not equal, it is not necessary that they return different hashCode() values.
 */
/*
 Algorithm for hashCode() -
    1. Store some constant nonzero value, say, 17, in an int variable called result.
    2. For each significant field f in your object (each field taken into account by the equals method, that is), do the following:
    a. Compute an int hash code c for the field:
    i. If the field is a boolean, compute (f ? 1 : 0).
    ii. If the field is a byte, char, short, or int, compute (int) f.
    iii. Ifthefieldisalong,compute(int)(f^(f>>>32)).
    iv. If the field is a float, compute Float.floatToIntBits(f).
    v. If the field is a double, compute Double.doubleToLongBits(f), and then hash the resulting long as in step 2.a.iii.
    vi. If the field is an object reference and this class’s equals method compares the field by recursively invoking equals, recursively invoke hashCode on the field. If a more complex comparison is required, compute a “canonical representation” for this field and invoke hashCode on the canonical representation. If the value of the field is null, return 0 (or some other constant, but 0 is traditional).
    3. Return result.
    4. When you are finished writing the hashCode method, ask yourself whether equal instances have equal hash codes. Write unit tests to verify your intuition! If equal instances have unequal hash codes, figure out why and fix the problem.
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

    public static void main(String[] args) {
        // PhoneNumber does not have hashCode overridden
        PhoneNumber pn1 = new PhoneNumber(650, 123, 1234);
        PhoneNumber pn2 = new PhoneNumber(650, 123, 1234);

        Map<PhoneNumber, String> map = new HashMap<PhoneNumber,String>();
        map.put(pn1, "me");
        String res = map.get(pn2);
        System.out.println("res : " + res);   // null
        System.out.println("pn1.hashCode() :" + pn1.hashCode()); //1020371697
        System.out.println("pn2.hashCode() :" + pn2.hashCode()); //789451787
    }
}
