package org.effectivejava.examples.ch02.item08;

import java.awt.*;

public class ComposedColorPoint {
    private final Point point;
    private final Color color;

    public ComposedColorPoint(int x, int y, Color c) {
        if (c == null)
            throw new NullPointerException();
        point = new Point(x, y);
        color = c;
    }

    public Point asPoint() {
        return this.point;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof ComposedColorPoint))
            return false;
        else {
            ComposedColorPoint other = (ComposedColorPoint)o;
            return other.point.equals(this.point) && other.color.equals(this.color);
        }
    }
}
