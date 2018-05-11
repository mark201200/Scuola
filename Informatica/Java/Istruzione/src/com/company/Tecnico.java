package com.company;

public class Tecnico extends Scuola {
    public Tecnico(String codice, String denominazione, String indirizzo, String citta, int nStudenti, int nClassi, int nSedi, int nLab) {
        super(codice, denominazione, indirizzo, citta, nStudenti, nClassi, nSedi, nLab);
    }

    @Override
    protected int contributoAnnuale() {
        return (3500 * nClassi) + (6000 * nLab);
    }
}
