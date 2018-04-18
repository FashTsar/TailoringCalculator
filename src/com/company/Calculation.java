package com.company;

public class Calculation {

    public int CalculationSheet(int side1, int side2, int quantity, int seam, int widthFabric, boolean handSelection){
        int broadSide = 0;
        int narrowSide = 0;
        int clothConsumption = 0;
        int numberRow = 0;

        if (side1 > side2) {
            broadSide = side1;
            narrowSide = side2;
        }
        if (side1 <= side2) {
            broadSide = side2;
            narrowSide = side1;
        }

        broadSide = broadSide+seam;
        narrowSide = narrowSide+seam;

        if (handSelection != true) {
            if (broadSide <= widthFabric && broadSide != 0 && narrowSide != 0) {
                numberRow = widthFabric / broadSide;
                clothConsumption = narrowSide / numberRow * quantity;
            }
            if (broadSide > widthFabric && narrowSide <= widthFabric && broadSide != 0 && narrowSide != 0) {
                numberRow = widthFabric / narrowSide;
                clothConsumption = broadSide / numberRow * quantity;
            }
            if (broadSide > widthFabric && narrowSide > widthFabric) {
                clothConsumption = -1;
            }
        }
        if (handSelection != false) {
            if (narrowSide <= widthFabric && broadSide != 0 && narrowSide != 0) {
                numberRow = widthFabric / narrowSide;
                clothConsumption = broadSide / numberRow * quantity;
            }
            if (broadSide > widthFabric && narrowSide > widthFabric) {
                clothConsumption = -1;
            }
        }
        return clothConsumption;
    }

    public int CalculationQuilt(int side1, int side2, int quantity, int seam, int widthFabric, boolean handSelection){
        int broadSide = 0;
        int narrowSide = 0;
        int clothConsumption = 0;
        int numberRow = 0;

        if (side1 > side2) {
            broadSide = side1;
            narrowSide = side2;
        }
        if (side1 <= side2) {
            broadSide = side2;
            narrowSide = side1;
        }

        broadSide = broadSide+seam;
        narrowSide = narrowSide+seam;

        if (handSelection != true) {
            if (broadSide <= widthFabric && broadSide != 0 && narrowSide != 0) {
                numberRow = widthFabric / broadSide;
                clothConsumption = narrowSide * 2 / numberRow * quantity;
            }
            if (broadSide > widthFabric && narrowSide <= widthFabric && broadSide != 0 && narrowSide != 0) {
                numberRow = widthFabric / narrowSide;
                clothConsumption = broadSide * 2 / numberRow * quantity;
            }
            if (broadSide > widthFabric && narrowSide > widthFabric) {
                clothConsumption = -1;
            }
        }
        if (handSelection != false) {
            if (narrowSide <= widthFabric && broadSide != 0 && narrowSide != 0) {
                numberRow = widthFabric / narrowSide;
                clothConsumption = broadSide * 2 / numberRow * quantity;
            }
            if (broadSide > widthFabric && narrowSide > widthFabric) {
                clothConsumption = -1;
            }
        }
        return clothConsumption;
    }

    public int CalculationPillowcase(int side1, int side2, int valve, int quantity, int seam, int widthFabric, boolean handSelection){
        int broadSide = 0;
        int narrowSide = 0;
        int clothConsumption = 0;
        int numberRow = 0;

        if (side1 > side2) {
            broadSide = side1;
            narrowSide = side2;
        }
        if (side1 <= side2) {
            broadSide = side2;
            narrowSide = side1;
        }

        broadSide = broadSide+seam;
        narrowSide = narrowSide+seam;
        if (handSelection == false) {
            if (broadSide <= widthFabric && broadSide != 0 && narrowSide != 0) {
                numberRow = widthFabric / broadSide;
                clothConsumption = (narrowSide * 2 + valve) / numberRow * quantity;
            }
            if (broadSide > widthFabric && narrowSide <= widthFabric && broadSide != 0 && narrowSide != 0) {
                numberRow = widthFabric / narrowSide;
                clothConsumption = (broadSide * 2 + valve) / numberRow * quantity;
            }
            if (broadSide > widthFabric && narrowSide > widthFabric) {
                clothConsumption = -1;
            }
        }
        if (handSelection == true) {
            if (narrowSide <= widthFabric && broadSide != 0 && narrowSide != 0) {
                numberRow = widthFabric / narrowSide;
                clothConsumption = (broadSide * 2 + valve) / numberRow * quantity;
            }
            if (broadSide > widthFabric && narrowSide > widthFabric) {
                clothConsumption = -1;
            }
        }
        return clothConsumption;
    }

    public int CalculationFinish (int resultPillowcaseType1, int resultPillowcaseType2, int resultPillowcaseType3,
                                  int resultPillowcaseType4, int resultPillowcaseType5,
                                  int resultQuiltType1, int resultQuiltType2, int resultQuiltType3,
                                  int resultQuiltType4, int resultQuiltType5,
                                  int resultSheetType1, int resultSheetType2, int resultSheetType3,
                                  int resultSheetType4, int resultSheetType5){

        // ------- убираем -1 из наволочек -------
        int PillowcaseType1 = resultPillowcaseType1;
        int PillowcaseType2 = resultPillowcaseType2;
        int PillowcaseType3 = resultPillowcaseType3;
        int PillowcaseType4 = resultPillowcaseType4;
        int PillowcaseType5 = resultPillowcaseType5;

        if (resultPillowcaseType1 == -1){
            PillowcaseType1 = 0;
        }
        if (resultPillowcaseType2 == -1){
            PillowcaseType2 = 0;
        }
        if (resultPillowcaseType3 == -1){
            PillowcaseType3 = 0;
        }
        if (resultPillowcaseType4 == -1){
            PillowcaseType4 = 0;
        }
        if (resultPillowcaseType5 == -1){
            PillowcaseType5 = 0;
        }

        // ------- убираем -1 из пододеяльников -------
        int QuiltType1 = resultQuiltType1;
        int QuiltType2 = resultQuiltType2;
        int QuiltType3 = resultQuiltType3;
        int QuiltType4 = resultQuiltType4;
        int QuiltType5 = resultQuiltType5;

        if (resultQuiltType1 == -1){
            QuiltType1 = 0;
        }
        if (resultQuiltType2 == -1){
            QuiltType2 = 0;
        }
        if (resultQuiltType3 == -1){
            QuiltType3 = 0;
        }
        if (resultQuiltType4 == -1){
            QuiltType4 = 0;
        }
        if (resultQuiltType5 == -1){
            QuiltType5 = 0;
        }

        // ------- убираем -1 из простыней -------
        int SheetType1 = resultSheetType1;
        int SheetType2 = resultSheetType2;
        int SheetType3 = resultSheetType3;
        int SheetType4 = resultSheetType4;
        int SheetType5 = resultSheetType5;

        if (resultSheetType1 == -1){
            SheetType1 = 0;
        }
        if (resultSheetType2 == -1){
            SheetType2 = 0;
        }
        if (resultSheetType3 == -1){
            SheetType3 = 0;
        }
        if (resultSheetType4 == -1){
            SheetType4 = 0;
        }
        if (resultSheetType5 == -1){
            SheetType5 = 0;
        }

        int totalTissueVolume = PillowcaseType1 + PillowcaseType2 + PillowcaseType3 + PillowcaseType4 + PillowcaseType5
                + QuiltType1 + QuiltType2 + QuiltType3 + QuiltType4 + QuiltType5
                + SheetType1 + SheetType2 + SheetType3 + SheetType4 + SheetType5;

        return totalTissueVolume;
    }
}