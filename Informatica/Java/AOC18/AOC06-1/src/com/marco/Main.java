package com.marco;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.*;

public class Main {

    private static int manhattan(int x, int y, int x1, int y1) {
        return (Math.abs((x - x1)) + Math.abs((y - y1)));
    }

    public static void main(String[] args) throws IOException {
        Pattern linePattern = Pattern.compile("(\\d+)\\, (\\d+)");
        Matcher lineMatcher;
        int[][] points = new int[500][500];
        int[][] dists = new int[500][500];
        int[][] input = new int[2][100];
        int[] area = new int[1000];
        int mindist = Integer.MAX_VALUE;
        int maxArea = 0;
        int maxx = 0;
        int maxy = 0;
        int regionArea = 0;
        int c = 0;
        int dist;
        ArrayList blacklist = new ArrayList();
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Marco\\Desktop\\input.txt"));
        String line = reader.readLine();

        while (line != null) {
            lineMatcher = linePattern.matcher(line);
            lineMatcher.find();
            input[0][c] = Integer.parseInt(lineMatcher.group(1));
            input[1][c] = Integer.parseInt(lineMatcher.group(2));
            c++;
            line = reader.readLine();
        }

        for (int i = 0; i < 370; i++) {
            for (int ii = 0; ii < 370; ii++) {
                int q = 1;
                for (int x = 0; x < c; x++) {
                    dist = manhattan(ii, i, input[0][x], input[1][x]);
                    dists[ii][i] += dist;
                    if (input[0][x] > maxx)
                        maxx = input[0][x];
                    if (input[1][x] > maxy)
                        maxy = input[1][x];
                    if (mindist == dist)
                        points[ii][i] = 0;
                    else if (mindist > dist) {
                        mindist = dist;
                        points[ii][i] = q;
                    }
                    q++;
                }
                mindist = Integer.MAX_VALUE;
            }
        }

        for (int x = 0; x <= maxx; x++) {
            if (!blacklist.contains(points[x][0]))
                blacklist.add(points[x][0]);
            if (!blacklist.contains(points[x][maxy]))
                blacklist.add(points[x][maxy]);
        }
        for (int y = 0; y <= maxy; y++) {
            if (!blacklist.contains(points[0][y]))
                blacklist.add(points[0][y]);
            if (!blacklist.contains(points[maxx][y]))
                blacklist.add(points[maxx][y]);
        }

        for (int i = 0; i < maxy; i++)
            for (int ii = 0; ii < maxx; ii++)
                if (!(blacklist.contains(points[ii][i])))
                    if (points[ii][i] != 0)
                        area[points[ii][i]]++;

        for (int i = 0; i < area.length; i++) {
            if (area[i] > maxArea) {
                maxArea = area[i];
            }
        }
        System.out.println("Pt.1 : " + maxArea);

        for (int i = 0; i < maxy; i++) {
            for (int ii = 0; ii < maxx; ii++) {
                if (dists[ii][i] < 10000)
                    regionArea++;
            }
        }
        System.out.println("Pt.2 : " + regionArea);
    }

}

