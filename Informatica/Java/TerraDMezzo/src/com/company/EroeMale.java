package com.company;

public class EroeMale extends Male {
    int energia;

    public EroeMale(int Esperienza, int energia) {
        super(Esperienza);
        this.energia = energia;
    }

    @Override
    public void calcolaForza() {
        forza = ((50 * esperienza) + (50 * energia));
    }
}
