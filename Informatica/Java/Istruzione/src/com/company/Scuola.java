package com.company;

public abstract class Scuola {
    protected String codice, denominazione, indirizzo, citta;
    protected int nStudenti, nClassi, nSedi, nLab;

    public Scuola(String codice, String denominazione, String indirizzo, String citta, int nStudenti, int nClassi, int nSedi, int nLab) {
        this.codice = codice;
        this.denominazione = denominazione;
        this.indirizzo = indirizzo;
        this.citta = citta;
        this.nStudenti = nStudenti;
        this.nClassi = nClassi;
        this.nSedi = nSedi;
        this.nLab = nLab;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public int getnStudenti() {
        return nStudenti;
    }

    public void setnStudenti(int nStudenti) {
        this.nStudenti = nStudenti;
    }

    public int getnClassi() {
        return nClassi;
    }

    public void setnClassi(int nClassi) {
        this.nClassi = nClassi;
    }

    public int getnSedi() {
        return nSedi;
    }

    public void setnSedi(int nSedi) {
        this.nSedi = nSedi;
    }

    public int getnLab() {
        return nLab;
    }

    public void setnLab(int nLab) {
        this.nLab = nLab;
    }

    protected abstract int contributoAnnuale();

}
