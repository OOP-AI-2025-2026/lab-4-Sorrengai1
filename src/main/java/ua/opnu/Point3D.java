package ua.opnu;

public class Point3D extends Point {
    private int z;

    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(final int x, final int y, final int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setLocation(final int x, final int y, final int z) {
        super.setLocation(x, y);
        this.z = z;
    }

    @Override
    public double distanceFromOrigin() {
        int x = getX();
        int y = getY();
        return Math.sqrt(x * x + y * y + this.z * this.z);
    }

    @Override
    public double distance(final Point p) {
        int dx = this.getX() - p.getX();
        int dy = this.getY() - p.getY();
        if (p instanceof Point3D) {
            Point3D p3d = (Point3D) p;
            int dz = this.z - p3d.getZ();
            return Math.sqrt(dx * dx + dy * dy + dz * dz);
        } else {
            return Math.sqrt(dx * dx + dy * dy);
        }
    }

    public double distance(final Point3D p) {
        int dx = this.getX() - p.getX();
        int dy = this.getY() - p.getY();
        int dz = this.z - p.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + this.z + ")";
    }
}
