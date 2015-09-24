package org.effectivejava.examples.ch02.item08;

import org.effectivejava.examples.ch02.item01.HashMap;

import java.util.HashSet;
import java.util.Set;


public class Circle {
    private static final Set<Point> unitCircle; // should be declared as static. But not done so because it is defined in an inner class.

    static {
        unitCircle = new HashSet<Point>();
        unitCircle.add(new Point(1,0));
        unitCircle.add(new Point(0,1));
        unitCircle.add(new Point(-1,0));
        unitCircle.add(new Point(0,-1));
    }

    public static boolean onUnitCircle(Point p) {
        return unitCircle.contains(p);
    }
}

