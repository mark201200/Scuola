package com.company;

public class MotorinoImmatricolato extends Motorino {
    private double maxVelocita;
    private String targa;

    public MotorinoImmatricolato(String colore, double velocita, String tipo, String targa, double maxV) {
        super(colore, velocita, tipo);
        this.targa = targa;
        maxVelocita = maxV;
    }

    public double getMax() {
        return maxVelocita;
    }

    @Override
    public void accelera(double velocita) {
        double s = this.velocita + velocita;
        if (s < maxVelocita)
            super.accelera(velocita);
        else
            super.accelera(maxVelocita-this.velocita);
    }
}
