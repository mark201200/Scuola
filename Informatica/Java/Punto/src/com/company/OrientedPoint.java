package com.company;

public class OrientedPoint extends Point {
    char d;
    char initD = 'N';

    @Override
    public String toString() {
        return "OrientedPoint{" +
                "d=" + d +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public void giraInitD() {
        if (initD == 'N')
            initD = 'E';
        if (initD == 'E')
            initD = 'S';
        if (initD == 'S')
            initD = 'W';
        if (initD == 'W')
            initD = 'N';
    }

    public void giraPoint() {
        if (d == 'N')
            d = 'E';
        if (d == 'E')
            d = 'S';
        if (d == 'S')
            d = 'W';
        if (d == 'W')
            d = 'N';
    }

    public OrientedPoint(int x, int y, char d) {
        super(x, y);
        this.d = d;
    }

    public OrientedPoint() {
        this.d = initD;
    }

    public OrientedPoint(int x, int y) {
        super(x, y);
        this.d = initD;
    }

    public boolean UguaglianzaPoint(OrientedPoint p1) {
        return (this.x == p1.x) && (this.y == p1.y) && (this.d == p1.d);
    }
}
