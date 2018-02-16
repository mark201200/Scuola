package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] mat = new int[10][10];
        int ct = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                mat[i][j] = ct;
                ct++;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d\t", mat[i][j]);
            }
            System.out.println("");
        }

        mat[0][0] = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                boolean primo = true;
                for (int x = 2; x <= (int) Math.sqrt(mat[i][j]); x++) {
                    if (!primo) break;
                    if (mat[i][j] % x == 0)
                        primo = false;
                }
                if (!primo)
                    mat[i][j] = 0;
            }
        }

        System.out.println("");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (mat[i][j] != 0)
                    System.out.print(mat[i][j] + " ");
            }
        }
    }
}
