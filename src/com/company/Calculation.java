package com.company;

public class Calculation {

    public int CalculationSheet(int side1, int side2, int quantity, int seam, int widthFabric){
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

        if (broadSide <= widthFabric && broadSide != 0 && narrowSide != 0){
            numberRow = widthFabric/broadSide;
            clothConsumption = narrowSide/numberRow*quantity;
        }
        if (broadSide > widthFabric && narrowSide <= widthFabric && broadSide != 0 && narrowSide != 0){
            numberRow = widthFabric/narrowSide;
            clothConsumption = broadSide/numberRow*quantity;
        }
        if (broadSide > widthFabric && narrowSide > widthFabric){
            clothConsumption = -1;
        }
        return clothConsumption;
    }

    public int CalculationQuilt(int side1, int side2, int quantity, int seam, int widthFabric){
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

        if (broadSide <= widthFabric && broadSide != 0 && narrowSide != 0){
            numberRow = widthFabric/broadSide;
            clothConsumption = narrowSide*2/numberRow*quantity;
        }
        if (broadSide > widthFabric && narrowSide <= widthFabric && broadSide != 0 && narrowSide != 0){
            numberRow = widthFabric/narrowSide;
            clothConsumption = broadSide*2/numberRow*quantity;
        }
        if (broadSide > widthFabric && narrowSide > widthFabric){
            clothConsumption = -1;
        }
        return clothConsumption;
    }

    public int CalculationPillowcase(int side1, int side2, int valveint, int quantity, int seam, int widthFabric){
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

        if (broadSide <= widthFabric && broadSide != 0 && narrowSide != 0){
            numberRow = widthFabric/broadSide;
            clothConsumption = (narrowSide*2+valveint)/numberRow*quantity;
        }
        if (broadSide > widthFabric && narrowSide <= widthFabric && broadSide != 0 && narrowSide != 0){
            numberRow = narrowSide/broadSide;
            clothConsumption = (broadSide*2+valveint)/numberRow*quantity;
        }
        if (broadSide > widthFabric && narrowSide > widthFabric){
            clothConsumption = -1;
        }
        return clothConsumption;
    }
}