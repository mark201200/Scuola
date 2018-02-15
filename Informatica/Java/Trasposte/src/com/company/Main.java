package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random ccq = new Random();
        int temp=0;
        int r=3;

        int[][] mat = new int[r][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                mat[i][j] = ccq.nextInt(10);
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 0; i < /*non deve andare oltre la meta*/; i++) {
            for (int j = 1; j < 3; j++) {
                temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println("");
        }
    }
}
