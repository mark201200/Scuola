package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean valido = true;
        Scanner ccq = new Scanner(System.in);
        System.out.println("Inserisci il numero");
        String numero = ccq.nextLine();
        if (numero.charAt(0) != '0') {
            valido = false;
        }

        if (valido) {
            for (int i = 2; i < 4; i++) {
                if ((Character.getNumericValue(numero.charAt(i)) < 1) || (Character.getNumericValue(numero.charAt(i)) > 4)) {
                    valido = false;
                    break;
                }
            }
            if (numero.charAt(4) == '0') {
                valido = false;
            }
        }

        if(valido) System.out.println("Numero valido!");
        else System.out.println("Numero NON valido!");

    }
}
