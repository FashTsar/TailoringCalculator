package com.company;

public class GetQuiltData {
    public static int[][] arrayResult = new int[10][5];

    public int[][] getQuiltData(){
        int[][] arrayResultFillForm = arrayResult;
        return arrayResultFillForm;
    }
}
