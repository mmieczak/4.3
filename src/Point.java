public class Point {
    private int x;
    private int y;

    Point() {
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isInFirstQuater() {
        return (x > 0 && y > 0);
    }

    public boolean isInSecondQuater() {
        return (x < 0 && y > 0);
    }

    public boolean isInThirdQuater() {
        return (x < 0 && y < 0);
    }

    public boolean isOnXAxis() {
        return (y == 0);
    }

    public boolean isOnYAxis() {
        return (x == 0);
    }

    public boolean isInMiddleXY() {
        return (x == 0 && y == 0);
    }

    public boolean isInFourthQuater() {
        return (x > 0 && y < 0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
