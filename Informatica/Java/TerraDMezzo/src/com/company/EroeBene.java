package com.company;

public class EroeBene extends Bene {
    int energia;

    public EroeBene(int Esperienza, int energia) {
        super(Esperienza);
        this.energia = energia;
    }

    @Override
    public void calcolaForza() {
        forza = ((50 * esperienza) + (50 * energia));
    }
}
