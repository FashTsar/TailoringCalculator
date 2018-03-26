package com.company;

public class GetSheetData {
    public static int[][] arrayResult = new int[10][5];

    public int[][] getSheetData(){
        int[][] arrayResultFillForm = arrayResult;
        return arrayResultFillForm;
    }
}
