package com.company;

public class GetData {
    public static int[][] arrayResultPillowcaseData = new int[5][5]; // информация о наволочках
    public static boolean[] arrayHandSelectionPillowcase = new boolean[5]; // считать ли расход наволочки по широкой стороне

    public int[][] getPillowcaseData(){
        int[][] arrayPillowcaseData = arrayResultPillowcaseData;
        return arrayPillowcaseData;
    }

    public boolean[] getHandSelectionPillowcase(){
        boolean[] arrayHandPillowcase = arrayHandSelectionPillowcase;
        return arrayHandPillowcase;
    }
}
