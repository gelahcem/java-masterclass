package com.example.app;

public class Point {

    private int x;
    private int y;


    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * Distance one point to (0,0)
     * @return double 
     */
    public double distance(){
       //return Math.sqrt((this.x * this.x) + ((this.y * this.y)));
       return distance(0,0);
    }

    /**
     * Distance with two parameters (x1,y1) to (x2,y2)
     * @param x
     * @param y
     * @return doube
     */
    public double distance(int x, int y){
        return Math.sqrt((this.x - x)*(this.x - x) + (this.y - y)*(this.y - y));
    }

    /**
     * Distance to another point
     * @param point
     * @return
     */
    public double distance(Point point){
        //return Math.sqrt((this.x - point.x)*(this.x - point.x) + (this.y - point.y)*(this.y - point.y));
        return distance(point.x, point.y);
    }
}