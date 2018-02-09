package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ccq = new Scanner(System.in);
        System.out.println("Inserisci un numero N");
        int n = ccq.nextInt();
        long prec = 3, cur = 3;
        for (int i = 1; i <= n; i++) {
            cur = 2 * prec + i;
            prec = cur;
        }
        System.out.println(cur);
    }
}
