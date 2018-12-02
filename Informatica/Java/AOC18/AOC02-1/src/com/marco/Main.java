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
        boolean c2 = false;
        boolean c3 = false;
        while (l != null) {
            for (int i = 0; i < l.length(); i++) {
                if (!(a.contains(l.charAt(i)))) {
                    for (int ii = i + 1; ii < l.length(); ii++) {
                        if (l.charAt(i) == l.charAt(ii)) occ++;
                    }
                    if (occ == 2 && !c2) {
                        occ2++;
                        c2 = true;
                    }
                    if (occ == 3 && !c3) {
                        occ3++;
                        c3 = true;
                    }
                    a.add(l.charAt(i));
                    occ = 1;
                }
            }
            c2 = false;
            c3 = false;
            l = reader.readLine();
            a.clear();
        }
        System.out.println(occ2 * occ3);
    }
}
