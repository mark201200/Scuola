package com.marco;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Marco\\Desktop\\input.txt"));
        String l = reader.readLine();
        int freq = 0;
        boolean first = true;
        ArrayList ar = new ArrayList();
        while (l != null) {
            freq += Integer.parseInt(l);
            if (ar.contains(freq)) break;
            ar.add(freq);
            l = reader.readLine();
            if (l == null) {
                if (first) {
                    System.out.println("Pt.1: " + freq);
                    first = false;
                }
                reader = new BufferedReader(new FileReader("C:\\Users\\Marco\\Desktop\\input.txt"));
                l = reader.readLine();
            }
        }
        System.out.println("Pt.2: "+freq);
    }
}
