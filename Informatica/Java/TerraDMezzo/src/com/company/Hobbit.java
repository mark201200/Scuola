package com.company;

public class Hobbit extends Bene {
    public Hobbit(int Esperienza) {
        super(Esperienza);
    }

    @Override
    public void calcolaForza() {
        forza = 10 + (3 * esperienza);
    }
}
