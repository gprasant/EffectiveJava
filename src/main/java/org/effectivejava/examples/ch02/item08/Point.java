package org.effectivejava.examples.ch02.item08;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof Point))
            return false;
        Point other = (Point)o;
        return x == other.x && y == other.y;
    }
}
