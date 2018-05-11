package com.company;

public class ScuolaElementare extends Scuola {
    public ScuolaElementare(String codice, String denominazione, String indirizzo, String citta, int nStudenti, int nClassi, int nSedi, int nLab) {
        super(codice, denominazione, indirizzo, citta, nStudenti, nClassi, nSedi, nLab);
    }

    @Override
    protected int contributoAnnuale() {
        return (125 * nStudenti) + (9000 * nSedi);
    }
}
