package com.company;

public class TriangoloIsoscele extends FiguraGeometrica {

    public TriangoloIsoscele(double lato1, double lato2, double lato3, double altezza) {
        super(lato1, lato2, lato3, altezza);
    }

    public TriangoloIsoscele() {
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public void calcolaPerimetro() {
        perimetro = lato1 + lato2 + lato3;
    }

    @Override
    public void calcolaArea() {
        area = (lato1 * altezza) / 2;
    }
}
