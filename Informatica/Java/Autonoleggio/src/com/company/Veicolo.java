package com.company;

public class Veicolo {
    String targa, marca, modello;
    int cilindrata, annoAcquisto, nPosti;

    public Veicolo(String targa, String marca, String modello, int cilindrata, int annoAcquisto, int nPosti) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.annoAcquisto = annoAcquisto;
        this.nPosti = nPosti;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public int getAnnoAcquisto() {
        return annoAcquisto;
    }

    public void setAnnoAcquisto(int annoAcquisto) {
        this.annoAcquisto = annoAcquisto;
    }

    public int getnPosti() {
        return nPosti;
    }

    public void setnPosti(int nPosti) {
        this.nPosti = nPosti;
    }
}
