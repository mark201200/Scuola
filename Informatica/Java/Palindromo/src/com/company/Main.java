package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean palindromo = false;
        Scanner ccq = new Scanner(System.in);
        String parola = ccq.nextLine();
        for (int i = 0; i < (int) (parola.length() / 2); i++) {
            char l1 = parola.charAt(i);
            char l2 = parola.charAt(parola.length() - i - 1);
            if (l1 == l2)
                palindromo = true;
            else break;
        }
        if (palindromo == true) System.out.println("La parola e' palindroma");
        else System.out.println("La parola NON e' palindroma");

    }
}
