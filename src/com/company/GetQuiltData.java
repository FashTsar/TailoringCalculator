package com.company;

public class GetQuiltData {
    public static int[][] arrayResult = new int[2][10];

    public int[][] getQuiltData(){
        int[][] arrayResultFillForm = arrayResult;
        return arrayResultFillForm;
    }
}
