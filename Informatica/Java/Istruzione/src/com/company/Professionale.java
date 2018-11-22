package com.company;

public class Professionale extends Scuola {
    public Professionale(String codice, String denominazione, String indirizzo, String citta, int nStudenti, int nClassi, int nSedi, int nLab) {
        super(codice, denominazione, indirizzo, citta, nStudenti, nClassi, nSedi, nLab);
    }

    @Override
    protected int contributoAnnuale() {
        return (2400 * nClassi) + (3000 * nLab);
    }
}
