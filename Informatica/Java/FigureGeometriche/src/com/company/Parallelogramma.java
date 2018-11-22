package com.company;

public class Parallelogramma extends Trapezio {
    public Parallelogramma(double lato1, double lato2, double lato3, double lato4, double altezza) {
        super(lato1, lato2, lato3, lato4, altezza);
    }

    @Override
    public void calcolaArea() {
        area = lato1 * altezza;
    }
}
