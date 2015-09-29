package org.effectivejava.examples.ch02.item12;

public class CaseInsensitiveString implements Comparable<CaseInsensitiveString>{
    private String s;

    public int compareTo(CaseInsensitiveString cis) {
        return String.CASE_INSENSITIVE_ORDER.compare(s, cis.s);
    }
}
