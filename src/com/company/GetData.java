package com.company;

public class GetData {
    public static int[][] arrayResultPillowcaseData = new int[5][5]; // информация о наволочках

    public int[][] getPillowcaseData(){
        int[][] arrayPillowcaseData = arrayResultPillowcaseData;
        return arrayPillowcaseData;
    }
}
