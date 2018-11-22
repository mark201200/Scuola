package com.company;

public class Urukhai extends Male {
    public Urukhai(int Esperienza) {
        super(Esperienza);
    }

    @Override
    public void calcolaForza() {
        forza = 50 + (5 * esperienza);
    }
}
