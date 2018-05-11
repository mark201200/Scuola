package com.company;

public class Liceo extends ScuolaMedia {
    public Liceo(String codice, String denominazione, String indirizzo, String citta, int nStudenti, int nClassi, int nSedi, int nLab) {
        super(codice, denominazione, indirizzo, citta, nStudenti, nClassi, nSedi, nLab);
    }

    @Override
    protected int contributoAnnuale() {
        return super.contributoAnnuale() - (9000 * nSedi);
    }
}
