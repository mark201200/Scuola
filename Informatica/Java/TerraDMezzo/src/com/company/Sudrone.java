package com.company;

public class Sudrone extends Male {
    public Sudrone(int Esperienza) {
        super(Esperienza);
    }

    @Override
    public void calcolaForza() {
        forza = 40 + (5 * esperienza);
    }
}
