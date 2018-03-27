package com.company;

public class GetSheetData {
    public static int[][] arrayResult = new int[2][10];

    public int[][] getSheetData(){
        int[][] arrayResultFillForm = arrayResult;
        return arrayResultFillForm;
    }
}
