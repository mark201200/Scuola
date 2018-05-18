package com.company;

public class Orco extends Male {
    public Orco(int Esperienza) {
        super(Esperienza);
    }

    @Override
    public void calcolaForza() {
        if (esperienza < 5)
            forza = 30 + (2 * esperienza);
        else
            forza = 70 + (3 * esperienza);
    }
}
