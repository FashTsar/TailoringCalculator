package com.company;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // ------- создаём форму и задаём основные параметры -------
        JFrame mainPage = new JFrame("Tailoring Calculator"); // создаём фрейм и задаём загаловок
        mainPage.setSize(800, 300); // размеры окна
        mainPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // при нажатии на крестик заканчивать работу
        mainPage.setLocationRelativeTo(null); // окно появляется посередине
        mainPage.setLayout(new BorderLayout()); // способ расположения элементов в окне
        mainPage.setResizable(false); // запретить менять размер окна

        NumberFormat number = new DecimalFormat("#"); // формат ввода в поле (только цифры)

        // ------- создаём панель вкладок -------
        JTabbedPane tabbedPane = new JTabbedPane();



        // ------- НАЧАЛО оформления страницы с наволочками -------
        JPanel pillowcaseDataPage = new JPanel();
        pillowcaseDataPage.setLayout(new BorderLayout());

        // создаём панель для загаловка
        JPanel titlePagePanel = new JPanel();
        titlePagePanel.setMinimumSize(titlePagePanel.getPreferredSize()); // оптимальный минимальный размер
        JLabel TitlePageLable = new JLabel("Размеры наволочек (в сантиметрах):");

        titlePagePanel.add(TitlePageLable);
        titlePagePanel.setVisible(true);

        // создаём панель для полей
        JPanel PillowcaseDataPanel = new JPanel();
        PillowcaseDataPanel.setLayout(new GridBagLayout()); // способ расположения элементов в панели загрузки
        PillowcaseDataPanel.setMinimumSize(PillowcaseDataPanel.getPreferredSize()); // оптимальный минимальный размер

        // наволочки размер 1
        JLabel titlePillowcaseLable_1 = new JLabel("Размер №1");
        JCheckBox activePillowcaseCheckBox_1 = new JCheckBox();
        JLabel typeSeparatorLable_1 = new JLabel("x");
        JLabel quantityLable_1 = new JLabel("Количество:");
        JLabel valveLable_1 = new JLabel("Клапан(см.):");
        JLabel seamLable_1 = new JLabel("Шов(см.):");
        JLabel handSelectionLable_1 = new JLabel("Расход по большой стороне:");
        JCheckBox handSelectionCheckBox_1 = new JCheckBox();
        boolean bigHandSelection_1 = false; // считат ли расход по болшой стороне

        JFormattedTextField sideOnePillowcase_1 = new JFormattedTextField(
                new NumberFormatter(number));
        sideOnePillowcase_1.setColumns(3);
        sideOnePillowcase_1.setValue(0);
        JFormattedTextField sideTwoPillowcase_1 = new JFormattedTextField(
                new NumberFormatter(number));
        sideTwoPillowcase_1.setColumns(3);
        sideTwoPillowcase_1.setValue(0);
        JFormattedTextField quantityPillowcaseTextField_1 = new JFormattedTextField(
                new NumberFormatter(number));
        quantityPillowcaseTextField_1.setColumns(3);
        quantityPillowcaseTextField_1.setValue(0);
        JFormattedTextField valvePillowcaseTextField_1 = new JFormattedTextField(
                new NumberFormatter(number));
        valvePillowcaseTextField_1.setColumns(3);
        valvePillowcaseTextField_1.setValue(0);
        JFormattedTextField seamPillowcaseTextField_1 = new JFormattedTextField(
                new NumberFormatter(number));
        seamPillowcaseTextField_1.setColumns(3);
        seamPillowcaseTextField_1.setValue(0);

        JLabel ExceptionMessageOneLabe_1 = new JLabel("Ошибка: одна из сторон меньше или равна 0");
        ExceptionMessageOneLabe_1.setForeground(Color.RED);
        ExceptionMessageOneLabe_1.setVisible(false);
        JLabel ExceptionMessageTwoLabel_1 = new JLabel("Ошибка: количество меньше 0");
        ExceptionMessageTwoLabel_1.setForeground(Color.RED);
        ExceptionMessageTwoLabel_1.setVisible(false);
        JLabel ExceptionMessageThreeLabel_1 = new JLabel("Ошибка: размер клапана меньше 0");
        ExceptionMessageThreeLabel_1.setForeground(Color.RED);
        ExceptionMessageThreeLabel_1.setVisible(false);
        JLabel ExceptionMessageFourLabel_1 = new JLabel("Ошибка: размер клапана больше стороны изделия");
        ExceptionMessageFourLabel_1.setForeground(Color.RED);
        ExceptionMessageFourLabel_1.setVisible(false);

        PillowcaseDataPanel.add(titlePillowcaseLable_1, new GridBagConstraints(10, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(activePillowcaseCheckBox_1, new GridBagConstraints(20, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideOnePillowcase_1, new GridBagConstraints(30, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(typeSeparatorLable_1, new GridBagConstraints(40, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideTwoPillowcase_1, new GridBagConstraints(50, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(quantityLable_1, new GridBagConstraints(60, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(quantityPillowcaseTextField_1, new GridBagConstraints(70, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(valveLable_1, new GridBagConstraints(80, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(valvePillowcaseTextField_1, new GridBagConstraints(90, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(seamLable_1, new GridBagConstraints(100, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(seamPillowcaseTextField_1, new GridBagConstraints(110, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(handSelectionLable_1, new GridBagConstraints(120, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(handSelectionCheckBox_1, new GridBagConstraints(130, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageOneLabe_1, new GridBagConstraints(0, 11, 110, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageTwoLabel_1, new GridBagConstraints(0, 12, 110, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageThreeLabel_1, new GridBagConstraints(0, 13, 110, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageFourLabel_1, new GridBagConstraints(0, 14, 110, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        // прописываем логику действия при клике на чекбокс заполнения
        boolean valueActivePillowcaseCheckBox_1 = activePillowcaseCheckBox_1.isSelected();
        if (valueActivePillowcaseCheckBox_1 == false){
            sideOnePillowcase_1.setEditable(false);
            sideTwoPillowcase_1.setEditable(false);
            quantityPillowcaseTextField_1.setEditable(false);
            valvePillowcaseTextField_1.setEditable(false);
            seamPillowcaseTextField_1.setEditable(false);
        }
        if (valueActivePillowcaseCheckBox_1 == true){
            sideOnePillowcase_1.setEditable(true);
            sideTwoPillowcase_1.setEditable(true);
            quantityPillowcaseTextField_1.setEditable(true);
            valvePillowcaseTextField_1.setEditable(true);
            seamPillowcaseTextField_1.setEditable(true);
        }
        activePillowcaseCheckBox_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean valueActivePillowcaseCheckBox_1 = activePillowcaseCheckBox_1.isSelected();
                //System.out.println(valueActivePillowcaseType1CheckBox_1);
                if (valueActivePillowcaseCheckBox_1 == false){
                    sideOnePillowcase_1.setEditable(false);
                    sideTwoPillowcase_1.setEditable(false);
                    quantityPillowcaseTextField_1.setEditable(false);
                    valvePillowcaseTextField_1.setEditable(false);
                    seamPillowcaseTextField_1.setEditable(false);
                }
                if (valueActivePillowcaseCheckBox_1 == true){
                    sideOnePillowcase_1.setEditable(true);
                    sideTwoPillowcase_1.setEditable(true);
                    quantityPillowcaseTextField_1.setEditable(true);
                    valvePillowcaseTextField_1.setEditable(true);
                    seamPillowcaseTextField_1.setEditable(true);
                }
            }
        });

         // прописываем логику действия при клике на чекбокс выбора стороны
         boolean valueHandSelectionCheckBox_1 = handSelectionCheckBox_1.isSelected();
         if (valueHandSelectionCheckBox_1 == false){
             bigHandSelection_1 = false;
             //System.out.println(bigHandSelection_1);
         }
         if (valueHandSelectionCheckBox_1 == true){
             bigHandSelection_1 = true;
             //System.out.println(bigHandSelection_1);
         }
         handSelectionCheckBox_1.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 boolean bigHandSelection_1 = false; // считат ли расход по болшой стороне
                 boolean valueHandSelectionCheckBox_1 = handSelectionCheckBox_1.isSelected();
                 //System.out.println(valueActivePillowcaseType1CheckBox_1);
                 if (valueHandSelectionCheckBox_1 == false){
                     bigHandSelection_1 = false;
                     //System.out.println(bigHandSelection_1);
                 }
                 if (valueHandSelectionCheckBox_1 == true){
                     bigHandSelection_1 = true;
                     //System.out.println(bigHandSelection_1);
                 }
             }
         });

        pillowcaseDataPage.add(titlePagePanel, BorderLayout.NORTH);
        pillowcaseDataPage.add(PillowcaseDataPanel, BorderLayout.CENTER); // добавить панель в окно
        pillowcaseDataPage.setVisible(true);

        JScrollPane scrollPillowcase = new JScrollPane(pillowcaseDataPage);
        scrollPillowcase.setVisible(true);
        // ------- КОНЕЦ оформления страницы с наволочками -------



        tabbedPane.addTab("наволочки", scrollPillowcase);
        tabbedPane.setVisible(true);

        // ------- создаём панель для кнопок -------
        JPanel ButtonPanel = new JPanel();
        ButtonPanel.setMinimumSize(ButtonPanel.getPreferredSize()); // оптимальный минимальный размер
        JButton saveButton = new JButton("Рассчитать");
        ButtonPanel.add(saveButton);
        ButtonPanel.setVisible(true);

        mainPage.add(tabbedPane, BorderLayout.CENTER);
        mainPage.add(ButtonPanel, BorderLayout.SOUTH);
        mainPage.setVisible(true);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}