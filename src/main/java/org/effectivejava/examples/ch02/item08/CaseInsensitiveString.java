package org.effectivejava.examples.ch02.item08;

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
