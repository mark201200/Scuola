package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random ccq = new Random();
        Scanner ccq1 = new Scanner(System.in);
        int temp;
        System.out.println("Inserisci grandezza matrice");
        int r = ccq1.nextInt();
        int[][] mat = new int[r][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                mat[i][j] = ccq.nextInt(10);
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 0; i < r - 1; i++) {
            for (int j = i + 1; j < r; j++) {
                temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println("");
        }
    }
}
