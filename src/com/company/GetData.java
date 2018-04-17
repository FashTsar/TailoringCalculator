package com.company;

public class GetData {

    // ------- данные по наволочкам -------
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

    // ------- данные по пододеяльникам -------
    public static int[][] arrayResultQuiltData = new int[4][5]; // информация по пододеяльникам
    public static boolean[] arrayHandSelectionQuilt = new boolean[5]; // считать ли расход наволочки по широкой стороне

    public int[][] getQuiltData(){
        int[][] arrayQuiltData = arrayResultQuiltData;
        return arrayQuiltData;
    }

    public boolean[] getHandSelectionQuilt(){
        boolean[] arrayHandQuilt = arrayHandSelectionQuilt;
        return arrayHandQuilt;
    }

    // ------- данные по простыням -------
    public static int[][] arrayResultSheetData = new int[4][5]; // информация по пододеяльникам
    public static boolean[] arrayHandSelectionSheet = new boolean[5]; // считать ли расход наволочки по широкой стороне

    public int[][] getSheetData(){
        int[][] arraySheetData = arrayResultSheetData;
        return arraySheetData;
    }

    public boolean[] getHandSelectionSheet(){
        boolean[] arrayHandSheet = arrayHandSelectionSheet;
        return arrayHandSheet;
    }

    // ------- данные по ткани -------
    public static int valueWidthCloth = 0;

    public int getWidthCloth(){
        int widthCloth = valueWidthCloth;
        return widthCloth;
    }
}
