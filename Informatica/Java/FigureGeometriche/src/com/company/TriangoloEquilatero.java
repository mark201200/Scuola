package com.company;

public class TriangoloEquilatero extends TriangoloIsoscele {

    public TriangoloEquilatero(double lato1, double altezza) {
        this.lato1 = lato1;
        this.altezza = altezza;
    }

    @Override
    public void calcolaPerimetro() {
        perimetro = lato1 * 3;
    }


}
