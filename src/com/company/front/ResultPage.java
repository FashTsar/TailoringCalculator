package com.company.front;

import com.company.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class ResultPage extends JFrame {
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
    int nvalueSheetQuantityTextField_1 = arraySheet[1][0];
    int nvalueSheetQuantityTextField_2 = arraySheet[1][1];
    int nvalueSheetQuantityTextField_3 = arraySheet[1][2];
    int nvalueSheetQuantityTextField_4 = arraySheet[1][3];
    int nvalueSheetQuantityTextField_5 = arraySheet[1][4];

    // ------- ширина ткани -------
    GetLastData WidthFabric = new GetLastData();
    int widthFabric = WidthFabric.getWidthFabric();

    // ------- размер шва -------
    GetLastData Seam = new GetLastData();
    int seam = Seam.getSeam();

    public void ResultPage() {

        // ------- отображать 2 цифры после точки -------
        DecimalFormatSymbols s = new DecimalFormatSymbols();
        s.setDecimalSeparator('.');
        DecimalFormat f = new DecimalFormat("#,##0.00", s);

        // ------- создаём форму и задаём основные параметры -------
        JFrame PageData = new JFrame("Результаты"); // создаём фрейм и задаём загаловок
        PageData.setResizable(false); // запретить менять размер окна
        PageData.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // при нажатии на крестик заканчивать работу
        PageData.setLocationRelativeTo(null); // окно появляется посередине
        PageData.setLayout(new BorderLayout());

        // ------- создаём панель для загаловка -------
        JPanel TitlePagePanel = new JPanel();
        TitlePagePanel.setMinimumSize(TitlePagePanel.getPreferredSize()); // оптимальный минимальный размер
        JLabel TitlePageLable = new JLabel("Результаты:");
        TitlePagePanel.add(TitlePageLable);
        TitlePagePanel.setVisible(true);

        // ------- создаём панель вывода результатов -------
        JPanel PillowcaseDataPanel = new JPanel();
        PillowcaseDataPanel.setLayout(new GridBagLayout()); // способ расположения элементов в панели загрузки
        PillowcaseDataPanel.setMinimumSize(PillowcaseDataPanel.getPreferredSize()); // оптимальный минимальный размер

        // ------- выводим результаты по наволочкам тип 1 -------
        Calculation PillowcaseType1 = new Calculation();

        int resultPillowcaseType1 = PillowcaseType1.CalculationPillowcase(nvaluePillowcaseSideOne_1, nvaluePillowcaseSideTwo_1,
                nvaluePillowcaseValveTextField_1, nvaluePillowcaseQuantityTextField_1,
                seam, widthFabric);

        JLabel titlePillowcaseType1Lable = new JLabel("Размер наволочек: "+
                nvaluePillowcaseSideOne_1+" x "+nvaluePillowcaseSideTwo_1+" Количество: "+nvaluePillowcaseQuantityTextField_1
                +" шт. Необходимо = "
                +f.format(resultPillowcaseType1/100.00)+" метров");
        titlePillowcaseType1Lable.setVisible(false);

        JLabel exeptionPillowcaseType1Lable = new JLabel("Наволочки "+
                nvaluePillowcaseSideOne_1+" x "+nvaluePillowcaseSideTwo_1+" - стороны наволочки шире ткани");
        exeptionPillowcaseType1Lable.setForeground(Color.RED);
        exeptionPillowcaseType1Lable.setVisible(false);

        if (nvaluePillowcaseSideOne_1 != 0 && nvaluePillowcaseSideTwo_1 !=0 && resultPillowcaseType1 != -1){
            titlePillowcaseType1Lable.setVisible(true);
        }
        if (resultPillowcaseType1 == -1){
            exeptionPillowcaseType1Lable.setVisible(true);
        }

        PillowcaseDataPanel.add(titlePillowcaseType1Lable, new GridBagConstraints(0, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(exeptionPillowcaseType1Lable, new GridBagConstraints(0, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // ------- выводим результаты по наволочкам тип 2 -------
        Calculation PillowcaseType2 = new Calculation();

        int resultPillowcaseType2 = PillowcaseType2.CalculationPillowcase(nvaluePillowcaseSideOne_2, nvaluePillowcaseSideTwo_2,
                nvaluePillowcaseValveTextField_2, nvaluePillowcaseQuantityTextField_2,
                seam, widthFabric);

        JLabel titlePillowcaseType2Lable = new JLabel("Размер наволочек: "+
                nvaluePillowcaseSideOne_2+" x "+nvaluePillowcaseSideTwo_2+" Количество: "+nvaluePillowcaseQuantityTextField_2
                +" шт. Необходимо = "
                +f.format(resultPillowcaseType2/100.00)+" метров");
        titlePillowcaseType2Lable.setVisible(false);

        JLabel exeptionPillowcaseType2Lable = new JLabel("Наволочки "+
                nvaluePillowcaseSideOne_2+" x "+nvaluePillowcaseSideTwo_2+" - стороны наволочки шире ткани");
        exeptionPillowcaseType2Lable.setForeground(Color.RED);
        exeptionPillowcaseType2Lable.setVisible(false);

        if (nvaluePillowcaseSideOne_2 != 0 && nvaluePillowcaseSideTwo_2 !=0 && resultPillowcaseType2 != -1){
            titlePillowcaseType2Lable.setVisible(true);
        }
        if (resultPillowcaseType2 == -1){
            exeptionPillowcaseType2Lable.setVisible(true);
        }

        PillowcaseDataPanel.add(titlePillowcaseType2Lable, new GridBagConstraints(0, 20, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(exeptionPillowcaseType2Lable, new GridBagConstraints(0, 20, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // ------- выводим результаты по наволочкам тип 3 -------
        Calculation PillowcaseType3 = new Calculation();

        int resultPillowcaseType3 = PillowcaseType3.CalculationPillowcase(nvaluePillowcaseSideOne_3, nvaluePillowcaseSideTwo_3,
                nvaluePillowcaseValveTextField_3, nvaluePillowcaseQuantityTextField_3,
                seam, widthFabric);

        JLabel titlePillowcaseType3Lable = new JLabel("Размер наволочек: "+
                nvaluePillowcaseSideOne_3+" x "+nvaluePillowcaseSideTwo_3+" Количество: "+nvaluePillowcaseQuantityTextField_3
                +" шт. Необходимо = "
                +f.format(resultPillowcaseType3/100.00)+" метров");
        titlePillowcaseType3Lable.setVisible(false);

        JLabel exeptionPillowcaseType3Lable = new JLabel("Наволочки "+
                nvaluePillowcaseSideOne_3+" x "+nvaluePillowcaseSideTwo_3+" - стороны наволочки шире ткани");
        exeptionPillowcaseType3Lable.setForeground(Color.RED);
        exeptionPillowcaseType3Lable.setVisible(false);

        if (nvaluePillowcaseSideOne_3 != 0 && nvaluePillowcaseSideTwo_3 !=0 && resultPillowcaseType3 != -1){
            titlePillowcaseType3Lable.setVisible(true);
        }
        if (resultPillowcaseType3 == -1){
            exeptionPillowcaseType3Lable.setVisible(true);
        }

        PillowcaseDataPanel.add(titlePillowcaseType3Lable, new GridBagConstraints(0, 30, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(exeptionPillowcaseType3Lable, new GridBagConstraints(0, 30, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // ------- выводим результаты по наволочкам тип 4 -------
        Calculation PillowcaseType4 = new Calculation();

        int resultPillowcaseType4 = PillowcaseType4.CalculationPillowcase(nvaluePillowcaseSideOne_4, nvaluePillowcaseSideTwo_4,
                nvaluePillowcaseValveTextField_4, nvaluePillowcaseQuantityTextField_4,
                seam, widthFabric);

        JLabel titlePillowcaseType4Lable = new JLabel("Размер наволочек: "+
                nvaluePillowcaseSideOne_4+" x "+nvaluePillowcaseSideTwo_4+" Количество: "+nvaluePillowcaseQuantityTextField_4
                +" шт. Необходимо = "
                +f.format(resultPillowcaseType4/100.00)+" метров");
        titlePillowcaseType4Lable.setVisible(false);

        JLabel exeptionPillowcaseType4Lable = new JLabel("Наволочки "+
                nvaluePillowcaseSideOne_4+" x "+nvaluePillowcaseSideTwo_4+" - стороны наволочки шире ткани");
        exeptionPillowcaseType4Lable.setForeground(Color.RED);
        exeptionPillowcaseType4Lable.setVisible(false);

        if (nvaluePillowcaseSideOne_4 != 0 && nvaluePillowcaseSideTwo_4 !=0 && resultPillowcaseType4 != -1){
            titlePillowcaseType4Lable.setVisible(true);
        }
        if (resultPillowcaseType4 == -1){
            exeptionPillowcaseType4Lable.setVisible(true);
        }

        PillowcaseDataPanel.add(titlePillowcaseType4Lable, new GridBagConstraints(0, 40, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(exeptionPillowcaseType4Lable, new GridBagConstraints(0, 40, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // ------- выводим результаты по наволочкам тип 5 -------
        Calculation PillowcaseType5 = new Calculation();

        int resultPillowcaseType5 = PillowcaseType5.CalculationPillowcase(nvaluePillowcaseSideOne_5, nvaluePillowcaseSideTwo_5,
                nvaluePillowcaseValveTextField_5, nvaluePillowcaseQuantityTextField_5,
                seam, widthFabric);

        JLabel titlePillowcaseType5Lable = new JLabel("Размер наволочек: "+
                nvaluePillowcaseSideOne_5+" x "+nvaluePillowcaseSideTwo_5+" Количество: "+nvaluePillowcaseQuantityTextField_5
                +" шт. Необходимо = "
                +f.format(resultPillowcaseType5/100.00)+" метров");
        titlePillowcaseType5Lable.setVisible(false);

        JLabel exeptionPillowcaseType5Lable = new JLabel("Наволочки "+
                nvaluePillowcaseSideOne_5+" x "+nvaluePillowcaseSideTwo_5+" - стороны наволочки шире ткани");
        exeptionPillowcaseType5Lable.setForeground(Color.RED);
        exeptionPillowcaseType5Lable.setVisible(false);

        if (nvaluePillowcaseSideOne_5 != 0 && nvaluePillowcaseSideTwo_5 !=0 && resultPillowcaseType5 != -1){
            titlePillowcaseType5Lable.setVisible(true);
        }
        if (resultPillowcaseType5 == -1){
            exeptionPillowcaseType5Lable.setVisible(true);
        }

        PillowcaseDataPanel.add(titlePillowcaseType5Lable, new GridBagConstraints(0, 50, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(exeptionPillowcaseType5Lable, new GridBagConstraints(0, 50, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // ------- выводим результаты по пододеяльникам тип 1 -------
        Calculation QuiltType1 = new Calculation();

        int resultQuiltType1 = QuiltType1.CalculationQuilt(nvalueQuiltSideOne_1, nvalueQuiltSideTwo_1,
                nvalueQuiltQuantityTextField_1, seam, widthFabric);

        JLabel titleresultQuiltType1Lable = new JLabel("Размер пододеяльника: "+
                nvalueQuiltSideOne_1+" x "+nvalueQuiltSideTwo_1+" Количество: "+nvalueQuiltQuantityTextField_1
                +" шт. Необходимо = "
                +f.format(resultQuiltType1/100.00)+" метров");
        titleresultQuiltType1Lable.setVisible(false);

        JLabel exeptionQuiltType1Lable = new JLabel("Пододеяльники "+
                nvalueQuiltSideOne_1+" x "+nvalueQuiltSideTwo_1+" - стороны пододеяльника шире ткани");
        exeptionQuiltType1Lable.setForeground(Color.RED);
        exeptionQuiltType1Lable.setVisible(false);

        if (nvalueQuiltSideOne_1 != 0 && nvalueQuiltSideTwo_1 !=0 && resultQuiltType1 != -1){
            titleresultQuiltType1Lable.setVisible(true);
        }
        if (resultQuiltType1 == -1){
            exeptionQuiltType1Lable.setVisible(true);
        }

        PillowcaseDataPanel.add(titleresultQuiltType1Lable, new GridBagConstraints(0, 60, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(exeptionQuiltType1Lable, new GridBagConstraints(0, 60, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // ------- выводим результаты по пододеяльникам тип 2 -------
        Calculation QuiltType2 = new Calculation();

        int resultQuiltType2 = QuiltType2.CalculationQuilt(nvalueQuiltSideOne_2, nvalueQuiltSideTwo_2,
                nvalueQuiltQuantityTextField_2, seam, widthFabric);

        JLabel titleresultQuiltType2Lable = new JLabel("Размер пододеяльника: "+
                nvalueQuiltSideOne_2+" x "+nvalueQuiltSideTwo_2+" Количество: "+nvalueQuiltQuantityTextField_2
                +" шт. Необходимо = "
                +f.format(resultQuiltType2/100.00)+" метров");
        titleresultQuiltType2Lable.setVisible(false);

        JLabel exeptionQuiltType2Lable = new JLabel("Пододеяльники "+
                nvalueQuiltSideOne_2+" x "+nvalueQuiltSideTwo_2+" - стороны пододеяльника шире ткани");
        exeptionQuiltType2Lable.setForeground(Color.RED);
        exeptionQuiltType2Lable.setVisible(false);

        if (nvalueQuiltSideOne_2 != 0 && nvalueQuiltSideTwo_2 !=0 && resultQuiltType2 != -1){
            titleresultQuiltType2Lable.setVisible(true);
        }
        if (resultQuiltType2 == -1){
            exeptionQuiltType2Lable.setVisible(true);
        }

        PillowcaseDataPanel.add(titleresultQuiltType2Lable, new GridBagConstraints(0, 70, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(exeptionQuiltType2Lable, new GridBagConstraints(0, 70, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // ------- выводим результаты по пододеяльникам тип 3 -------
        Calculation QuiltType3 = new Calculation();

        int resultQuiltType3 = QuiltType3.CalculationQuilt(nvalueQuiltSideOne_3, nvalueQuiltSideTwo_3,
                nvalueQuiltQuantityTextField_3, seam, widthFabric);

        JLabel titleresultQuiltType3Lable = new JLabel("Размер пододеяльника: "+
                nvalueQuiltSideOne_3+" x "+nvalueQuiltSideTwo_3+" Количество: "+nvalueQuiltQuantityTextField_3
                +" шт. Необходимо = "
                +f.format(resultQuiltType3/100.00)+" метров");
        titleresultQuiltType3Lable.setVisible(false);

        JLabel exeptionQuiltType3Lable = new JLabel("Пододеяльники "+
                nvalueQuiltSideOne_3+" x "+nvalueQuiltSideTwo_3+" - стороны пододеяльника шире ткани");
        exeptionQuiltType3Lable.setForeground(Color.RED);
        exeptionQuiltType3Lable.setVisible(false);

        if (nvalueQuiltSideOne_3 != 0 && nvalueQuiltSideTwo_3 !=0 && resultQuiltType3 != -1){
            titleresultQuiltType3Lable.setVisible(true);
        }
        if (resultQuiltType3 == -1){
            exeptionQuiltType3Lable.setVisible(true);
        }

        PillowcaseDataPanel.add(titleresultQuiltType3Lable, new GridBagConstraints(0, 80, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(exeptionQuiltType3Lable, new GridBagConstraints(0, 80, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // ------- выводим результаты по пододеяльникам тип 4 -------
        Calculation QuiltType4 = new Calculation();

        int resultQuiltType4 = QuiltType4.CalculationQuilt(nvalueQuiltSideOne_4, nvalueQuiltSideTwo_4,
                nvalueQuiltQuantityTextField_4, seam, widthFabric);

        JLabel titleresultQuiltType4Lable = new JLabel("Размер пододеяльника: "+
                nvalueQuiltSideOne_4+" x "+nvalueQuiltSideTwo_4+" Количество: "+nvalueQuiltQuantityTextField_4
                +" шт. Необходимо = "
                +f.format(resultQuiltType4/100.00)+" метров");
        titleresultQuiltType4Lable.setVisible(false);

        JLabel exeptionQuiltType4Lable = new JLabel("Пододеяльники "+
                nvalueQuiltSideOne_4+" x "+nvalueQuiltSideTwo_4+" - стороны пододеяльника шире ткани");
        exeptionQuiltType4Lable.setForeground(Color.RED);
        exeptionQuiltType4Lable.setVisible(false);

        if (nvalueQuiltSideOne_4 != 0 && nvalueQuiltSideTwo_4 !=0 && resultQuiltType4 != -1){
            titleresultQuiltType4Lable.setVisible(true);
        }
        if (resultQuiltType4 == -1){
            exeptionQuiltType4Lable.setVisible(true);
        }

        PillowcaseDataPanel.add(titleresultQuiltType4Lable, new GridBagConstraints(0, 90, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(exeptionQuiltType4Lable, new GridBagConstraints(0, 90, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // ------- выводим результаты по пододеяльникам тип 5 -------
        Calculation QuiltType5 = new Calculation();

        int resultQuiltType5 = QuiltType5.CalculationQuilt(nvalueQuiltSideOne_5, nvalueQuiltSideTwo_5,
                nvalueQuiltQuantityTextField_5, seam, widthFabric);

        JLabel titleresultQuiltType5Lable = new JLabel("Размер пододеяльника: "+
                nvalueQuiltSideOne_5+" x "+nvalueQuiltSideTwo_5+" Количество: "+nvalueQuiltQuantityTextField_5
                +" шт. Необходимо = "
                +f.format(resultQuiltType5/100.00)+" метров");
        titleresultQuiltType5Lable.setVisible(false);

        JLabel exeptionQuiltType5Lable = new JLabel("Пододеяльники "+
                nvalueQuiltSideOne_5+" x "+nvalueQuiltSideTwo_5+" - стороны пододеяльника шире ткани");
        exeptionQuiltType5Lable.setForeground(Color.RED);
        exeptionQuiltType5Lable.setVisible(false);

        if (nvalueQuiltSideOne_5 != 0 && nvalueQuiltSideTwo_5 !=0 && resultQuiltType5 != -1){
            titleresultQuiltType5Lable.setVisible(true);
        }
        if (resultQuiltType5 == -1){
            exeptionQuiltType5Lable.setVisible(true);
        }

        PillowcaseDataPanel.add(titleresultQuiltType5Lable, new GridBagConstraints(0, 100, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(exeptionQuiltType5Lable, new GridBagConstraints(0, 100, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // ------- выводим результат по простыням тип 1 -------
        Calculation SheetType1 = new Calculation();

        int resultSheetType1 = SheetType1.CalculationSheet(nvalueSheetSideOne_1, nvalueSheetSideTwo_1,
                nvalueSheetQuantityTextField_1, seam, widthFabric);

        JLabel titleresultSheetType1Lable = new JLabel("Размер простыни: "+
                nvalueSheetSideOne_1+" x "+nvalueSheetSideTwo_1+" Количество: "+nvalueSheetQuantityTextField_1
                +" шт. Необходимо = "
                +f.format(resultSheetType1/100.00)+" метров");
        titleresultSheetType1Lable.setVisible(false);

        JLabel exeptionSheetType1Lable = new JLabel("Простыни "+
                nvalueSheetSideOne_1+" x "+nvalueSheetSideTwo_1+" - стороны простыни шире ткани");
        exeptionSheetType1Lable.setForeground(Color.RED);
        exeptionSheetType1Lable.setVisible(false);

        if (nvalueSheetSideOne_1 != 0 && nvalueSheetSideTwo_1 !=0 && resultSheetType1 != -1){
            titleresultSheetType1Lable.setVisible(true);
        }
        if (resultSheetType1 == -1){
            exeptionSheetType1Lable.setVisible(true);
        }

        PillowcaseDataPanel.add(titleresultSheetType1Lable, new GridBagConstraints(0, 110, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(exeptionSheetType1Lable, new GridBagConstraints(0, 110, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // ------- выводим результат по простыням тип 2 -------
        Calculation SheetType2 = new Calculation();

        int resultSheetType2 = SheetType2.CalculationSheet(nvalueSheetSideOne_2, nvalueSheetSideTwo_2,
                nvalueSheetQuantityTextField_2, seam, widthFabric);

        JLabel titleresultSheetType2Lable = new JLabel("Размер простыни: "+
                nvalueSheetSideOne_2+" x "+nvalueSheetSideTwo_2+" Количество: "+nvalueSheetQuantityTextField_2
                +" шт. Необходимо = "
                +f.format(resultSheetType2/100.00)+" метров");
        titleresultSheetType2Lable.setVisible(false);

        JLabel exeptionSheetType2Lable = new JLabel("Простыни "+
                nvalueSheetSideOne_2+" x "+nvalueSheetSideTwo_2+" - стороны простыни шире ткани");
        exeptionSheetType2Lable.setForeground(Color.RED);
        exeptionSheetType2Lable.setVisible(false);

        if (nvalueSheetSideOne_2 != 0 && nvalueSheetSideTwo_2 !=0 && resultSheetType2 != -1){
            titleresultSheetType2Lable.setVisible(true);
        }
        if (resultSheetType2 == -1){
            exeptionSheetType2Lable.setVisible(true);
        }

        PillowcaseDataPanel.add(titleresultSheetType2Lable, new GridBagConstraints(0, 120, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(exeptionSheetType2Lable, new GridBagConstraints(0, 120, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // ------- выводим результат по простыням тип 3 -------
        Calculation SheetType3 = new Calculation();

        int resultSheetType3 = SheetType3.CalculationSheet(nvalueSheetSideOne_3, nvalueSheetSideTwo_3,
                nvalueSheetQuantityTextField_3, seam, widthFabric);

        JLabel titleresultSheetType3Lable = new JLabel("Размер простыни: "+
                nvalueSheetSideOne_3+" x "+nvalueSheetSideTwo_3+" Количество: "+nvalueSheetQuantityTextField_3
                +" шт. Необходимо = "
                +f.format(resultSheetType3/100.00)+" метров");
        titleresultSheetType3Lable.setVisible(false);

        JLabel exeptionSheetType3Lable = new JLabel("Простыни "+
                nvalueSheetSideOne_3+" x "+nvalueSheetSideTwo_3+" - стороны простыни шире ткани");
        exeptionSheetType3Lable.setForeground(Color.RED);
        exeptionSheetType3Lable.setVisible(false);

        if (nvalueSheetSideOne_3 != 0 && nvalueSheetSideTwo_3 !=0 && resultSheetType3 != -1){
            titleresultSheetType3Lable.setVisible(true);
        }
        if (resultSheetType3 == -1){
            exeptionSheetType3Lable.setVisible(true);
        }

        PillowcaseDataPanel.add(titleresultSheetType3Lable, new GridBagConstraints(0, 130, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(exeptionSheetType3Lable, new GridBagConstraints(0, 130, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // ------- выводим результат по простыням тип 4 -------
        Calculation SheetType4 = new Calculation();

        int resultSheetType4 = SheetType4.CalculationSheet(nvalueSheetSideOne_4, nvalueSheetSideTwo_4,
                nvalueSheetQuantityTextField_4, seam, widthFabric);

        JLabel titleresultSheetType4Lable = new JLabel("Размер простыни: "+
                nvalueSheetSideOne_4+" x "+nvalueSheetSideTwo_4+" Количество: "+nvalueSheetQuantityTextField_4
                +" шт. Необходимо = "
                +f.format(resultSheetType4/100.00)+" метров");
        titleresultSheetType4Lable.setVisible(false);

        JLabel exeptionSheetType4Lable = new JLabel("Простыни "+
                nvalueSheetSideOne_4+" x "+nvalueSheetSideTwo_4+" - стороны простыни шире ткани");
        exeptionSheetType4Lable.setForeground(Color.RED);
        exeptionSheetType4Lable.setVisible(false);

        if (nvalueSheetSideOne_4 != 0 && nvalueSheetSideTwo_4 !=0 && resultSheetType4 != -1){
            titleresultSheetType4Lable.setVisible(true);
        }
        if (resultSheetType4 == -1){
            exeptionSheetType4Lable.setVisible(true);
        }

        PillowcaseDataPanel.add(titleresultSheetType4Lable, new GridBagConstraints(0, 140, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(exeptionSheetType4Lable, new GridBagConstraints(0, 140, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // ------- выводим результат по простыням тип 5 -------
        Calculation SheetType5 = new Calculation();

        int resultSheetType5 = SheetType5.CalculationSheet(nvalueSheetSideOne_5, nvalueSheetSideTwo_5,
                nvalueSheetQuantityTextField_5, seam, widthFabric);

        JLabel titleresultSheetType5Lable = new JLabel("Размер простыни: "+
                nvalueSheetSideOne_5+" x "+nvalueSheetSideTwo_5+" Количество: "+nvalueSheetQuantityTextField_5
                +" шт. Необходимо = "
                +f.format(resultSheetType5/100.00)+" метров");
        titleresultSheetType5Lable.setVisible(false);

        JLabel exeptionSheetType5Lable = new JLabel("Простыни "+
                nvalueSheetSideOne_5+" x "+nvalueSheetSideTwo_5+" - стороны простыни шире ткани");
        exeptionSheetType5Lable.setForeground(Color.RED);
        exeptionSheetType5Lable.setVisible(false);

        if (nvalueSheetSideOne_5 != 0 && nvalueSheetSideTwo_5 !=0 && resultSheetType5 != -1){
            titleresultSheetType5Lable.setVisible(true);
        }
        if (resultSheetType5 == -1){
            exeptionSheetType5Lable.setVisible(true);
        }

        PillowcaseDataPanel.add(titleresultSheetType5Lable, new GridBagConstraints(0, 150, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(exeptionSheetType5Lable, new GridBagConstraints(0, 150, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // ------- выводим общий объём ткани -------
        Calculation totalValueInt = new Calculation();

        int finishValueInt = totalValueInt.CalculationFinish(resultPillowcaseType1, resultPillowcaseType2, resultPillowcaseType3,
        resultPillowcaseType4, resultPillowcaseType5,
        resultQuiltType1, resultQuiltType2, resultQuiltType3,
        resultQuiltType4, resultQuiltType5,
        resultSheetType1, resultSheetType2, resultSheetType3,
        resultSheetType4, resultSheetType5);

        JLabel titlefinishValueLable = new JLabel("Общее количество ткани: "
                +f.format(finishValueInt/100.00)+" метров");
        titlefinishValueLable.setForeground(Color.BLUE);
        titlefinishValueLable.setVisible(true);

        PillowcaseDataPanel.add(titlefinishValueLable, new GridBagConstraints(0, 160, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // ------- сообщение о том, что данные не заполнены -------
        JLabel exeptionNotData = new JLabel("Данные не были заполнены!");
        exeptionNotData.setForeground(Color.RED);
        exeptionNotData.setVisible(false);

        if (nvaluePillowcaseSideOne_1 == 0 && nvaluePillowcaseSideTwo_1 == 0
                && nvaluePillowcaseSideOne_2 == 0 && nvaluePillowcaseSideTwo_2 == 0
                && nvaluePillowcaseSideOne_3 == 0 && nvaluePillowcaseSideTwo_3 == 0
                && nvaluePillowcaseSideOne_4 == 0 && nvaluePillowcaseSideTwo_4 == 0
                && nvaluePillowcaseSideOne_5 == 0 && nvaluePillowcaseSideTwo_5 == 0
                && nvalueQuiltSideOne_1 == 0 && nvalueQuiltSideTwo_1 == 0
                && nvalueQuiltSideOne_2 == 0 && nvalueQuiltSideTwo_2 == 0
                && nvalueQuiltSideOne_3 == 0 && nvalueQuiltSideTwo_3 == 0
                && nvalueQuiltSideOne_4 == 0 && nvalueQuiltSideTwo_4 == 0
                && nvalueQuiltSideOne_5 == 0 && nvalueQuiltSideTwo_5 == 0
                && nvalueSheetSideOne_1 == 0 && nvalueSheetSideTwo_1 == 0
                && nvalueSheetSideOne_2 == 0 && nvalueSheetSideTwo_2 == 0
                && nvalueSheetSideOne_3 == 0 && nvalueSheetSideTwo_3 == 0
                && nvalueSheetSideOne_4 == 0 && nvalueSheetSideTwo_4 == 0
                && nvalueSheetSideOne_5 == 0 && nvalueSheetSideTwo_5 == 0){
            exeptionNotData.setVisible(true);
        }

        PillowcaseDataPanel.add(exeptionNotData, new GridBagConstraints(0, 170, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // ------- создаём панель для кнопок -------
        JPanel ButtonPanel = new JPanel();
        ButtonPanel.setMinimumSize(TitlePagePanel.getPreferredSize()); // оптимальный минимальный размер
        JButton NextButton = new JButton("Начать заново");
        ButtonPanel.add(NextButton);
        ButtonPanel.setVisible(true);

        PageData.add(TitlePagePanel, BorderLayout.NORTH);
        PageData.add(PillowcaseDataPanel, BorderLayout.CENTER); // добавить панель в окно
        PageData.add(ButtonPanel, BorderLayout.SOUTH);
        PageData.pack(); // оптимизировать размер окна
        PageData.setVisible(true); // показать окно

        NextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PageData.setVisible(false); // скрыть окно

                PillowcaseData restart = new PillowcaseData();
                restart.PillowcaseData();
            }
        });
    }
}
