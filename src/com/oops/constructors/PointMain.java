package com.oops.constructors;

public class PointMain {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        System.out.println("distance(0, 0) = " + first.distance());

        Point second = new Point(3, 1);
        System.out.println("distance(second) = " + first.distance(second));

        System.out.println("distance(2,2) = " + first.distance(2, 2));

        Point point = new Point();
        System.out.println("distance() = " + point.distance());
    }
}
