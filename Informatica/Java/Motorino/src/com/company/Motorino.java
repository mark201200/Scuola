package com.company;

public class Motorino {
    protected String colore;
    protected double velocita;
    protected String tipo;
    protected boolean antifurto;

    public Motorino(String colore, double velocita, String tipo) {
        this.colore = colore;
        this.velocita = velocita;
        this.tipo = tipo;
        antifurto=false;
    }

    public double getVelocita() {
        return velocita;
    }

    public void accelera(double velocita) {
        if(!antifurto)
        this.velocita = this.velocita+velocita;
    }

    public void inserisciAntifurto() {
        antifurto=true;
    }
}
