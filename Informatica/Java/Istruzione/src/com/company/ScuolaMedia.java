package com.company;

public class ScuolaMedia extends Scuola {
    public ScuolaMedia(String codice, String denominazione, String indirizzo, String citta, int nStudenti, int nClassi, int nSedi, int nLab) {
        super(codice, denominazione, indirizzo, citta, nStudenti, nClassi, nSedi, nLab);
    }

    @Override
    protected int contributoAnnuale() {
        return (150 * nStudenti) + (1100 * nLab) + (9000 * nSedi);
    }
}
