package org.effectivejava.examples.ch02.item08;
/*
    Obey the following principles when overriding equals

    Reflexivity - an object is equal to itself
    Symmetry    - if a.equals(b) then b.equals(a) should be true
    transitivity - if a.equals(b), and b.equals(c) then
        a.equals(c) should be true
    consistency - if two objects are equal, they must stay equal
        unless one (or both) of them is modified
    non-nullity - a.equals(null) should be false
 */
public final class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        if(s == null) {
            throw new NullPointerException();
        }
        this.s = s;
    }

    @Override // Broken - violates symmetry !
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString)
            return s.equalsIgnoreCase( ((CaseInsensitiveString) o).s );
        if (o instanceof String) //one-way interoperability!
            return s.equalsIgnoreCase((String) o);
        return false;
    }
}
