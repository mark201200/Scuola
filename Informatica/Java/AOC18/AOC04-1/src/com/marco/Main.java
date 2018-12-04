package com.marco;

import java.io.*;
import java.util.regex.*;

public class Main {
    private static int maxIndex(int[] array) {
        int largest = 0;
        for (int i = 1; i < array.length; i++) if (array[i] > array[largest]) largest = i;
        return largest;
    }

    private static int maxIndex(int[][] array, int num) {
        int largest = 0;
        for (int i = 0; i < 60; i++) if (array[num][largest] < array[num][i]) largest = i;
        return largest;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Marco\\Desktop\\input.txt"));
        String[] line = reader.readLine().split("] ");
        Pattern minutePattern = Pattern.compile("\\[1518\\-(\\d+)\\-(\\d+) 00\\:(\\d+)");
        Pattern idPattern = Pattern.compile("Guard \\#(\\d+) begins shift");
        int guardID = 0;
        int maxID = 0;
        int[][] mins = new int[10000][60];
        int[] totalSleep = new int[10000];
        while (true) {

            if (line[1].charAt(0) == 'G') {
                Matcher idMatcher = idPattern.matcher(line[1]);
                idMatcher.find();
                guardID = Integer.parseInt(idMatcher.group(1));
                if (maxID < guardID) maxID = guardID;
                line = reader.readLine().split("] ");
            }

            if (line[1].charAt(0) == 'f') {
                Matcher minuteMatcher = minutePattern.matcher(line[0]);
                minuteMatcher.find();
                int minStart = Integer.parseInt(minuteMatcher.group(3));
                line = reader.readLine().split("] ");
                minuteMatcher = minutePattern.matcher(line[0]);
                minuteMatcher.find();
                int minEnd = Integer.parseInt(minuteMatcher.group(3));
                totalSleep[guardID] += minEnd - minStart;
                for (int min = minStart; min < minEnd; min++)
                    mins[guardID][min]++;
                try {
                    line = reader.readLine().split("] ");
                } catch (NullPointerException e) {
                }
            }

            if (line[1].charAt(0) == 'w')
                break;

        }
        System.out.println("Pt.1: " + maxIndex(mins, maxIndex(totalSleep)) * maxIndex(totalSleep));
        int maxMinute = 0;
        int minuteAnswer = 0;
        int IDAnswer = 0;
        for (int ID = 0; ID <= maxID; ID++) {

            if (maxMinute < mins[ID][maxIndex(mins, ID)]) {
                maxMinute = mins[ID][maxIndex(mins, ID)];
                minuteAnswer = maxIndex(mins, ID);
                IDAnswer = ID;
            }

        }
        System.out.println("Pt.2: " + IDAnswer * minuteAnswer);
    }
}