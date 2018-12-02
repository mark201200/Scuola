package com.marco;

import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Marco\\Desktop\\input.txt"));
        ArrayList a = new ArrayList();
        String l = reader.readLine();
        int occ2 = 0;
        int occ3 = 0;
        int occ = 1;
        boolean counted2 = false;
        boolean counted3 = false;
        while (l != null) {
            for (int i = 0; i < l.length(); i++) {
                if (!(a.contains(l.charAt(i)))) {
                    for (int ii = i + 1; ii < l.length(); ii++) {
                        if (l.charAt(i) == l.charAt(ii)) occ++;
                    }
                    if (occ == 2 && !counted2) {
                        occ2++;
                        counted2 = true;
                    }
                    if (occ == 3 && !counted3) {
                        occ3++;
                        counted3 = true;
                    }
                    a.add(l.charAt(i));
                    occ = 1;
                }
            }
            counted2 = false;
            counted3 = false;
            l = reader.readLine();
            a.clear();
        }
        int res = occ2 * occ3;
        System.out.println(res);
    }
}
