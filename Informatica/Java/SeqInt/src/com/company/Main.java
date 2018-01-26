package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner ccq = new Scanner(System.in);
        System.out.println("Inserisci dei numeri. 0 per fermarti.");
        int i = 1, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sp = 0, sd = 0, st;
        while (i != 0) {
            i = ccq.nextInt();
            if(i!=0) {
                if (i < min) min = i;
                if (i > max) max = i;
                if (i % 2 == 0) sp = sp + i;
                else sd = sd + i;
            }
        }
        st = sd + sp;
        System.out.println("Numero massimo=" + max + " Numero minimo=" + min + " Somma pari=" + sp + " Somma dispari=" + sd + " Somma totale" + st);

    }
}
