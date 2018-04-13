package com.company;

public class CD {
    String titolo, autore;
    int numBrani, durata;

    public CD(String titolo, String autore, int numBrani, int durata) {
        this.titolo = titolo;
        this.autore = autore;
        this.numBrani = numBrani;
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getNumBrani() {
        return numBrani;
    }

    public void setNumBrani(int numBrani) {
        this.numBrani = numBrani;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void compareDurata(CD cd1) {
        if (this.durata < cd1.durata) {
            System.out.println(cd1.titolo + "e' piu' lungo di" + this.titolo);
        } else if (this.durata > cd1.durata) {
            System.out.println(this.titolo + "e' piu' lungo di" + cd1.titolo);
        } else System.out.println("I CD hanno uguale durata");
    }

    @Override
    public String toString() {
        return "CD{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", numBrani=" + numBrani +
                ", durata=" + durata +
                '}';
    }
}
