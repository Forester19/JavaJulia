package com.company.task1;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = {"dwqdw", "dwqwd", "Wdqwdqw", "dwqwdwwdqwd"};

        System.out.println(Arrays.toString(getLessThenAvarage(array)));
        System.out.println(Arrays.toString(getMoreThenAvarage(array)));
    }

    private static String [] getLessThenAvarage(String[] array){
        return separateArray(array, true);
    }

    private static String [] getMoreThenAvarage(String[] array){
        return separateArray(array, false);
    }


    private static String[] separateArray(String[] array, boolean less) {
        ArrayList<String> arrayList = new ArrayList<String>();
        double averege = calculateAverage(array);
        for (String s : array) {
            if (less ? (s.length() < averege) : (s.length() > averege)) {
                arrayList.add(s);
            }
        }
        String[] res = new String[arrayList.size()];
        res = arrayList.toArray(res);
        return res;
    }

    private static double calculateAverage(String[] array) {
        int average = 0;
        for (String s : array) {
            average += s.length();
        }
        System.out.println(average / (double) array.length);
        return  average / (double) array.length;
    }
}
