package com.satya;

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

    public double distance(){
        return Math.sqrt(Math.pow(this.x - 0.0 , 2) + Math.pow(this.y - 0.0 , 2));
    }

    public double distance(int a, int b){
        return Math.sqrt(Math.pow(this.x - a , 2) + Math.pow(this.y - b , 2));
    }

    public double distance(Point P){
        return Math.sqrt(Math.pow(getX() - P.getX() , 2) + Math.pow(getY() - P.getY() , 2));
    }
}
