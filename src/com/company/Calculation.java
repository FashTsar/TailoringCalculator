package com.company;

public class Calculation {
    // ------- информация по наволочкам -------
    GetPillowcaseData arrayPillowcaseData = new GetPillowcaseData();
    int[][] arrayPillowcase = arrayPillowcaseData.getPillowcaseData();

    // размеры наволочек
    int nvaluePillowcaseSideOne_1 = arrayPillowcase[0][0];
    int nvaluePillowcaseSideTwo_1 = arrayPillowcase[0][1];
    int nvaluePillowcaseSideOne_2 = arrayPillowcase[0][2];
    int nvaluePillowcaseSideTwo_2 = arrayPillowcase[0][3];
    int nvaluePillowcaseSideOne_3 = arrayPillowcase[0][4];
    int nvaluePillowcaseSideTwo_3 = arrayPillowcase[0][5];
    int nvaluePillowcaseSideOne_4 = arrayPillowcase[0][6];
    int nvaluePillowcaseSideTwo_4 = arrayPillowcase[0][7];
    int nvaluePillowcaseSideOne_5 = arrayPillowcase[0][8];
    int nvaluePillowcaseSideTwo_5 = arrayPillowcase[0][9];

    // количество наволочек
    int nvaluePillowcaseQuantityTextField_1 = arrayPillowcase[1][0];
    int nvaluePillowcaseQuantityTextField_2 = arrayPillowcase[1][1];
    int nvaluePillowcaseQuantityTextField_3 = arrayPillowcase[1][2];
    int nvaluePillowcaseQuantityTextField_4 = arrayPillowcase[1][3];
    int nvaluePillowcaseQuantityTextField_5 = arrayPillowcase[1][4];

    // информация по клапанам у наволочек
    int nvaluePillowcaseValveTextField_1 = arrayPillowcase[2][0];
    int nvaluePillowcaseValveTextField_2 = arrayPillowcase[2][1];
    int nvaluePillowcaseValveTextField_3 = arrayPillowcase[2][2];
    int nvaluePillowcaseValveTextField_4 = arrayPillowcase[2][3];
    int nvaluePillowcaseValveTextField_5 = arrayPillowcase[2][4];

    // ------- информация по пододеяльникам -------
    GetQuiltData arrayQuiltData = new GetQuiltData();
    int[][] arrayQuilt = arrayQuiltData.getQuiltData();

    // размеры пододеяльников
    int nvalueQuiltSideOne_1 = arrayQuilt[0][0];
    int nvalueQuiltSideTwo_1 = arrayQuilt[0][1];
    int nvalueQuiltSideOne_2 = arrayQuilt[0][2];
    int nvalueQuiltSideTwo_2 = arrayQuilt[0][3];
    int nvalueQuiltSideOne_3 = arrayQuilt[0][4];
    int nvalueQuiltSideTwo_3 = arrayQuilt[0][5];
    int nvalueQuiltSideOne_4 = arrayQuilt[0][6];
    int nvalueQuiltSideTwo_4 = arrayQuilt[0][7];
    int nvalueQuiltSideOne_5 = arrayQuilt[0][8];
    int nvalueQuiltSideTwo_5 = arrayQuilt[0][9];

    // количество пододеяльников
    int nvalueQuiltQuantityTextField_1 = arrayQuilt[1][0];
    int nvalueQuiltQuantityTextField_2 = arrayQuilt[1][1];
    int nvalueQuiltQuantityTextField_3 = arrayQuilt[1][2];
    int nvalueQuiltQuantityTextField_4 = arrayQuilt[1][3];
    int nvalueQuiltQuantityTextField_5 = arrayQuilt[1][4];

    // ------- информация по простыням -------
    GetSheetData arraySheetData = new GetSheetData();
    int[][] arraySheet = arraySheetData.getSheetData();

    // размеры простыней
    int nvalueSheetSideOne_1 = arraySheet[0][0];
    int nvalueSheetSideTwo_1 = arraySheet[0][1];
    int nvalueSheetSideOne_2 = arraySheet[0][2];
    int nvalueSheetSideTwo_2 = arraySheet[0][3];
    int nvalueSheetSideOne_3 = arraySheet[0][4];
    int nvalueSheetSideTwo_3 = arraySheet[0][5];
    int nvalueSheetSideOne_4 = arraySheet[0][6];
    int nvalueSheetSideTwo_4 = arraySheet[0][7];
    int nvalueSheetSideOne_5 = arraySheet[0][8];
    int nvalueSheetSideTwo_5 = arraySheet[0][9];

    // количество простыней
    int nvalueQuantityTextField_1 = arraySheet[1][0];
    int nvalueQuantityTextField_2 = arraySheet[1][1];
    int nvalueQuantityTextField_3 = arraySheet[1][2];
    int nvalueQuantityTextField_4 = arraySheet[1][3];
    int nvalueQuantityTextField_5 = arraySheet[1][4];

