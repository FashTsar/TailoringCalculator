package com.company.front;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import static java.lang.Integer.parseInt;

public class PillowcaseData extends JFrame{

    public void PillowcaseData(){

        // ------- создаём форму и задаём основные параметры -------
        JFrame PillowcaseData = new JFrame("Шаг 1"); // создаём фрейм и задаём загаловок
        PillowcaseData.setResizable(false); // запретить менять размер окна
        PillowcaseData.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // при нажатии на крестик заканчивать работу
        PillowcaseData.setLocationRelativeTo(null); // окно появляется посередине
        PillowcaseData.setLayout(new BorderLayout());

        // ------- создаём панель для загаловка -------
        JPanel TitlePagePanel = new JPanel();
        TitlePagePanel.setMinimumSize(TitlePagePanel.getPreferredSize()); // оптимальный минимальный размер
        JLabel TitlePageLable = new JLabel("Размеры наволочек (в сантиметрах):");
        TitlePagePanel.add(TitlePageLable);
        TitlePagePanel.setVisible(true);

        // ------- создаём панель для полей -------
        JPanel PillowcaseDataPanel = new JPanel();
        PillowcaseDataPanel.setLayout(new GridBagLayout()); // способ расположения элементов в панели загрузки
        PillowcaseDataPanel.setMinimumSize(PillowcaseDataPanel.getPreferredSize()); // оптимальный минимальный размер

        // ------- создаём поля первой строки и распределяем поля по панели -------
        JLabel titlePillowcaseType1Lable_1 = new JLabel("Размер №1");
        JCheckBox activePillowcaseType1CheckBox_1 = new JCheckBox();
        JLabel typeSeparator_1 = new JLabel("x");
        JLabel ExceptionMessageLabel_1 = new JLabel("Ошибка: одна из сторон меньше или равна 0");
        ExceptionMessageLabel_1.setForeground(Color.RED);
        ExceptionMessageLabel_1.setVisible(false);

        NumberFormat number = new DecimalFormat("#"); // формат ввода в поле (только цифры)

        JFormattedTextField sideOne_1 = new JFormattedTextField(
                new NumberFormatter(number));
        sideOne_1.setColumns(5);
        sideOne_1.setValue(0);
        JFormattedTextField sideTwo_1 = new JFormattedTextField(
                new NumberFormatter(number));
        sideTwo_1.setColumns(5);
        sideTwo_1.setValue(0);

        PillowcaseDataPanel.add(titlePillowcaseType1Lable_1, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(activePillowcaseType1CheckBox_1, new GridBagConstraints(1, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideOne_1, new GridBagConstraints(2, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(typeSeparator_1, new GridBagConstraints(3, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideTwo_1, new GridBagConstraints(4, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageLabel_1, new GridBagConstraints(0, 1, 6, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // прописываем логику действия при клике на чекбокс
        boolean valueActivePillowcaseType1CheckBox_1 = activePillowcaseType1CheckBox_1.isSelected();
        if (valueActivePillowcaseType1CheckBox_1 == false){
            sideOne_1.setEditable(false);
            sideTwo_1.setEditable(false);
        }
        if (valueActivePillowcaseType1CheckBox_1 == true){
            sideOne_1.setEditable(true);
            sideTwo_1.setEditable(true);
        }
        activePillowcaseType1CheckBox_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean valueActivePillowcaseType1CheckBox_1 = activePillowcaseType1CheckBox_1.isSelected();
                //System.out.println(valueActivePillowcaseType1CheckBox_1);
                if (valueActivePillowcaseType1CheckBox_1 == false){
                    sideOne_1.setEditable(false);
                    sideTwo_1.setEditable(false);
                }
                if (valueActivePillowcaseType1CheckBox_1 == true){
                    sideOne_1.setEditable(true);
                    sideTwo_1.setEditable(true);
                }
            }
        });

        // ------- создаём поля второй строки и распределяем поля по панели -------
        JLabel titlePillowcaseType1Lable_2 = new JLabel("Размер №2");
        JCheckBox activePillowcaseType1CheckBox_2 = new JCheckBox();
        JLabel typeSeparator_2 = new JLabel("x");
        JLabel ExceptionMessageLabel_2 = new JLabel("Ошибка: одна из сторон меньше или равна 0");
        ExceptionMessageLabel_2.setForeground(Color.RED);
        ExceptionMessageLabel_2.setVisible(false);

        JFormattedTextField sideOne_2 = new JFormattedTextField(
                new NumberFormatter(number));
        sideOne_2.setColumns(5);
        sideOne_2.setValue(0);
        JFormattedTextField sideTwo_2 = new JFormattedTextField(
                new NumberFormatter(number));
        sideTwo_2.setColumns(5);
        sideTwo_2.setValue(0);

        PillowcaseDataPanel.add(titlePillowcaseType1Lable_2, new GridBagConstraints(0, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(activePillowcaseType1CheckBox_2, new GridBagConstraints(1, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideOne_2, new GridBagConstraints(2, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(typeSeparator_2, new GridBagConstraints(3, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideTwo_2, new GridBagConstraints(4, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageLabel_2, new GridBagConstraints(0, 3, 6, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // прописываем логику действия при клике на чекбокс
        boolean valueActivePillowcaseType1CheckBox_2 = activePillowcaseType1CheckBox_2.isSelected();
        if (valueActivePillowcaseType1CheckBox_2 == false){
            sideOne_2.setEditable(false);
            sideTwo_2.setEditable(false);
        }
        if (valueActivePillowcaseType1CheckBox_2 == true){
            sideOne_2.setEditable(true);
            sideTwo_2.setEditable(true);
        }
        activePillowcaseType1CheckBox_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean valueActivePillowcaseType1CheckBox_2 = activePillowcaseType1CheckBox_2.isSelected();
                //System.out.println(valueActivePillowcaseType1CheckBox_2);
                if (valueActivePillowcaseType1CheckBox_2 == false){
                    sideOne_2.setEditable(false);
                    sideTwo_2.setEditable(false);
                }
                if (valueActivePillowcaseType1CheckBox_2 == true){
                    sideOne_2.setEditable(true);
                    sideTwo_2.setEditable(true);
                }
            }
        });

        // ------- создаём поля третьей строки и распределяем поля по панели -------
        JLabel titlePillowcaseType1Lable_3 = new JLabel("Размер №3");
        JCheckBox activePillowcaseType1CheckBox_3 = new JCheckBox();
        JLabel typeSeparator_3 = new JLabel("x");
        JLabel ExceptionMessageLabel_3 = new JLabel("Ошибка: одна из сторон меньше или равна 0");
        ExceptionMessageLabel_3.setForeground(Color.RED);
        ExceptionMessageLabel_3.setVisible(false);

        JFormattedTextField sideOne_3 = new JFormattedTextField(
                new NumberFormatter(number));
        sideOne_3.setColumns(5);
        sideOne_3.setValue(0);
        JFormattedTextField sideTwo_3 = new JFormattedTextField(
                new NumberFormatter(number));
        sideTwo_3.setColumns(5);
        sideTwo_3.setValue(0);

        PillowcaseDataPanel.add(titlePillowcaseType1Lable_3, new GridBagConstraints(0, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(activePillowcaseType1CheckBox_3, new GridBagConstraints(1, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideOne_3, new GridBagConstraints(2, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(typeSeparator_3, new GridBagConstraints(3, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideTwo_3, new GridBagConstraints(4, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageLabel_3, new GridBagConstraints(0, 5, 6, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // прописываем логику действия при клике на чекбокс
        boolean valueActivePillowcaseType1CheckBox_3 = activePillowcaseType1CheckBox_3.isSelected();
        if (valueActivePillowcaseType1CheckBox_3 == false){
            sideOne_3.setEditable(false);
            sideTwo_3.setEditable(false);
        }
        if (valueActivePillowcaseType1CheckBox_3 == true){
            sideOne_3.setEditable(true);
            sideTwo_3.setEditable(true);
        }
        activePillowcaseType1CheckBox_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean valueActivePillowcaseType1CheckBox_3 = activePillowcaseType1CheckBox_3.isSelected();
                //System.out.println(valueActivePillowcaseType1CheckBox_3);
                if (valueActivePillowcaseType1CheckBox_3 == false){
                    sideOne_3.setEditable(false);
                    sideTwo_3.setEditable(false);
                }
                if (valueActivePillowcaseType1CheckBox_3 == true){
                    sideOne_3.setEditable(true);
                    sideTwo_3.setEditable(true);
                }
            }
        });

        // ------- создаём поля четвёртой строки и распределяем поля по панели -------
        JLabel titlePillowcaseType1Lable_4 = new JLabel("Размер №4");
        JCheckBox activePillowcaseType1CheckBox_4 = new JCheckBox();
        JLabel typeSeparator_4 = new JLabel("x");
        JLabel ExceptionMessageLabel_4 = new JLabel("Ошибка: одна из сторон меньше или равна 0");
        ExceptionMessageLabel_4.setForeground(Color.RED);
        ExceptionMessageLabel_4.setVisible(false);

        JFormattedTextField sideOne_4 = new JFormattedTextField(
                new NumberFormatter(number));
        sideOne_4.setColumns(5);
        sideOne_4.setValue(0);
        JFormattedTextField sideTwo_4 = new JFormattedTextField(
                new NumberFormatter(number));
        sideTwo_4.setColumns(5);
        sideTwo_4.setValue(0);

        PillowcaseDataPanel.add(titlePillowcaseType1Lable_4, new GridBagConstraints(0, 6, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(activePillowcaseType1CheckBox_4, new GridBagConstraints(1, 6, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideOne_4, new GridBagConstraints(2, 6, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(typeSeparator_4, new GridBagConstraints(3, 6, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideTwo_4, new GridBagConstraints(4, 6, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageLabel_4, new GridBagConstraints(0, 7, 6, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // прописываем логику действия при клике на чекбокс
        boolean valueActivePillowcaseType1CheckBox_4 = activePillowcaseType1CheckBox_4.isSelected();
        if (valueActivePillowcaseType1CheckBox_4 == false){
            sideOne_4.setEditable(false);
            sideTwo_4.setEditable(false);
        }
        if (valueActivePillowcaseType1CheckBox_4 == true){
            sideOne_4.setEditable(true);
            sideTwo_4.setEditable(true);
        }
        activePillowcaseType1CheckBox_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean valueActivePillowcaseType1CheckBox_4 = activePillowcaseType1CheckBox_4.isSelected();
                //System.out.println(valueActivePillowcaseType1CheckBox_4);
                if (valueActivePillowcaseType1CheckBox_4 == false){
                    sideOne_4.setEditable(false);
                    sideTwo_4.setEditable(false);
                }
                if (valueActivePillowcaseType1CheckBox_4 == true){
                    sideOne_4.setEditable(true);
                    sideTwo_4.setEditable(true);
                }
            }
        });

        // ------- создаём поля пятой строки и распределяем поля по панели -------
        JLabel titlePillowcaseType1Lable_5 = new JLabel("Размер №5");
        JCheckBox activePillowcaseType1CheckBox_5 = new JCheckBox();
        JLabel typeSeparator_5 = new JLabel("x");
        JLabel ExceptionMessageLabel_5 = new JLabel("Ошибка: одна из сторон меньше или равна 0");
        ExceptionMessageLabel_5.setForeground(Color.RED);
        ExceptionMessageLabel_5.setVisible(false);

        JFormattedTextField sideOne_5 = new JFormattedTextField(
                new NumberFormatter(number));
        sideOne_5.setColumns(5);
        sideOne_5.setValue(0);
        JFormattedTextField sideTwo_5 = new JFormattedTextField(
                new NumberFormatter(number));
        sideTwo_5.setColumns(5);
        sideTwo_5.setValue(0);

        PillowcaseDataPanel.add(titlePillowcaseType1Lable_5, new GridBagConstraints(0, 8, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(activePillowcaseType1CheckBox_5, new GridBagConstraints(1, 8, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideOne_5, new GridBagConstraints(2, 8, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(typeSeparator_5, new GridBagConstraints(3, 8, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideTwo_5, new GridBagConstraints(4, 8, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageLabel_5, new GridBagConstraints(0, 9, 6, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // прописываем логику действия при клике на чекбокс
        boolean valueActivePillowcaseType1CheckBox_5 = activePillowcaseType1CheckBox_5.isSelected();
        if (valueActivePillowcaseType1CheckBox_5 == false){
            sideOne_5.setEditable(false);
            sideTwo_5.setEditable(false);
        }
        if (valueActivePillowcaseType1CheckBox_5 == true){
            sideOne_5.setEditable(true);
            sideTwo_5.setEditable(true);
        }
        activePillowcaseType1CheckBox_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean valueActivePillowcaseType1CheckBox_5 = activePillowcaseType1CheckBox_5.isSelected();
                //System.out.println(valueActivePillowcaseType1CheckBox_5);
                if (valueActivePillowcaseType1CheckBox_5 == false){
                    sideOne_5.setEditable(false);
                    sideTwo_5.setEditable(false);
                }
                if (valueActivePillowcaseType1CheckBox_5 == true){
                    sideOne_5.setEditable(true);
                    sideTwo_5.setEditable(true);
                }
            }
        });

        PillowcaseDataPanel.setVisible(true); // показывать панель

        // ------- создаём панель для кнопок -------
        JPanel ButtonPanel = new JPanel();
        ButtonPanel.setMinimumSize(TitlePagePanel.getPreferredSize()); // оптимальный минимальный размер
        JButton NextButton = new JButton("Далее");
        ButtonPanel.add(NextButton);
        ButtonPanel.setVisible(true);

        PillowcaseData.add(TitlePagePanel, BorderLayout.NORTH);
        PillowcaseData.add(PillowcaseDataPanel, BorderLayout.CENTER); // добавить панель в окно
        PillowcaseData.add(ButtonPanel, BorderLayout.SOUTH);
        PillowcaseData.pack(); // оптимизировать размер окна
        PillowcaseData.setVisible(true); // показать окно

        NextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean resultFillForm = true;

                // проверки по Размеру №1
                String valueSideOne_1 = sideOne_1.getText();
                int nvalueSideOne_1 = parseInt(valueSideOne_1); // приводим строку к целому числу
                //System.out.println(nvalueSideOne_1);
                String valueSideTwo_1 = sideTwo_1.getText();
                int nvalueSideTwo_1 = parseInt(valueSideTwo_1); // приводим строку к целому числу
                //System.out.println(nvalueSideTwo_1);
                if (nvalueSideOne_1 == 0 && nvalueSideTwo_1 != 0 || nvalueSideOne_1 != 0 && nvalueSideTwo_1 == 0 || nvalueSideOne_1 < 0 || nvalueSideTwo_1 < 0){
                    //System.out.println("Ошибка: одна из сторон меньше или равна 0");
                    ExceptionMessageLabel_1.setVisible(true);
                    PillowcaseData.pack(); // оптимизировать размер окна
                    resultFillForm = false;
                }
                if (nvalueSideOne_1 == 0 && nvalueSideTwo_1 == 0 || nvalueSideOne_1 > 0 && nvalueSideTwo_1 > 0){
                    //System.out.println("Корректно");
                    ExceptionMessageLabel_1.setVisible(false);
                    PillowcaseData.pack(); // оптимизировать размер окна
                    resultFillForm = true;
                }

                // проверки по Размеру №2
                String valueSideOne_2 = sideOne_2.getText();
                int nvalueSideOne_2 = parseInt(valueSideOne_2); // приводим строку к целому числу
                //System.out.println(nvalueSideOne_2);
                String valueSideTwo_2 = sideTwo_2.getText();
                int nvalueSideTwo_2 = parseInt(valueSideTwo_2); // приводим строку к целому числу
                //System.out.println(nvalueSideTwo_2);
                if (nvalueSideOne_2 == 0 && nvalueSideTwo_2 != 0 || nvalueSideOne_2 != 0 && nvalueSideTwo_2 == 0 || nvalueSideOne_2 < 0 || nvalueSideTwo_2 < 0){
                    //System.out.println("Ошибка: одна из сторон меньше или равна 0");
                    ExceptionMessageLabel_2.setVisible(true);
                    PillowcaseData.pack(); // оптимизировать размер окна
                    resultFillForm = false;
                }
                if (nvalueSideOne_2 == 0 && nvalueSideTwo_2 == 0 || nvalueSideOne_2 > 0 && nvalueSideTwo_2 > 0){
                    //System.out.println("Корректно");
                    ExceptionMessageLabel_2.setVisible(false);
                    PillowcaseData.pack(); // оптимизировать размер окна
                    resultFillForm = true;
                }

                // проверки по Размеру №3
                String valueSideOne_3 = sideOne_3.getText();
                int nvalueSideOne_3 = parseInt(valueSideOne_3); // приводим строку к целому числу
                //System.out.println(nvalueSideOne_3);
                String valueSideTwo_3 = sideTwo_3.getText();
                int nvalueSideTwo_3 = parseInt(valueSideTwo_3); // приводим строку к целому числу
                //System.out.println(nvalueSideTwo_3);
                if (nvalueSideOne_3 == 0 && nvalueSideTwo_3 != 0 || nvalueSideOne_3 != 0 && nvalueSideTwo_3 == 0 || nvalueSideOne_3 < 0 || nvalueSideTwo_3 < 0){
                    //System.out.println("Ошибка: одна из сторон меньше или равна 0");
                    ExceptionMessageLabel_3.setVisible(true);
                    PillowcaseData.pack(); // оптимизировать размер окна
                    resultFillForm = false;
                }
                if (nvalueSideOne_3 == 0 && nvalueSideTwo_3 == 0 || nvalueSideOne_3 > 0 && nvalueSideTwo_3 > 0){
                    //System.out.println("Корректно");
                    ExceptionMessageLabel_3.setVisible(false);
                    PillowcaseData.pack(); // оптимизировать размер окна
                    resultFillForm = true;
                }

                // проверки по Размеру №4
                String valueSideOne_4 = sideOne_4.getText();
                int nvalueSideOne_4 = parseInt(valueSideOne_4); // приводим строку к целому числу
                //System.out.println(nvalueSideOne_4);
                String valueSideTwo_4 = sideTwo_4.getText();
                int nvalueSideTwo_4 = parseInt(valueSideTwo_4); // приводим строку к целому числу
                //System.out.println(nvalueSideTwo_4);
                if (nvalueSideOne_4 == 0 && nvalueSideTwo_4 != 0 || nvalueSideOne_4 != 0 && nvalueSideTwo_4 == 0 || nvalueSideOne_4 < 0 || nvalueSideTwo_4 < 0){
                    //System.out.println("Ошибка: одна из сторон меньше или равна 0");
                    ExceptionMessageLabel_4.setVisible(true);
                    PillowcaseData.pack(); // оптимизировать размер окна
                    resultFillForm = false;
                }
                if (nvalueSideOne_4 == 0 && nvalueSideTwo_4 == 0 || nvalueSideOne_4 > 0 && nvalueSideTwo_4 > 0){
                    //System.out.println("Корректно");
                    ExceptionMessageLabel_4.setVisible(false);
                    PillowcaseData.pack(); // оптимизировать размер окна
                    resultFillForm = true;
                }

                // проверки по Размеру №5
                String valueSideOne_5 = sideOne_5.getText();
                int nvalueSideOne_5 = parseInt(valueSideOne_5); // приводим строку к целому числу
                //System.out.println(nvalueSideOne_5);
                String valueSideTwo_5 = sideTwo_5.getText();
                int nvalueSideTwo_5 = parseInt(valueSideTwo_5); // приводим строку к целому числу
                //System.out.println(nvalueSideTwo_5);
                if (nvalueSideOne_5 == 0 && nvalueSideTwo_5 != 0 || nvalueSideOne_5 != 0 && nvalueSideTwo_5 == 0 || nvalueSideOne_5 < 0 || nvalueSideTwo_5 < 0){
                    //System.out.println("Ошибка: одна из сторон меньше или равна 0");
                    ExceptionMessageLabel_5.setVisible(true);
                    PillowcaseData.pack(); // оптимизировать размер окна
                    resultFillForm = false;
                }
                if (nvalueSideOne_5 == 0 && nvalueSideTwo_5 == 0 || nvalueSideOne_5 > 0 && nvalueSideTwo_5 > 0){
                    //System.out.println("Корректно");
                    ExceptionMessageLabel_5.setVisible(false);
                    PillowcaseData.pack(); // оптимизировать размер окна
                    resultFillForm = true;
                }
            }
        });
    }
}