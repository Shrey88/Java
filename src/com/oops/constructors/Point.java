package com.oops.constructors;

public class Point {
    private int x;
    private int y;

    public Point(){
        this(0, 0);
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }


    public double distance(){
        return distance(0, 0);
    }

    // method overloaded
    public double distance(int x, int y){
        return (Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y)));
    }

    // method overloaded
    public double distance(Point other){
        // passing the values of other object to distance method which does the calculation
        return distance(other.x, other.y);
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
