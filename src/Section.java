public class Section {
    private Point a;
    private Point b;

    Section() {
    }

    Section(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public double sectionLength() {
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }
}
