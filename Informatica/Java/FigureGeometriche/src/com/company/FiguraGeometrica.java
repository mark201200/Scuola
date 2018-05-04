package com.company;

abstract public class FiguraGeometrica {
    protected double lato1, lato2, lato3, perimetro, area, altezza;

    public FiguraGeometrica(double lato1, double lato2, double lato3, double altezza) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
        this.altezza = altezza;
    }

    protected FiguraGeometrica() {
    }

    abstract public void calcolaPerimetro();

    abstract public void calcolaArea();

    public double getLato1() {
        return lato1;
    }

    public void setLato1(double lato1) {
        this.lato1 = lato1;
    }

    public double getLato2() {
        return lato2;
    }

    public void setLato2(double lato2) {
        this.lato2 = lato2;
    }

    public double getLato3() {
        return lato3;
    }

    public void setLato3(double lato3) {
        this.lato3 = lato3;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
