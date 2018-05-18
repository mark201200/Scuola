package com.company;

public class Nano extends Bene {
    public Nano(int Esperienza) {
        super(Esperienza);
    }

    @Override
    public void calcolaForza() {
        forza = 20 + (4 * esperienza);
    }
}
