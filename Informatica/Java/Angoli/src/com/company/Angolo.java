package com.company;

public class Angolo {
    private int gradi, primi, secondi;

    public Angolo(int g, int p, int s) {
        while (g >= 360) {
            g = g - 360;
        }
        gradi = g;
        while (p >= 60) {
            p = p - 60;
            gradi++;
        }
        primi = p;
        while (s >= 60) {
            s = s - 60;
            primi++;
        }
        secondi = s;
    }

    public void visualizzaAngolo() {
        System.out.println("Angolo: " + gradi + "°" + primi + "'" + secondi + "''");
    }

    public void aggiungiGradi(int g) {
        if (g + gradi < 360) gradi = g + gradi;
    }

    public void aggiungiPrimi(int p) {
        if (p + primi < 60) primi = p + secondi;
    }

    public void aggiungiSecondi(int s) {
        if (s + secondi < 60) secondi = s + secondi;
    }

    public void secondiAngolo(int s) {
        int p = Math.floorDiv(s, 60);
        s = s % 60;
        int g = Math.floorDiv(p, 60);
        p = p % 60;
        gradi = g;
        primi = p;
        secondi = s;
    }

    public int toSecondi() {
        int s = 0;
        s = s + (gradi / 3600) + (primi / 60);
        return s;
    }

    public int differenzaSecondi(Angolo a) {
        return this.toSecondi() - a.toSecondi();
    }

    public void sommaAngolo(Angolo a) {
        gradi += a.gradi;
        primi += a.primi;
        secondi += a.secondi;
        while (gradi >= 360) {
            gradi = gradi - 360;
        }
        while (primi >= 60) {
            primi = primi - 60;
            gradi++;
        }

        while (secondi >= 60) {
            secondi = secondi - 60;
            primi++;
        }

    }
}
