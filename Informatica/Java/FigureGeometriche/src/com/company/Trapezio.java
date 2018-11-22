package com.company;
/*

        lato3
       ----------
 lato3/          \lato4
     /            \
      -------------
       lato1

 */
public class Trapezio extends FiguraGeometrica {
    protected double lato4;

    public Trapezio(double lato1, double lato2, double lato3, double lato4, double altezza) {
        super(lato1, lato2, lato3, altezza);
        this.lato4 = lato4;
    }

    @Override
    public void calcolaPerimetro() {
        perimetro = lato1 + lato2 + lato3 + lato4;
    }

    @Override
    public void calcolaArea() {
        area=((lato1+lato3)*altezza)/2;
    }
}
