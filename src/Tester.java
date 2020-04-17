public class Tester {
    public static void main(String[] args) {

        Point p1 = new Point(-1, 2);
        Point p2 = new Point(5, 6);
        Point p3 = new Point(-4, -6);
        Point p4 = new Point(3, -1);
        Point p5 = new Point(0, -1);
        Point p6 = new Point(3, 0);
        Point p7 = new Point(0, 0);

        System.out.println("First Quater: " + p1.isInFirstQuater());
        System.out.println("Second Quater: " + p1.isInSecondQuater());
        System.out.println("Third Quater: " + p1.isInThirdQuater());
        System.out.println("Fourth Quater: " + p1.isInFourthQuater());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");

        System.out.println("First Quater: " + p2.isInFirstQuater());
        System.out.println("Second Quater: " + p2.isInSecondQuater());
        System.out.println("Third Quater: " + p2.isInThirdQuater());
        System.out.println("Fourth Quater: " + p2.isInFourthQuater());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");

        System.out.println("First Quater: " + p3.isInFirstQuater());
        System.out.println("Second Quater: " + p3.isInSecondQuater());
        System.out.println("Third Quater: " + p3.isInThirdQuater());
        System.out.println("Fourth Quater: " + p3.isInFourthQuater());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");

        System.out.println("First Quater: " + p4.isInFirstQuater());
        System.out.println("Second Quater: " + p4.isInSecondQuater());
        System.out.println("Third Quater: " + p4.isInThirdQuater());
        System.out.println("Fourth Quater: " + p4.isInFourthQuater());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");

        System.out.println("Is on Y Axis " + p5.isOnYAxis());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Is on X Axis: " + p6.isOnXAxis());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Is in the middle: " + p7.isInMiddleXY());

        //Odcinek
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
        Section section1 = new Section(p1, p2);
        System.out.println(section1.sectionLength());

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
        Section section2 = new Section(p3, p4);
        System.out.println(section2.sectionLength());

        //SectionLength
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
        ThreePoints threePoints = new ThreePoints();
        System.out.println("Section length " + threePoints.sectionLength(section1));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
        //Check if can build traingle
        System.out.println("\nCan build triangle?: " + threePoints.canBuildTriangle(p1, p2, p3));
        System.out.println("\nCan build triangle?: " + threePoints.canBuildTriangle(p1, p2, p4));
        System.out.println("\nCan build triangle?: " + threePoints.canBuildTriangle(p5, p7, p7));
    }

}
