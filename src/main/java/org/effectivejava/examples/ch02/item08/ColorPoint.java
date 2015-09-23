package org.effectivejava.examples.ch02.item08;

import java.awt.*;

public class ColorPoint extends Point {
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x,y);
        this.color = color;
    }

    // Broken - violates symmetry
    // normalPoint.equals(colorPoint) will be true
    // colorPoint.equals(normalPoint) will be false
    @Override public boolean equals(Object o) {
        if (!(o instanceof ColorPoint))
            return false;
        ColorPoint p = (ColorPoint)o;
        return super.equals(o) && color.equals(p.color);
    }

    // violates transitivity
    // This equals method is similar to the method above. It differs in that it performs a
    // colorblind comparison if the other object is not a ColorPoint
    // Normally, this method would be named equals and overriden.
    public boolean equals1(Object o) {
        if (!(o instanceof Point))
            return false;
        if (!(o instanceof ColorPoint)) // meaning it is a point now
            return o.equals(this);
        // perform a colored comparison
        ColorPoint cp = (ColorPoint)o;
        return color.equals(cp.color) && super.equals(cp);
    }
}
