public class ThreePoints {

    public double sectionLength(Section a) {
        return Math.sqrt(Math.pow(a.getB().getX() - a.getA().getX(), 2) + Math.pow(a.getB().getY() - a.getA().getY(), 2));
    }

    double distanceOfSegment(Section segment) {
        return segment.sectionLength();
    }

    public boolean canBuildTriangle(Point p1, Point p2, Point p3) {

        double distA = sectionLength(new Section(p1, p2));
        double distB = sectionLength(new Section(p1, p3));
        double distC = sectionLength(new Section(p2, p3));

        return ((distA < (distB + distC)) && (distB < (distC + distA)) && (distC < (distA + distB)));
    }


}


