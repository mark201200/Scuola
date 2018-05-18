package com.company;

public class Elfo extends Bene {
    public Elfo(int Esperienza) {
        super(Esperienza);
    }

    @Override
    public void calcolaForza() {
        if (esperienza < 5)
            forza = 20 + (3 * esperienza);
        else
            forza = 80 + (2 * esperienza);
    }
}
