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
        //System.out.println(resultPillowcaseType1);

        float fresultPillowcaseType1 = (float) resultPillowcaseType1;
        //System.out.println(fresultPillowcaseType1);

        //System.out.println(f.format(resultPillowcaseType1/100.00));


        JLabel titlePillowcaseType1Lable = new JLabel("Размер наволочек: "+
                nvaluePillowcaseSideOne_1+" x "+nvaluePillowcaseSideTwo_1+" Количество: "+nvaluePillowcaseQuantityTextField_1
                +" шт. Необходимо = "
                +f.format(resultPillowcaseType1/100.00)+" метров");

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
        //System.out.println(resultPillowcaseType2);

        float fresultPillowcaseType2 = (float) resultPillowcaseType2;
        //System.out.println(fresultPillowcaseType2);

        //System.out.println(f.format(resultPillowcaseType2/100.00));


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
