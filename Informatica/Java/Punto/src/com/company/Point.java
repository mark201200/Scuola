package com.company;

public class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void SpostaPoint(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public double DistanzaPoint(Point p1) {
        return (Math.sqrt(Math.pow(p1.x - this.x, 2) + Math.pow(p1.y - this.y, 2)));
    }

    public double DistanzaOriginePoint() {
        return (Math.sqrt(Math.pow(0 - this.x, 2) + Math.pow(0 - this.y, 2)));
    }

    public double DistanzaOriginePoint(Point p1) {
        return (Math.sqrt(Math.pow(0 - p1.x, 2) + Math.pow(0 - p1.y, 2)));
    }

    public boolean VicinanzaOriginePoint(Point p1) {
        return this.DistanzaOriginePoint() > this.DistanzaOriginePoint(p1);
    }

    public boolean UguaglianzaPoint(Point p1) {
        return (this.x == p1.x) && (this.y == p1.y);
    }

}
