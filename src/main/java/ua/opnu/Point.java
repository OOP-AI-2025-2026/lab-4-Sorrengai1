package ua.opnu;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }
    public Point(final Point p) {
        this(p.x, p.y);
    }
    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
    public double distance(final Point p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public final int getX() {
        return x;
    }
    public final int getY() {
        return y;
    }
    public void setLocation(final int x, final int y) {
        this.x = x;
        this.y = y;
    }
    public void setX(final int x) {
        this.x = x;
    }
    public void setY(final int y) {
        this.y = y;
    }
}
