package org.effectivejava.examples.ch02.Item16;

import java.util.Collection;
import java.util.HashSet;
/*
 *   Item 16: Favor composition over inheritance
 */
public class InstrumentedHashSet<E> extends HashSet<E> {
    private int addCount = 0;

    public InstrumentedHashSet() {
        super();
    }

    public InstrumentedHashSet(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    @Override public boolean add(E item) {
        addCount++;
        return super.add(item);
    }

    // this wont work. adding iHS.addAll(Arrays.asList("a", "b", "c"));
    // results in the count being 6 instead of 3. This is because addAll() internally calls add()
    @Override public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
