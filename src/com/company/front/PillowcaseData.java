package com.company.front;

import com.company.GetPillowcaseData;

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

        NumberFormat number = new DecimalFormat("#"); // формат ввода в поле (только цифры)

        // ------- создаём панель для полей -------
        JPanel PillowcaseDataPanel = new JPanel();
        PillowcaseDataPanel.setLayout(new GridBagLayout()); // способ расположения элементов в панели загрузки
        PillowcaseDataPanel.setMinimumSize(PillowcaseDataPanel.getPreferredSize()); // оптимальный минимальный размер

        // ------- создаём поля первой строки и распределяем поля по панели -------
        JLabel titlePillowcaseType1Lable_1 = new JLabel("Размер №1");
        JCheckBox activePillowcaseType1CheckBox_1 = new JCheckBox();
        JLabel typeSeparator_1 = new JLabel("x");
        JLabel ExceptionMessageLabel_1_1 = new JLabel("Ошибка: одна из сторон меньше или равна 0");
        ExceptionMessageLabel_1_1.setForeground(Color.RED);
        ExceptionMessageLabel_1_1.setVisible(false);
        JLabel quantityLable_1 = new JLabel("Количество:");
        JLabel ExceptionMessageLabel_1_2 = new JLabel("Ошибка: количество меньше 0");
        ExceptionMessageLabel_1_2.setForeground(Color.RED);
        ExceptionMessageLabel_1_2.setVisible(false);
        JLabel valveLable_1 = new JLabel("Клапан(см.):");

        JFormattedTextField sideOne_1 = new JFormattedTextField(
                new NumberFormatter(number));
        sideOne_1.setColumns(3);
        sideOne_1.setValue(0);
        JFormattedTextField sideTwo_1 = new JFormattedTextField(
                new NumberFormatter(number));
        sideTwo_1.setColumns(3);
        sideTwo_1.setValue(0);
        JFormattedTextField quantityTextField_1 = new JFormattedTextField(
                new NumberFormatter(number));
        quantityTextField_1.setColumns(3);
        quantityTextField_1.setValue(0);
        JFormattedTextField valveTextField_1 = new JFormattedTextField(
                new NumberFormatter(number));
        valveTextField_1.setColumns(3);
        valveTextField_1.setValue(0);

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

        PillowcaseDataPanel.add(quantityLable_1, new GridBagConstraints(5, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(quantityTextField_1, new GridBagConstraints(6, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(valveLable_1, new GridBagConstraints(7, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(valveTextField_1, new GridBagConstraints(8, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageLabel_1_1, new GridBagConstraints(0, 1, 8, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageLabel_1_2, new GridBagConstraints(0, 2, 8, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // прописываем логику действия при клике на чекбокс
        boolean valueActivePillowcaseType1CheckBox_1 = activePillowcaseType1CheckBox_1.isSelected();
        if (valueActivePillowcaseType1CheckBox_1 == false){
            sideOne_1.setEditable(false);
            sideTwo_1.setEditable(false);
            quantityTextField_1.setEditable(false);
        }
        if (valueActivePillowcaseType1CheckBox_1 == true){
            sideOne_1.setEditable(true);
            sideTwo_1.setEditable(true);
            quantityTextField_1.setEditable(true);
        }
        activePillowcaseType1CheckBox_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean valueActivePillowcaseType1CheckBox_1 = activePillowcaseType1CheckBox_1.isSelected();
                //System.out.println(valueActivePillowcaseType1CheckBox_1);
                if (valueActivePillowcaseType1CheckBox_1 == false){
                    sideOne_1.setEditable(false);
                    sideTwo_1.setEditable(false);
                    quantityTextField_1.setEditable(false);
                }
                if (valueActivePillowcaseType1CheckBox_1 == true){
                    sideOne_1.setEditable(true);
                    sideTwo_1.setEditable(true);
                    quantityTextField_1.setEditable(true);
                }
            }
        });

        // ------- создаём поля второй строки и распределяем поля по панели -------
        JLabel titlePillowcaseType1Lable_2 = new JLabel("Размер №2");
        JCheckBox activePillowcaseType1CheckBox_2 = new JCheckBox();
        JLabel typeSeparator_2 = new JLabel("x");
        JLabel ExceptionMessageLabel_2_1 = new JLabel("Ошибка: одна из сторон меньше или равна 0");
        ExceptionMessageLabel_2_1.setForeground(Color.RED);
        ExceptionMessageLabel_2_1.setVisible(false);
        JLabel quantityLable_2 = new JLabel("Количество:");
        JLabel ExceptionMessageLabel_2_2 = new JLabel("Ошибка: количество меньше 0");
        ExceptionMessageLabel_2_2.setForeground(Color.RED);
        ExceptionMessageLabel_2_2.setVisible(false);
        JLabel valveLable_2 = new JLabel("Клапан(см.):");

        JFormattedTextField sideOne_2 = new JFormattedTextField(
                new NumberFormatter(number));
        sideOne_2.setColumns(3);
        sideOne_2.setValue(0);
        JFormattedTextField sideTwo_2 = new JFormattedTextField(
                new NumberFormatter(number));
        sideTwo_2.setColumns(3);
        sideTwo_2.setValue(0);
        JFormattedTextField quantityTextField_2 = new JFormattedTextField(
                new NumberFormatter(number));
        quantityTextField_2.setColumns(3);
        quantityTextField_2.setValue(0);
        JFormattedTextField valveTextField_2 = new JFormattedTextField(
                new NumberFormatter(number));
        valveTextField_2.setColumns(3);
        valveTextField_2.setValue(0);

        PillowcaseDataPanel.add(titlePillowcaseType1Lable_2, new GridBagConstraints(0, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(activePillowcaseType1CheckBox_2, new GridBagConstraints(1, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideOne_2, new GridBagConstraints(2, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(typeSeparator_2, new GridBagConstraints(3, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideTwo_2, new GridBagConstraints(4, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(quantityLable_2, new GridBagConstraints(5, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(quantityTextField_2, new GridBagConstraints(6, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(valveLable_2, new GridBagConstraints(7, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(valveTextField_2, new GridBagConstraints(8, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageLabel_2_1, new GridBagConstraints(0, 11, 6, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageLabel_2_2, new GridBagConstraints(0, 12, 8, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // прописываем логику действия при клике на чекбокс
        boolean valueActivePillowcaseType1CheckBox_2 = activePillowcaseType1CheckBox_2.isSelected();
        if (valueActivePillowcaseType1CheckBox_2 == false){
            sideOne_2.setEditable(false);
            sideTwo_2.setEditable(false);
            quantityTextField_2.setEditable(false);
        }
        if (valueActivePillowcaseType1CheckBox_2 == true){
            sideOne_2.setEditable(true);
            sideTwo_2.setEditable(true);
            quantityTextField_2.setEditable(true);
        }
        activePillowcaseType1CheckBox_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean valueActivePillowcaseType1CheckBox_2 = activePillowcaseType1CheckBox_2.isSelected();
                //System.out.println(valueActivePillowcaseType1CheckBox_2);
                if (valueActivePillowcaseType1CheckBox_2 == false){
                    sideOne_2.setEditable(false);
                    sideTwo_2.setEditable(false);
                    quantityTextField_2.setEditable(false);
                }
                if (valueActivePillowcaseType1CheckBox_2 == true){
                    sideOne_2.setEditable(true);
                    sideTwo_2.setEditable(true);
                    quantityTextField_2.setEditable(true);
                }
            }
        });

        // ------- создаём поля третьей строки и распределяем поля по панели -------
        JLabel titlePillowcaseType1Lable_3 = new JLabel("Размер №3");
        JCheckBox activePillowcaseType1CheckBox_3 = new JCheckBox();
        JLabel typeSeparator_3 = new JLabel("x");
        JLabel ExceptionMessageLabel_3_1 = new JLabel("Ошибка: одна из сторон меньше или равна 0");
        ExceptionMessageLabel_3_1.setForeground(Color.RED);
        ExceptionMessageLabel_3_1.setVisible(false);
        JLabel quantityLable_3 = new JLabel("Количество:");
        JLabel ExceptionMessageLabel_3_2 = new JLabel("Ошибка: количество меньше 0");
        ExceptionMessageLabel_3_2.setForeground(Color.RED);
        ExceptionMessageLabel_3_2.setVisible(false);
        JLabel valveLable_3 = new JLabel("Клапан(см.):");

        JFormattedTextField sideOne_3 = new JFormattedTextField(
                new NumberFormatter(number));
        sideOne_3.setColumns(3);
        sideOne_3.setValue(0);
        JFormattedTextField sideTwo_3 = new JFormattedTextField(
                new NumberFormatter(number));
        sideTwo_3.setColumns(3);
        sideTwo_3.setValue(0);
        JFormattedTextField quantityTextField_3 = new JFormattedTextField(
                new NumberFormatter(number));
        quantityTextField_3.setColumns(3);
        quantityTextField_3.setValue(0);
        JFormattedTextField valveTextField_3 = new JFormattedTextField(
                new NumberFormatter(number));
        valveTextField_3.setColumns(3);
        valveTextField_3.setValue(0);

        PillowcaseDataPanel.add(titlePillowcaseType1Lable_3, new GridBagConstraints(0, 20, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(activePillowcaseType1CheckBox_3, new GridBagConstraints(1, 20, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideOne_3, new GridBagConstraints(2, 20, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(typeSeparator_3, new GridBagConstraints(3, 20, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideTwo_3, new GridBagConstraints(4, 20, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(quantityLable_3, new GridBagConstraints(5, 20, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(quantityTextField_3, new GridBagConstraints(6, 20, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(valveLable_3, new GridBagConstraints(7, 20, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(valveTextField_3, new GridBagConstraints(8, 20, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageLabel_3_1, new GridBagConstraints(0, 21, 6, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageLabel_3_2, new GridBagConstraints(0, 22, 8, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // прописываем логику действия при клике на чекбокс
        boolean valueActivePillowcaseType1CheckBox_3 = activePillowcaseType1CheckBox_3.isSelected();
        if (valueActivePillowcaseType1CheckBox_3 == false){
            sideOne_3.setEditable(false);
            sideTwo_3.setEditable(false);
            quantityTextField_3.setEditable(false);
        }
        if (valueActivePillowcaseType1CheckBox_3 == true){
            sideOne_3.setEditable(true);
            sideTwo_3.setEditable(true);
            quantityTextField_3.setEditable(true);
        }
        activePillowcaseType1CheckBox_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean valueActivePillowcaseType1CheckBox_3 = activePillowcaseType1CheckBox_3.isSelected();
                //System.out.println(valueActivePillowcaseType1CheckBox_3);
                if (valueActivePillowcaseType1CheckBox_3 == false){
                    sideOne_3.setEditable(false);
                    sideTwo_3.setEditable(false);
                    quantityTextField_3.setEditable(false);
                }
                if (valueActivePillowcaseType1CheckBox_3 == true){
                    sideOne_3.setEditable(true);
                    sideTwo_3.setEditable(true);
                    quantityTextField_3.setEditable(true);
                }
            }
        });

        // ------- создаём поля четвёртой строки и распределяем поля по панели -------
        JLabel titlePillowcaseType1Lable_4 = new JLabel("Размер №4");
        JCheckBox activePillowcaseType1CheckBox_4 = new JCheckBox();
        JLabel typeSeparator_4 = new JLabel("x");
        JLabel ExceptionMessageLabel_4_1 = new JLabel("Ошибка: одна из сторон меньше или равна 0");
        ExceptionMessageLabel_4_1.setForeground(Color.RED);
        ExceptionMessageLabel_4_1.setVisible(false);
        JLabel quantityLable_4 = new JLabel("Количество:");
        JLabel ExceptionMessageLabel_4_2 = new JLabel("Ошибка: количество меньше 0");
        ExceptionMessageLabel_4_2.setForeground(Color.RED);
        ExceptionMessageLabel_4_2.setVisible(false);
        JLabel valveLable_4 = new JLabel("Клапан(см.):");

        JFormattedTextField sideOne_4 = new JFormattedTextField(
                new NumberFormatter(number));
        sideOne_4.setColumns(3);
        sideOne_4.setValue(0);
        JFormattedTextField sideTwo_4 = new JFormattedTextField(
                new NumberFormatter(number));
        sideTwo_4.setColumns(3);
        sideTwo_4.setValue(0);
        JFormattedTextField quantityTextField_4 = new JFormattedTextField(
                new NumberFormatter(number));
        quantityTextField_4.setColumns(3);
        quantityTextField_4.setValue(0);
        JFormattedTextField valveTextField_4 = new JFormattedTextField(
                new NumberFormatter(number));
        valveTextField_4.setColumns(3);
        valveTextField_4.setValue(0);

        PillowcaseDataPanel.add(titlePillowcaseType1Lable_4, new GridBagConstraints(0, 30, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(activePillowcaseType1CheckBox_4, new GridBagConstraints(1, 30, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideOne_4, new GridBagConstraints(2, 30, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(typeSeparator_4, new GridBagConstraints(3, 30, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideTwo_4, new GridBagConstraints(4, 30, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(quantityLable_4, new GridBagConstraints(5, 30, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(quantityTextField_4, new GridBagConstraints(6, 30, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(valveLable_4, new GridBagConstraints(7, 30, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(valveTextField_4, new GridBagConstraints(8, 30, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageLabel_4_1, new GridBagConstraints(0, 31, 6, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageLabel_4_2, new GridBagConstraints(0, 32, 8, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // прописываем логику действия при клике на чекбокс
        boolean valueActivePillowcaseType1CheckBox_4 = activePillowcaseType1CheckBox_4.isSelected();
        if (valueActivePillowcaseType1CheckBox_4 == false){
            sideOne_4.setEditable(false);
            sideTwo_4.setEditable(false);
            quantityTextField_4.setEditable(false);
        }
        if (valueActivePillowcaseType1CheckBox_4 == true){
            sideOne_4.setEditable(true);
            sideTwo_4.setEditable(true);
            quantityTextField_4.setEditable(true);
        }
        activePillowcaseType1CheckBox_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean valueActivePillowcaseType1CheckBox_4 = activePillowcaseType1CheckBox_4.isSelected();
                //System.out.println(valueActivePillowcaseType1CheckBox_4);
                if (valueActivePillowcaseType1CheckBox_4 == false){
                    sideOne_4.setEditable(false);
                    sideTwo_4.setEditable(false);
                    quantityTextField_4.setEditable(false);
                }
                if (valueActivePillowcaseType1CheckBox_4 == true){
                    sideOne_4.setEditable(true);
                    sideTwo_4.setEditable(true);
                    quantityTextField_4.setEditable(true);
                }
            }
        });

        // ------- создаём поля пятой строки и распределяем поля по панели -------
        JLabel titlePillowcaseType1Lable_5 = new JLabel("Размер №5");
        JCheckBox activePillowcaseType1CheckBox_5 = new JCheckBox();
        JLabel typeSeparator_5 = new JLabel("x");
        JLabel ExceptionMessageLabel_5_1 = new JLabel("Ошибка: одна из сторон меньше или равна 0");
        ExceptionMessageLabel_5_1.setForeground(Color.RED);
        ExceptionMessageLabel_5_1.setVisible(false);
        JLabel quantityLable_5 = new JLabel("Количество:");
        JLabel ExceptionMessageLabel_5_2 = new JLabel("Ошибка: количество меньше 0");
        ExceptionMessageLabel_5_2.setForeground(Color.RED);
        ExceptionMessageLabel_5_2.setVisible(false);
        JLabel valveLable_5 = new JLabel("Клапан(см.):");

        JFormattedTextField sideOne_5 = new JFormattedTextField(
                new NumberFormatter(number));
        sideOne_5.setColumns(3);
        sideOne_5.setValue(0);
        JFormattedTextField sideTwo_5 = new JFormattedTextField(
                new NumberFormatter(number));
        sideTwo_5.setColumns(3);
        sideTwo_5.setValue(0);
        JFormattedTextField quantityTextField_5 = new JFormattedTextField(
                new NumberFormatter(number));
        quantityTextField_5.setColumns(3);
        quantityTextField_5.setValue(0);
        JFormattedTextField valveTextField_5 = new JFormattedTextField(
                new NumberFormatter(number));
        valveTextField_5.setColumns(3);
        valveTextField_5.setValue(0);

        PillowcaseDataPanel.add(titlePillowcaseType1Lable_5, new GridBagConstraints(0, 40, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(activePillowcaseType1CheckBox_5, new GridBagConstraints(1, 40, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideOne_5, new GridBagConstraints(2, 40, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(typeSeparator_5, new GridBagConstraints(3, 40, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideTwo_5, new GridBagConstraints(4, 40, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(quantityLable_5, new GridBagConstraints(5, 40, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(quantityTextField_5, new GridBagConstraints(6, 40, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(valveLable_5, new GridBagConstraints(7, 40, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(valveTextField_5, new GridBagConstraints(8, 40, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageLabel_5_1, new GridBagConstraints(0, 41, 6, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageLabel_5_2, new GridBagConstraints(0, 42, 8, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // прописываем логику действия при клике на чекбокс
        boolean valueActivePillowcaseType1CheckBox_5 = activePillowcaseType1CheckBox_5.isSelected();
        if (valueActivePillowcaseType1CheckBox_5 == false){
            sideOne_5.setEditable(false);
            sideTwo_5.setEditable(false);
            quantityTextField_5.setEditable(false);
        }
        if (valueActivePillowcaseType1CheckBox_5 == true){
            sideOne_5.setEditable(true);
            sideTwo_5.setEditable(true);
            quantityTextField_5.setEditable(true);
        }
        activePillowcaseType1CheckBox_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean valueActivePillowcaseType1CheckBox_5 = activePillowcaseType1CheckBox_5.isSelected();
                //System.out.println(valueActivePillowcaseType1CheckBox_5);
                if (valueActivePillowcaseType1CheckBox_5 == false){
                    sideOne_5.setEditable(false);
                    sideTwo_5.setEditable(false);
                    quantityTextField_5.setEditable(false);
                }
                if (valueActivePillowcaseType1CheckBox_5 == true){
                    sideOne_5.setEditable(true);
                    sideTwo_5.setEditable(true);
                    quantityTextField_5.setEditable(true);
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
                    boolean resultFillForm_1_1 = true;
                    boolean resultFillForm_1_2 = true;
                    boolean resultFillForm_2_1 = true;
                    boolean resultFillForm_2_2 = true;
                    boolean resultFillForm_3_1 = true;
                    boolean resultFillForm_3_2 = true;
                    boolean resultFillForm_4_1 = true;
                    boolean resultFillForm_4_2 = true;
                    boolean resultFillForm_5_1 = true;
                    boolean resultFillForm_5_2 = true;


                    // проверки по Размеру №1
                    String valueSideOne_1 = sideOne_1.getText();
                    int nvalueSideOne_1 = parseInt(valueSideOne_1); // приводим строку к целому числу
                    //System.out.println(nvalueSideOne_1);
                    String valueSideTwo_1 = sideTwo_1.getText();
                    int nvalueSideTwo_1 = parseInt(valueSideTwo_1); // приводим строку к целому числу
                    //System.out.println(nvalueSideTwo_1);
                    if (nvalueSideOne_1 == 0 && nvalueSideTwo_1 != 0 || nvalueSideOne_1 != 0 && nvalueSideTwo_1 == 0 || nvalueSideOne_1 < 0 || nvalueSideTwo_1 < 0) {
                        //System.out.println("Ошибка: одна из сторон меньше или равна 0");
                        ExceptionMessageLabel_1_1.setVisible(true);
                        PillowcaseData.pack(); // оптимизировать размер окна
                        resultFillForm_1_1 = false;
                    }
                    if (nvalueSideOne_1 == 0 && nvalueSideTwo_1 == 0 || nvalueSideOne_1 > 0 && nvalueSideTwo_1 > 0) {
                        //System.out.println("Корректно");
                        ExceptionMessageLabel_1_1.setVisible(false);
                        PillowcaseData.pack(); // оптимизировать размер окна
                        resultFillForm_1_1 = true;
                    }
                    String valueQuantityTextField_1 = quantityTextField_1.getText();
                    int nvalueQuantityTextField_1 = parseInt(valueQuantityTextField_1); // приводим строку к целому числу
                    //System.out.println(nvalueQuantityTextField_1);
                    if (nvalueQuantityTextField_1 < 0) {
                        //System.out.println("Ошибка: одна из сторон меньше или равна 0");
                        ExceptionMessageLabel_1_2.setVisible(true);
                        PillowcaseData.pack(); // оптимизировать размер окна
                        resultFillForm_1_2 = false;
                    }
                    if (nvalueQuantityTextField_1 >= 0) {
                        //System.out.println("Корректно");
                        ExceptionMessageLabel_1_2.setVisible(false);
                        PillowcaseData.pack(); // оптимизировать размер окна
                        resultFillForm_1_2 = true;
                    }

                    // проверки по Размеру №2
                    String valueSideOne_2 = sideOne_2.getText();
                    int nvalueSideOne_2 = parseInt(valueSideOne_2); // приводим строку к целому числу
                    //System.out.println(nvalueSideOne_2);
                    String valueSideTwo_2 = sideTwo_2.getText();
                    int nvalueSideTwo_2 = parseInt(valueSideTwo_2); // приводим строку к целому числу
                    //System.out.println(nvalueSideTwo_2);
                    if (nvalueSideOne_2 == 0 && nvalueSideTwo_2 != 0 || nvalueSideOne_2 != 0 && nvalueSideTwo_2 == 0 || nvalueSideOne_2 < 0 || nvalueSideTwo_2 < 0) {
                        //System.out.println("Ошибка: одна из сторон меньше или равна 0");
                        ExceptionMessageLabel_2_1.setVisible(true);
                        PillowcaseData.pack(); // оптимизировать размер окна
                        resultFillForm_2_1 = false;
                    }
                    if (nvalueSideOne_2 == 0 && nvalueSideTwo_2 == 0 || nvalueSideOne_2 > 0 && nvalueSideTwo_2 > 0) {
                        //System.out.println("Корректно");
                        ExceptionMessageLabel_2_1.setVisible(false);
                        PillowcaseData.pack(); // оптимизировать размер окна
                        resultFillForm_2_1 = true;
                    }
                    String valueQuantityTextField_2 = quantityTextField_2.getText();
                    int nvalueQuantityTextField_2 = parseInt(valueQuantityTextField_2); // приводим строку к целому числу
                    //System.out.println(nvalueQuantityTextField_2);
                    if (nvalueQuantityTextField_2 < 0) {
                        //System.out.println("Ошибка: одна из сторон меньше или равна 0");
                        ExceptionMessageLabel_2_2.setVisible(true);
                        PillowcaseData.pack(); // оптимизировать размер окна
                        resultFillForm_2_2 = false;
                    }
                    if (nvalueQuantityTextField_2 >= 0) {
                        //System.out.println("Корректно");
                        ExceptionMessageLabel_2_2.setVisible(false);
                        PillowcaseData.pack(); // оптимизировать размер окна
                        resultFillForm_2_2 = true;
                    }

                    // проверки по Размеру №3
                    String valueSideOne_3 = sideOne_3.getText();
                    int nvalueSideOne_3 = parseInt(valueSideOne_3); // приводим строку к целому числу
                    //System.out.println(nvalueSideOne_3);
                    String valueSideTwo_3 = sideTwo_3.getText();
                    int nvalueSideTwo_3 = parseInt(valueSideTwo_3); // приводим строку к целому числу
                    //System.out.println(nvalueSideTwo_3);
                    if (nvalueSideOne_3 == 0 && nvalueSideTwo_3 != 0 || nvalueSideOne_3 != 0 && nvalueSideTwo_3 == 0 || nvalueSideOne_3 < 0 || nvalueSideTwo_3 < 0) {
                        //System.out.println("Ошибка: одна из сторон меньше или равна 0");
                        ExceptionMessageLabel_3_1.setVisible(true);
                        PillowcaseData.pack(); // оптимизировать размер окна
                        resultFillForm_3_1 = false;
                    }
                    if (nvalueSideOne_3 == 0 && nvalueSideTwo_3 == 0 || nvalueSideOne_3 > 0 && nvalueSideTwo_3 > 0) {
                        //System.out.println("Корректно");
                        ExceptionMessageLabel_3_1.setVisible(false);
                        PillowcaseData.pack(); // оптимизировать размер окна
                        resultFillForm_3_1 = true;
                    }
                    String valueQuantityTextField_3 = quantityTextField_3.getText();
                    int nvalueQuantityTextField_3 = parseInt(valueQuantityTextField_3); // приводим строку к целому числу
                    //System.out.println(nvalueQuantityTextField_3);
                    if (nvalueQuantityTextField_3 < 0) {
                        //System.out.println("Ошибка: одна из сторон меньше или равна 0");
                        ExceptionMessageLabel_3_2.setVisible(true);
                        PillowcaseData.pack(); // оптимизировать размер окна
                        resultFillForm_3_2 = false;
                    }
                    if (nvalueQuantityTextField_3 >= 0) {
                        //System.out.println("Корректно");
                        ExceptionMessageLabel_3_2.setVisible(false);
                        PillowcaseData.pack(); // оптимизировать размер окна
                        resultFillForm_3_2 = true;
                    }

                    // проверки по Размеру №4
                    String valueSideOne_4 = sideOne_4.getText();
                    int nvalueSideOne_4 = parseInt(valueSideOne_4); // приводим строку к целому числу
                    //System.out.println(nvalueSideOne_4);
                    String valueSideTwo_4 = sideTwo_4.getText();
                    int nvalueSideTwo_4 = parseInt(valueSideTwo_4); // приводим строку к целому числу
                    //System.out.println(nvalueSideTwo_4);
                    if (nvalueSideOne_4 == 0 && nvalueSideTwo_4 != 0 || nvalueSideOne_4 != 0 && nvalueSideTwo_4 == 0 || nvalueSideOne_4 < 0 || nvalueSideTwo_4 < 0) {
                        //System.out.println("Ошибка: одна из сторон меньше или равна 0");
                        ExceptionMessageLabel_4_1.setVisible(true);
                        PillowcaseData.pack(); // оптимизировать размер окна
                        resultFillForm_4_1 = false;
                    }
                    if (nvalueSideOne_4 == 0 && nvalueSideTwo_4 == 0 || nvalueSideOne_4 > 0 && nvalueSideTwo_4 > 0) {
                        //System.out.println("Корректно");
                        ExceptionMessageLabel_4_1.setVisible(false);
                        PillowcaseData.pack(); // оптимизировать размер окна
                        resultFillForm_4_1 = true;
                    }
                    String valueQuantityTextField_4 = quantityTextField_4.getText();
                    int nvalueQuantityTextField_4 = parseInt(valueQuantityTextField_4); // приводим строку к целому числу
                    //System.out.println(nvalueQuantityTextField_4);
                    if (nvalueQuantityTextField_4 < 0) {
                        //System.out.println("Ошибка: одна из сторон меньше или равна 0");
                        ExceptionMessageLabel_4_2.setVisible(true);
                        PillowcaseData.pack(); // оптимизировать размер окна
                        resultFillForm_4_2 = false;
                    }
                    if (nvalueQuantityTextField_4 >= 0) {
                        //System.out.println("Корректно");
                        ExceptionMessageLabel_4_2.setVisible(false);
                        PillowcaseData.pack(); // оптимизировать размер окна
                        resultFillForm_4_2 = true;
                    }

                    // проверки по Размеру №5
                    String valueSideOne_5 = sideOne_5.getText();
                    int nvalueSideOne_5 = parseInt(valueSideOne_5); // приводим строку к целому числу
                    //System.out.println(nvalueSideOne_5);
                    String valueSideTwo_5 = sideTwo_5.getText();
                    int nvalueSideTwo_5 = parseInt(valueSideTwo_5); // приводим строку к целому числу
                    //System.out.println(nvalueSideTwo_5);
                    if (nvalueSideOne_5 == 0 && nvalueSideTwo_5 != 0 || nvalueSideOne_5 != 0 && nvalueSideTwo_5 == 0 || nvalueSideOne_5 < 0 || nvalueSideTwo_5 < 0) {
                        //System.out.println("Ошибка: одна из сторон меньше или равна 0");
                        ExceptionMessageLabel_5_1.setVisible(true);
                        PillowcaseData.pack(); // оптимизировать размер окна
                        resultFillForm_5_1 = false;
                    }
                    if (nvalueSideOne_5 == 0 && nvalueSideTwo_5 == 0 || nvalueSideOne_5 > 0 && nvalueSideTwo_5 > 0) {
                        //System.out.println("Корректно");
                        ExceptionMessageLabel_5_1.setVisible(false);
                        PillowcaseData.pack(); // оптимизировать размер окна
                        resultFillForm_5_1 = true;
                    }
                    String valueQuantityTextField_5 = quantityTextField_5.getText();
                    int nvalueQuantityTextField_5 = parseInt(valueQuantityTextField_5); // приводим строку к целому числу
                    //System.out.println(nvalueQuantityTextField_5);
                    if (nvalueQuantityTextField_5 < 0) {
                        //System.out.println("Ошибка: одна из сторон меньше или равна 0");
                        ExceptionMessageLabel_5_2.setVisible(true);
                        PillowcaseData.pack(); // оптимизировать размер окна
                        resultFillForm_5_2 = false;
                    }
                    if (nvalueQuantityTextField_5 >= 0) {
                        //System.out.println("Корректно");
                        ExceptionMessageLabel_5_2.setVisible(false);
                        PillowcaseData.pack(); // оптимизировать размер окна
                        resultFillForm_5_2 = true;
                    }

                    if (resultFillForm_1_1 != true || resultFillForm_1_2 != true
                            || resultFillForm_2_1 != true || resultFillForm_2_2 != true
                            || resultFillForm_3_1 != true || resultFillForm_3_2 != true
                            || resultFillForm_4_1 != true || resultFillForm_4_2 != true
                            || resultFillForm_5_1 != true || resultFillForm_5_2 != true) {
                        resultFillForm = false;
                    }

                    //System.out.println(resultFillForm);
                    if (resultFillForm == true) {
                        int[] arraySize = new int[]{nvalueSideOne_1, nvalueSideTwo_1,
                                nvalueSideOne_2, nvalueSideTwo_2,
                                nvalueSideOne_3, nvalueSideTwo_3,
                                nvalueSideOne_4, nvalueSideTwo_4,
                                nvalueSideOne_5, nvalueSideTwo_5};

                        int[] arrayQuantity = new int[]{nvalueQuantityTextField_1,
                                nvalueQuantityTextField_2,
                                nvalueQuantityTextField_3,
                                nvalueQuantityTextField_4,
                                nvalueQuantityTextField_5};

                        int[][] arrayResultFillForm = new int[][]{arraySize, arrayQuantity};

                        GetPillowcaseData.arrayResult = arrayResultFillForm;

                        PillowcaseData.setVisible(false); // скрыть окно
                        QuiltData setQuiltData = new QuiltData();
                        setQuiltData.QuiltData(); // запускаем страницу заполнения данных по пододеяльникам
                    }
                }
            });
    }
}