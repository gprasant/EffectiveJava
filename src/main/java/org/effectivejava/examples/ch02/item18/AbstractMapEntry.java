package org.effectivejava.examples.ch02.item18;

import java.util.Map;

public abstract class AbstractMapEntry<K, V>
        implements Map.Entry<K,V> {
    public abstract K getKey();

    public abstract V getValue();

    // Entries in modifiable maps must override this method
    public V setValue(V value) {
        throw new UnsupportedOperationException();
    }

    private static boolean equals(Object o1, Object o2) {
        return o1 == null ? o2 == null : o1.equals(o2);
    }

    @Override public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Map.Entry))
            return false;
        Map.Entry<?, ?> arg = (Map.Entry)o;

        return equals(getKey(), arg.getKey()) &&
                equals(getValue(), arg.getValue());
    }

    @Override public int hashCode() {
        return hashCode(getKey()) ^ hashCode(getValue());
    }

    private static int hashCode(Object o) {
        return o == null ? 0 : o.hashCode();
    }

}
