package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int credito, puntata;
        Random ccq1 = new Random();
        Scanner ccq = new Scanner(System.in);
        System.out.println("Inserisci il credito");
        credito = ccq.nextInt();
        for (int i = 0; i < 10 && credito != 0; i++) {
            do {
                System.out.println("Inserisci la tua puntata");
                puntata = ccq.nextInt();
            } while (puntata > credito);
            if (ccq1.nextBoolean()) {
                credito *= 2;
                System.out.println("Hai vinto! Il tuo credito e' " + credito);
            } else {
                credito -= puntata;
                System.out.println("Hai perso :( Il tuo credito e' " + credito);
            }
        }
        if (credito <= 0) System.out.println("Hai finito i soldi :(");
        else System.out.println("Hai completato le 10 giocate! Il tuo credito e' " + credito);
    }
}
