package com.company;

public abstract class Male {
    protected int esperienza, forza;

    public Male(int esperienza) {
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
