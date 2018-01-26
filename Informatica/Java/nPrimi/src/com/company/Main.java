package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ccq = new Scanner(System.in);
        System.out.println("Inserisci un numero per mostrarne i divisori.");
        int i = ccq.nextInt(),nd=0;
        System.out.print("Divisori "+i+" = 1 , ");
       for(int j=2;j<=i/2;j++){
           if(i%j==0){
               System.out.print(j+" , ");
               nd++;
           }
       }
       System.out.println(i);
       if(nd==0) System.out.println("Il Numero e' primo.");
    }
}