package com.company;

public abstract class Bene {
    protected int esperienza, forza;

    public Bene(int esperienza) {
        this.esperienza = esperienza;
    }

    public abstract void calcolaForza();

    public int getEsperienza() {
        return esperienza;
    }

    public void setEsperienzaforza(int esperienza) {
        this.esperienza = esperienza;
    }

    public int getForza() {
        return forza;
    }

    public void setForza(int forza) {
        this.forza = forza;
    }
}
