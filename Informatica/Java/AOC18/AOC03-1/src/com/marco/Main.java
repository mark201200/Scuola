package com.marco;
import java.io.*;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Marco\\Desktop\\input.txt"));
        Pattern p = Pattern.compile("\\#(\\d+) \\@ (\\d+)\\,(\\d+)\\: (\\d+)x(\\d+)");
        String l = reader.readLine();
        int[][] a = new int[1100][1100];
        int c = 0;
        boolean overlaps;
        for (int part = 1; part <= 2; part++) {
            while (l != null) {
                Matcher m = p.matcher(l);
                m.find();
                int n = Integer.parseInt(m.group(1));
                int x = Integer.parseInt(m.group(2));
                int y = Integer.parseInt(m.group(3));
                int w = Integer.parseInt(m.group(4));
                int h = Integer.parseInt(m.group(5));
                overlaps = false;
                for (int ii = x; ii < x + w; ii++) {
                    for (int i = y; i < y + h; i++) {
                        if (part == 1) {
                            if (a[ii][i] == 0)
                                a[ii][i] = n;
                            else if (a[ii][i] != 0 && a[ii][i] != 9999) {
                                a[ii][i] = 9999;
                                c++;
                            }
                        } else {
                            if (a[ii][i] == 9999) {
                                overlaps = true;
                            }
                        }
                    }
                }
                if (!overlaps && part == 2) {
                    System.out.println("Pt.2: " + n);
                    break;
                }
                l = reader.readLine();
            }
            reader = new BufferedReader(new FileReader("C:\\Users\\Marco\\Desktop\\input.txt"));
            l = reader.readLine();
        }
        System.out.println("Pt.1: " + c);
    }
}
