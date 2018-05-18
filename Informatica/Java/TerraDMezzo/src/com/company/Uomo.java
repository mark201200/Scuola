package com.company;

public class Uomo extends Bene {
    public Uomo(int Esperienza) {
        super(Esperienza);
    }

    @Override
    public void calcolaForza() {
        forza = 30 + (6 * esperienza);
    }
}
