package com.company;

import com.company.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class ResultPage extends JFrame {
    // ------- информация по наволочкам -------
    GetData pillowcaseData = new GetData();
    int[][] PillowcaseData = pillowcaseData.getPillowcaseData();
    boolean[] HandSelectionPillowcase = pillowcaseData.getHandSelectionPillowcase();

    // ------- информация по пододеяльникам -------
    GetData quiltData = new GetData();
    int[][] QuiltData = quiltData.getQuiltData();
    boolean[] HandSelectionQuilt = quiltData.getHandSelectionQuilt();

    // ------- информация по простыням -------
    GetData sheetData = new GetData();
    int[][] SheetData = sheetData.getSheetData();
    boolean[] HandSelectionSheet = sheetData.getHandSelectionSheet();

    // ------- ширина ткани -------
    GetData widthCloth = new GetData();
    int WidthCloth = widthCloth.getWidthCloth();


    public void startResultPage() {

        // ------- отображать 2 цифры после точки -------
        DecimalFormatSymbols s = new DecimalFormatSymbols();
        s.setDecimalSeparator('.');
        DecimalFormat f = new DecimalFormat("#,##0.00", s);

        // ------- создаём форму и задаём основные параметры -------
        JFrame PageData = new JFrame("Результаты"); // создаём фрейм и задаём загаловок
        PageData.setResizable(false); // запретить менять размер окна
        PageData.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // при нажатии на крестик заканчивать работу
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

        int resultPillowcaseType1 = PillowcaseType1.CalculationPillowcase(PillowcaseData[0][0], PillowcaseData[1][0],
                PillowcaseData[3][0], PillowcaseData[2][0], PillowcaseData[4][0], WidthCloth, HandSelectionPillowcase[0]);

        float fresultPillowcaseType1 = resultPillowcaseType1/100.00f;
        if (fresultPillowcaseType1 < 0.01f && PillowcaseData[2][0] != 0){
            fresultPillowcaseType1 = 0.01f;
        }

        JLabel titlePillowcaseType1Lable = new JLabel("Размер наволочек: "+
                PillowcaseData[0][0]+" x "+PillowcaseData[1][0]+" Количество: "+PillowcaseData[2][0]
                +" шт. Необходимо = "
                +f.format(fresultPillowcaseType1)+" метров");
        titlePillowcaseType1Lable.setVisible(false);

        JLabel exeptionPillowcaseType1Lable = new JLabel("Наволочки "+
                PillowcaseData[0][0]+" x "+PillowcaseData[1][0]+" - стороны наволочки шире ткани");
        exeptionPillowcaseType1Lable.setForeground(Color.RED);
        exeptionPillowcaseType1Lable.setVisible(false);

        if (PillowcaseData[0][0] != 0 && PillowcaseData[1][0] !=0 && resultPillowcaseType1 != -1){
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

        int resultPillowcaseType2 = PillowcaseType2.CalculationPillowcase(PillowcaseData[0][1], PillowcaseData[1][1],
                PillowcaseData[3][1], PillowcaseData[2][1], PillowcaseData[4][1], WidthCloth, HandSelectionPillowcase[1]);

        float fresultPillowcaseType2 = resultPillowcaseType2/100.00f;
        if (fresultPillowcaseType2 < 0.01f && PillowcaseData[2][1] != 0){
            fresultPillowcaseType2 = 0.01f;
        }

        JLabel titlePillowcaseType2Lable = new JLabel("Размер наволочек: "+
                PillowcaseData[0][1]+" x "+PillowcaseData[1][1]+" Количество: "+PillowcaseData[2][1]
                +" шт. Необходимо = "
                +f.format(fresultPillowcaseType2)+" метров");
        titlePillowcaseType2Lable.setVisible(false);

        JLabel exeptionPillowcaseType2Lable = new JLabel("Наволочки "+
                PillowcaseData[0][1]+" x "+PillowcaseData[1][1]+" - стороны наволочки шире ткани");
        exeptionPillowcaseType2Lable.setForeground(Color.RED);
        exeptionPillowcaseType2Lable.setVisible(false);

        if (PillowcaseData[0][1] != 0 && PillowcaseData[1][1] !=0 && resultPillowcaseType2 != -1){
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

        int resultPillowcaseType3 = PillowcaseType3.CalculationPillowcase(PillowcaseData[0][2], PillowcaseData[1][2],
                PillowcaseData[3][2], PillowcaseData[2][2], PillowcaseData[4][2], WidthCloth, HandSelectionPillowcase[2]);

        float fresultPillowcaseType3 = resultPillowcaseType3/100.00f;
        if (fresultPillowcaseType3 < 0.01f && PillowcaseData[2][2] != 0){
            fresultPillowcaseType3 = 0.01f;
        }

        JLabel titlePillowcaseType3Lable = new JLabel("Размер наволочек: "+
                PillowcaseData[0][2]+" x "+PillowcaseData[1][2]+" Количество: "+PillowcaseData[2][2]
                +" шт. Необходимо = "
                +f.format(fresultPillowcaseType3)+" метров");
        titlePillowcaseType3Lable.setVisible(false);

        JLabel exeptionPillowcaseType3Lable = new JLabel("Наволочки "+
                PillowcaseData[0][2]+" x "+PillowcaseData[1][2]+" - стороны наволочки шире ткани");
        exeptionPillowcaseType3Lable.setForeground(Color.RED);
        exeptionPillowcaseType3Lable.setVisible(false);

        if (PillowcaseData[0][2] != 0 && PillowcaseData[1][2] !=0 && resultPillowcaseType3 != -1){
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

        int resultPillowcaseType4 = PillowcaseType4.CalculationPillowcase(PillowcaseData[0][3], PillowcaseData[1][3],
                PillowcaseData[3][3], PillowcaseData[2][3], PillowcaseData[4][3], WidthCloth, HandSelectionPillowcase[3]);

        float fresultPillowcaseType4 = resultPillowcaseType4/100.00f;
        if (fresultPillowcaseType4 < 0.01f && PillowcaseData[2][3] != 0){
            fresultPillowcaseType4 = 0.01f;
        }

        JLabel titlePillowcaseType4Lable = new JLabel("Размер наволочек: "+
                PillowcaseData[0][3]+" x "+PillowcaseData[1][3]+" Количество: "+PillowcaseData[2][3]
                +" шт. Необходимо = "
                +f.format(fresultPillowcaseType4)+" метров");
        titlePillowcaseType4Lable.setVisible(false);

        JLabel exeptionPillowcaseType4Lable = new JLabel("Наволочки "+
                PillowcaseData[0][3]+" x "+PillowcaseData[1][3]+" - стороны наволочки шире ткани");
        exeptionPillowcaseType4Lable.setForeground(Color.RED);
        exeptionPillowcaseType4Lable.setVisible(false);

        if (PillowcaseData[0][3] != 0 && PillowcaseData[1][3] !=0 && resultPillowcaseType4 != -1){
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

        int resultPillowcaseType5 = PillowcaseType5.CalculationPillowcase(PillowcaseData[0][4], PillowcaseData[1][4],
                PillowcaseData[3][4], PillowcaseData[2][4], PillowcaseData[4][4], WidthCloth, HandSelectionPillowcase[4]);

        float fresultPillowcaseType5 = resultPillowcaseType5/100.00f;
        if (fresultPillowcaseType5 < 0.01f && PillowcaseData[2][4] != 0){
            fresultPillowcaseType5 = 0.01f;
        }

        JLabel titlePillowcaseType5Lable = new JLabel("Размер наволочек: "+
                PillowcaseData[0][4]+" x "+PillowcaseData[1][4]+" Количество: "+PillowcaseData[2][4]
                +" шт. Необходимо = "
                +f.format(fresultPillowcaseType5)+" метров");
        titlePillowcaseType5Lable.setVisible(false);

        JLabel exeptionPillowcaseType5Lable = new JLabel("Наволочки "+
                PillowcaseData[0][4]+" x "+PillowcaseData[1][4]+" - стороны наволочки шире ткани");
        exeptionPillowcaseType5Lable.setForeground(Color.RED);
        exeptionPillowcaseType5Lable.setVisible(false);

        if (PillowcaseData[0][4] != 0 && PillowcaseData[1][4] !=0 && resultPillowcaseType5 != -1){
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

        int resultQuiltType1 = QuiltType1.CalculationQuilt(QuiltData[0][0], QuiltData[1][0],
                QuiltData[2][0], QuiltData[3][0], WidthCloth, HandSelectionQuilt[0]);

        float fresultQuiltType1 = resultQuiltType1/100.00f;
        if (fresultQuiltType1 < 0.01f && QuiltData[2][0] != 0){
            fresultQuiltType1 = 0.01f;
        }

        JLabel titleresultQuiltType1Lable = new JLabel("Размер пододеяльника: "+
                QuiltData[0][0]+" x "+QuiltData[1][0]+" Количество: "+QuiltData[2][0]
                +" шт. Необходимо = "
                +f.format(fresultQuiltType1)+" метров");
        titleresultQuiltType1Lable.setVisible(false);

        JLabel exeptionQuiltType1Lable = new JLabel("Пододеяльники "+
                QuiltData[0][0]+" x "+QuiltData[1][0]+" - стороны пододеяльника шире ткани");
        exeptionQuiltType1Lable.setForeground(Color.RED);
        exeptionQuiltType1Lable.setVisible(false);

        if (QuiltData[0][0] != 0 && QuiltData[1][0] !=0 && resultQuiltType1 != -1){
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

        int resultQuiltType2 = QuiltType2.CalculationQuilt(QuiltData[0][1], QuiltData[1][1],
                QuiltData[2][1], QuiltData[3][1], WidthCloth, HandSelectionQuilt[1]);

        float fresultQuiltType2 = resultQuiltType2/100.00f;
        if (fresultQuiltType2 < 0.01f && QuiltData[2][1] != 0){
            fresultQuiltType2 = 0.01f;
        }

        JLabel titleresultQuiltType2Lable = new JLabel("Размер пододеяльника: "+
                QuiltData[0][1]+" x "+QuiltData[1][1]+" Количество: "+QuiltData[2][1]
                +" шт. Необходимо = "
                +f.format(fresultQuiltType2)+" метров");
        titleresultQuiltType2Lable.setVisible(false);

        JLabel exeptionQuiltType2Lable = new JLabel("Пододеяльники "+
                QuiltData[0][1]+" x "+QuiltData[1][1]+" - стороны пододеяльника шире ткани");
        exeptionQuiltType2Lable.setForeground(Color.RED);
        exeptionQuiltType2Lable.setVisible(false);

        if (QuiltData[0][1] != 0 && QuiltData[1][1] !=0 && resultQuiltType2 != -1){
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

        int resultQuiltType3 = QuiltType3.CalculationQuilt(QuiltData[0][2], QuiltData[1][2],
                QuiltData[2][2], QuiltData[3][2], WidthCloth, HandSelectionQuilt[2]);

        float fresultQuiltType3 = resultQuiltType3/100.00f;
        if (fresultQuiltType3 < 0.01f && QuiltData[2][2] != 0){
            fresultQuiltType3 = 0.01f;
        }

        JLabel titleresultQuiltType3Lable = new JLabel("Размер пододеяльника: "+
                QuiltData[0][2]+" x "+QuiltData[1][2]+" Количество: "+QuiltData[2][2]
                +" шт. Необходимо = "
                +f.format(fresultQuiltType3)+" метров");
        titleresultQuiltType3Lable.setVisible(false);

        JLabel exeptionQuiltType3Lable = new JLabel("Пододеяльники "+
                QuiltData[0][2]+" x "+QuiltData[1][2]+" - стороны пододеяльника шире ткани");
        exeptionQuiltType3Lable.setForeground(Color.RED);
        exeptionQuiltType3Lable.setVisible(false);

        if (QuiltData[0][2] != 0 && QuiltData[1][2] !=0 && resultQuiltType3 != -1){
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

        int resultQuiltType4 = QuiltType4.CalculationQuilt(QuiltData[0][3], QuiltData[1][3],
                QuiltData[2][3], QuiltData[3][3], WidthCloth, HandSelectionQuilt[3]);

        float fresultQuiltType4 = resultQuiltType4/100.00f;
        if (fresultQuiltType4 < 0.01f && QuiltData[2][3] != 0){
            fresultQuiltType4 = 0.01f;
        }

        JLabel titleresultQuiltType4Lable = new JLabel("Размер пододеяльника: "+
                QuiltData[0][3]+" x "+QuiltData[1][3]+" Количество: "+QuiltData[2][3]
                +" шт. Необходимо = "
                +f.format(fresultQuiltType4)+" метров");
        titleresultQuiltType4Lable.setVisible(false);

        JLabel exeptionQuiltType4Lable = new JLabel("Пододеяльники "+
                QuiltData[0][3]+" x "+QuiltData[1][3]+" - стороны пододеяльника шире ткани");
        exeptionQuiltType4Lable.setForeground(Color.RED);
        exeptionQuiltType4Lable.setVisible(false);

        if (QuiltData[0][3] != 0 && QuiltData[1][3] !=0 && resultQuiltType4 != -1){
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

        int resultQuiltType5 = QuiltType5.CalculationQuilt(QuiltData[0][4], QuiltData[1][4],
                QuiltData[2][4], QuiltData[3][4], WidthCloth, HandSelectionQuilt[4]);

        float fresultQuiltType5 = resultQuiltType5/100.00f;
        if (fresultQuiltType5 < 0.01f && QuiltData[2][4] != 0){
            fresultQuiltType5 = 0.01f;
        }

        JLabel titleresultQuiltType5Lable = new JLabel("Размер пододеяльника: "+
                QuiltData[0][4]+" x "+QuiltData[1][4]+" Количество: "+QuiltData[2][4]
                +" шт. Необходимо = "
                +f.format(fresultQuiltType5)+" метров");
        titleresultQuiltType5Lable.setVisible(false);

        JLabel exeptionQuiltType5Lable = new JLabel("Пододеяльники "+
                QuiltData[0][4]+" x "+QuiltData[1][4]+" - стороны пододеяльника шире ткани");
        exeptionQuiltType5Lable.setForeground(Color.RED);
        exeptionQuiltType5Lable.setVisible(false);

        if (QuiltData[0][4] != 0 && QuiltData[1][4] !=0 && resultQuiltType5 != -1){
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

        int resultSheetType1 = SheetType1.CalculationSheet(SheetData[0][0], SheetData[1][0],
                SheetData[2][0], SheetData[3][0], WidthCloth, HandSelectionSheet[0]);

        float fresultSheetType1 = resultSheetType1/100.00f;
        if (fresultSheetType1 < 0.01f && SheetData[2][0] != 0){
            fresultSheetType1 = 0.01f;
        }

        JLabel titleresultSheetType1Lable = new JLabel("Размер простыни: "+
                SheetData[0][0]+" x "+SheetData[1][0]+" Количество: "+SheetData[2][0]
                +" шт. Необходимо = "
                +f.format(fresultSheetType1)+" метров");
        titleresultSheetType1Lable.setVisible(false);

        JLabel exeptionSheetType1Lable = new JLabel("Простыни "+
                SheetData[0][0]+" x "+SheetData[1][0]+" - стороны простыни шире ткани");
        exeptionSheetType1Lable.setForeground(Color.RED);
        exeptionSheetType1Lable.setVisible(false);

        if (SheetData[0][0] != 0 && SheetData[1][0] !=0 && resultSheetType1 != -1){
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

        int resultSheetType2 = SheetType2.CalculationSheet(SheetData[0][1], SheetData[1][1],
                SheetData[2][1], SheetData[3][1], WidthCloth, HandSelectionSheet[1]);

        float fresultSheetType2 = resultSheetType2/100.00f;
        if (fresultSheetType2 < 0.01f && SheetData[2][1] != 0){
            fresultSheetType2 = 0.01f;
        }

        JLabel titleresultSheetType2Lable = new JLabel("Размер простыни: "+
                SheetData[0][1]+" x "+SheetData[1][1]+" Количество: "+SheetData[2][1]
                +" шт. Необходимо = "
                +f.format(fresultSheetType2)+" метров");
        titleresultSheetType2Lable.setVisible(false);

        JLabel exeptionSheetType2Lable = new JLabel("Простыни "+
                SheetData[0][1]+" x "+SheetData[1][1]+" - стороны простыни шире ткани");
        exeptionSheetType2Lable.setForeground(Color.RED);
        exeptionSheetType2Lable.setVisible(false);

        if (SheetData[0][1] != 0 && SheetData[1][1] !=0 && resultSheetType2 != -1){
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

        int resultSheetType3 = SheetType3.CalculationSheet(SheetData[0][2], SheetData[1][2],
                SheetData[2][2], SheetData[3][2], WidthCloth, HandSelectionSheet[2]);

        float fresultSheetType3 = resultSheetType3/100.00f;
        if (fresultSheetType3 < 0.01f && SheetData[2][2] != 0){
            fresultSheetType3 = 0.01f;
        }

        JLabel titleresultSheetType3Lable = new JLabel("Размер простыни: "+
                SheetData[0][2]+" x "+SheetData[1][2]+" Количество: "+SheetData[2][2]
                +" шт. Необходимо = "
                +f.format(fresultSheetType3)+" метров");
        titleresultSheetType3Lable.setVisible(false);

        JLabel exeptionSheetType3Lable = new JLabel("Простыни "+
                SheetData[0][2]+" x "+SheetData[1][2]+" - стороны простыни шире ткани");
        exeptionSheetType3Lable.setForeground(Color.RED);
        exeptionSheetType3Lable.setVisible(false);

        if (SheetData[0][2] != 0 && SheetData[1][2] !=0 && resultSheetType3 != -1){
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

        int resultSheetType4 = SheetType4.CalculationSheet(SheetData[0][3], SheetData[1][3],
                SheetData[2][3], SheetData[3][3], WidthCloth, HandSelectionSheet[3]);

        float fresultSheetType4 = resultSheetType4/100.00f;
        if (fresultSheetType4 < 0.01f && SheetData[2][3] != 0){
            fresultSheetType4 = 0.01f;
        }

        JLabel titleresultSheetType4Lable = new JLabel("Размер простыни: "+
                SheetData[0][3]+" x "+SheetData[1][3]+" Количество: "+SheetData[2][3]
                +" шт. Необходимо = "
                +f.format(fresultSheetType4)+" метров");
        titleresultSheetType4Lable.setVisible(false);

        JLabel exeptionSheetType4Lable = new JLabel("Простыни "+
                SheetData[0][3]+" x "+SheetData[1][3]+" - стороны простыни шире ткани");
        exeptionSheetType4Lable.setForeground(Color.RED);
        exeptionSheetType4Lable.setVisible(false);

        if (SheetData[0][3] != 0 && SheetData[1][3] !=0 && resultSheetType4 != -1){
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

        int resultSheetType5 = SheetType5.CalculationSheet(SheetData[0][4], SheetData[1][4],
                SheetData[2][4], SheetData[3][4], WidthCloth, HandSelectionSheet[4]);

        float fresultSheetType5 = resultSheetType5/100.00f;
        if (fresultSheetType5 < 0.01f && SheetData[2][4] != 0){
            fresultSheetType5 = 0.01f;
        }

        JLabel titleresultSheetType5Lable = new JLabel("Размер простыни: "+
                SheetData[0][4]+" x "+SheetData[1][4]+" Количество: "+SheetData[2][4]
                +" шт. Необходимо = "
                +f.format(fresultSheetType5)+" метров");
        titleresultSheetType5Lable.setVisible(false);

        JLabel exeptionSheetType5Lable = new JLabel("Простыни "+
                SheetData[0][4]+" x "+SheetData[1][4]+" - стороны простыни шире ткани");
        exeptionSheetType5Lable.setForeground(Color.RED);
        exeptionSheetType5Lable.setVisible(false);

        if (SheetData[0][4] != 0 && SheetData[1][4] !=0 && resultSheetType5 != -1){
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

        if (PillowcaseData[0][0] == 0 && PillowcaseData[1][0] == 0
                && PillowcaseData[0][1] == 0 && PillowcaseData[1][1] == 0
                && PillowcaseData[0][2] == 0 && PillowcaseData[1][2] == 0
                && PillowcaseData[0][3] == 0 && PillowcaseData[1][3] == 0
                && PillowcaseData[0][4] == 0 && PillowcaseData[1][4] == 0
                && QuiltData[0][0] == 0 && QuiltData[1][0] == 0
                && QuiltData[0][1] == 0 && QuiltData[1][1] == 0
                && QuiltData[0][2] == 0 && QuiltData[1][2] == 0
                && QuiltData[0][3] == 0 && QuiltData[1][3] == 0
                && QuiltData[0][4] == 0 && QuiltData[1][4] == 0
                && SheetData[0][0] == 0 && SheetData[1][0] == 0
                && SheetData[0][1] == 0 && SheetData[1][1] == 0
                && SheetData[0][2] == 0 && SheetData[1][2] == 0
                && SheetData[0][3] == 0 && SheetData[1][3] == 0
                && SheetData[0][4] == 0 && SheetData[1][4] == 0){
            exeptionNotData.setVisible(true);
        }

        PillowcaseDataPanel.add(exeptionNotData, new GridBagConstraints(0, 170, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PageData.add(TitlePagePanel, BorderLayout.NORTH);
        PageData.add(PillowcaseDataPanel, BorderLayout.CENTER); // добавить панель в окно
        PageData.pack(); // оптимизировать размер окна
        PageData.setVisible(true); // показать окно
    }
}
