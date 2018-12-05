package com.marco;
import java.io.*;

public class Main {
    static private int polymerCollapse(StringBuilder polymer) {
        String old = " ";
        while (!(polymer.toString().equals(old))) {
            old = polymer.toString();
            for (int i = 0; i < polymer.length() - 1; i++)
                if ((polymer.charAt(i) ^ polymer.charAt(i + 1)) == 32) {
                    polymer.delete(i, i + 2);
                    break;
                }
        }
        return polymer.length();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Marco\\Desktop\\input.txt"));
        StringBuilder polymer = new StringBuilder(reader.readLine());
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            int len = polymerCollapse(new StringBuilder(polymer.toString().replaceAll((Character.toString((char) (i + 'a')) + "|" + Character.toString((char) (i + 'A'))), "")));
            if (len < min)
                min = len;
        }
        System.out.println(min);
    }
}