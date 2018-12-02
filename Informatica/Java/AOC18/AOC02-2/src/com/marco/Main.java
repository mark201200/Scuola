package com.marco;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Marco\\Desktop\\input.txt"));
        BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\Marco\\Desktop\\input.txt"));
        String l = reader.readLine();
        boolean last = false;
        while (l != null) {
            String ll = reader1.readLine();
            while (ll != null) {
                for (int i = 0; i < ll.length(); i++) {
                    if (l.charAt(i) != ll.charAt(i) && !last)
                        last = true;
                    else if (l.charAt(i) != ll.charAt(i) && last) {
                        last = false;
                        break;
                    }
                }
                if(last){
                    System.out.println(l);
                    System.out.println(ll);
                    return;
                }
                ll = reader1.readLine();
            }
            reader1 = new BufferedReader(new FileReader("C:\\Users\\Marco\\Desktop\\input.txt"));
            l = reader.readLine();
        }
    }
}
