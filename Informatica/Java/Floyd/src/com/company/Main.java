package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int c=1;
        Scanner ccq = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int n = ccq.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println("");

        }
    }
}