    // ------- ширина ткани -------
    GetLastData WidthFabric = new GetLastData();
    int widthFabric = WidthFabric.getWidthFabric();

    // ------- размер шва -------
    GetLastData Seam = new GetLastData();
    int seam = Seam.getSeam();

    public void Calculation(){
        Calculation Sheet = new Calculation();
        Sheet.CalculationSheet();

        Calculation Quilt = new Calculation();
        Quilt.CalculationQuilt();

        Calculation Pillowcase = new Calculation();
        Pillowcase.CalculationPillowcase();
    }

    public void CalculationSheet(){
        System.out.println("Простынь 1");
        System.out.println(arraySheet[0][0]);
        System.out.println(arraySheet[0][1]);
        System.out.println("Количество: " + arraySheet[1][0]);
        System.out.println("Простынь 2");
        System.out.println(arraySheet[0][2]);
        System.out.println(arraySheet[0][3]);
        System.out.println("Количество: " + arraySheet[1][1]);
        System.out.println("Простынь 3");
        System.out.println(arraySheet[0][4]);
        System.out.println(arraySheet[0][5]);
        System.out.println("Количество: " + arraySheet[1][2]);
        System.out.println("Простынь 4");
        System.out.println(arraySheet[0][6]);
        System.out.println(arraySheet[0][7]);
        System.out.println("Количество: " + arraySheet[1][3]);
        System.out.println("Простынь 5");
        System.out.println(arraySheet[0][8]);
        System.out.println(arraySheet[0][9]);
        System.out.println("Количество: " + arraySheet[1][4]);
        System.out.println("Ширина ткани: " + widthFabric);
        System.out.println("Размер шва: " + seam);
    }

    public void CalculationQuilt(){
        System.out.println("Пододеяльник 1");
        System.out.println(arrayQuilt[0][0]);
        System.out.println(arrayQuilt[0][1]);
        System.out.println("Количество: " + arrayQuilt[1][0]);
        System.out.println("Пододеяльник 2");
        System.out.println(arrayQuilt[0][2]);
        System.out.println(arrayQuilt[0][3]);
        System.out.println("Количество: " + arrayQuilt[1][1]);
        System.out.println("Пододеяльник 3");
        System.out.println(arrayQuilt[0][4]);
        System.out.println(arrayQuilt[0][5]);
        System.out.println("Количество: " + arrayQuilt[1][2]);
        System.out.println("Пододеяльник 4");
        System.out.println(arrayQuilt[0][6]);
        System.out.println(arrayQuilt[0][7]);
        System.out.println("Количество: " + arrayQuilt[1][3]);
        System.out.println("Пододеяльник 5");
        System.out.println(arrayQuilt[0][8]);
        System.out.println(arrayQuilt[0][9]);
        System.out.println("Количество: " + arrayQuilt[1][4]);
        System.out.println("Ширина ткани: " + widthFabric);
        System.out.println("Размер шва: " + seam);
    }

    public void CalculationPillowcase(){
        System.out.println("Наволочка 1");
        System.out.println(arrayPillowcase[0][0]);
        System.out.println(arrayPillowcase[0][1]);
        System.out.println("Количество: " + arrayPillowcase[1][0]);
        System.out.println("Клапан: " + arrayPillowcase[2][0]);
        System.out.println("Наволочка 2");
        System.out.println(arrayPillowcase[0][2]);
        System.out.println(arrayPillowcase[0][3]);
        System.out.println("Количество: " + arrayPillowcase[1][1]);
        System.out.println("Клапан: " + arrayPillowcase[2][1]);
        System.out.println("Наволочка 3");
        System.out.println(arrayPillowcase[0][4]);
        System.out.println(arrayPillowcase[0][5]);
        System.out.println("Количество: " + arrayPillowcase[1][2]);
        System.out.println("Клапан: " + arrayPillowcase[2][2]);
        System.out.println("Наволочка 4");
        System.out.println(arrayPillowcase[0][6]);
        System.out.println(arrayPillowcase[0][7]);
        System.out.println("Количество: " + arrayPillowcase[1][3]);
        System.out.println("Клапан: " + arrayPillowcase[2][3]);
        System.out.println("Наволочка 5");
        System.out.println(arrayPillowcase[0][8]);
        System.out.println(arrayPillowcase[0][9]);
        System.out.println("Количество: " + arrayPillowcase[1][4]);
        System.out.println("Клапан: " + arrayPillowcase[2][4]);
        System.out.println("Ширина ткани: " + widthFabric);
        System.out.println("Размер шва: " + seam);
    }
}
