package com.company;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import static java.lang.Integer.parseInt;

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

        // -= наволочки размер 1 =-
        JLabel titlePillowcaseLable_1 = new JLabel("Размер №1");
        JCheckBox activePillowcaseCheckBox_1 = new JCheckBox();
        JLabel typeSeparatorPillowcaseLable_1 = new JLabel("x");
        JLabel quantityPillowcaseLable_1 = new JLabel("Количество:");
        JLabel valvePillowcaseLable_1 = new JLabel("Клапан(см.):");
        JLabel seamPillowcaseLable_1 = new JLabel("Шов(см.):");
        JLabel handSelectionPillowcaseLable_1 = new JLabel("Расход по большой стороне:");
        JCheckBox handSelectionPillowcaseCheckBox_1 = new JCheckBox();

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

        JLabel ExceptionMessageOnePillowcaseLabe_1 = new JLabel("Ошибка: одна из сторон меньше или равна 0");
        ExceptionMessageOnePillowcaseLabe_1.setForeground(Color.RED);
        ExceptionMessageOnePillowcaseLabe_1.setVisible(false);
        JLabel ExceptionMessageTwoPillowcaseLabel_1 = new JLabel("Ошибка: количество меньше 0");
        ExceptionMessageTwoPillowcaseLabel_1.setForeground(Color.RED);
        ExceptionMessageTwoPillowcaseLabel_1.setVisible(false);
        JLabel ExceptionMessageThreePillowcaseLabel_1 = new JLabel("Ошибка: размер клапана меньше 0 или больше стороны изделия");
        ExceptionMessageThreePillowcaseLabel_1.setForeground(Color.RED);
        ExceptionMessageThreePillowcaseLabel_1.setVisible(false);
        JLabel ExceptionMessageFourPillowcaseLabel_1 = new JLabel("Ошибка: шов меньше 0");
        ExceptionMessageFourPillowcaseLabel_1.setForeground(Color.RED);
        ExceptionMessageFourPillowcaseLabel_1.setVisible(false);

        PillowcaseDataPanel.add(titlePillowcaseLable_1, new GridBagConstraints(10, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(activePillowcaseCheckBox_1, new GridBagConstraints(20, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideOnePillowcase_1, new GridBagConstraints(30, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(typeSeparatorPillowcaseLable_1, new GridBagConstraints(40, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideTwoPillowcase_1, new GridBagConstraints(50, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(quantityPillowcaseLable_1, new GridBagConstraints(60, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(quantityPillowcaseTextField_1, new GridBagConstraints(70, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(valvePillowcaseLable_1, new GridBagConstraints(80, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(valvePillowcaseTextField_1, new GridBagConstraints(90, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(seamPillowcaseLable_1, new GridBagConstraints(100, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(seamPillowcaseTextField_1, new GridBagConstraints(110, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(handSelectionPillowcaseLable_1, new GridBagConstraints(120, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(handSelectionPillowcaseCheckBox_1, new GridBagConstraints(130, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageOnePillowcaseLabe_1, new GridBagConstraints(0, 11, 110, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageTwoPillowcaseLabel_1, new GridBagConstraints(0, 12, 110, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageThreePillowcaseLabel_1, new GridBagConstraints(0, 13, 110, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageFourPillowcaseLabel_1, new GridBagConstraints(0, 14, 110, 1, 1, 1,
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

        // -= наволочки размер 2 =-
        JLabel titlePillowcaseLable_2 = new JLabel("Размер №2");
        JCheckBox activePillowcaseCheckBox_2 = new JCheckBox();
        JLabel typeSeparatorPillowcaseLable_2 = new JLabel("x");
        JLabel quantityPillowcaseLable_2 = new JLabel("Количество:");
        JLabel valvePillowcaseLable_2 = new JLabel("Клапан(см.):");
        JLabel seamPillowcaseLable_2 = new JLabel("Шов(см.):");
        JLabel handSelectionPillowcaseLable_2 = new JLabel("Расход по большой стороне:");
        JCheckBox handSelectionPillowcaseCheckBox_2 = new JCheckBox();

        JFormattedTextField sideOnePillowcase_2 = new JFormattedTextField(
                new NumberFormatter(number));
        sideOnePillowcase_2.setColumns(3);
        sideOnePillowcase_2.setValue(0);
        JFormattedTextField sideTwoPillowcase_2 = new JFormattedTextField(
                new NumberFormatter(number));
        sideTwoPillowcase_2.setColumns(3);
        sideTwoPillowcase_2.setValue(0);
        JFormattedTextField quantityPillowcaseTextField_2 = new JFormattedTextField(
                new NumberFormatter(number));
        quantityPillowcaseTextField_2.setColumns(3);
        quantityPillowcaseTextField_2.setValue(0);
        JFormattedTextField valvePillowcaseTextField_2 = new JFormattedTextField(
                new NumberFormatter(number));
        valvePillowcaseTextField_2.setColumns(3);
        valvePillowcaseTextField_2.setValue(0);
        JFormattedTextField seamPillowcaseTextField_2 = new JFormattedTextField(
                new NumberFormatter(number));
        seamPillowcaseTextField_2.setColumns(3);
        seamPillowcaseTextField_2.setValue(0);

        JLabel ExceptionMessageOnePillowcaseLabe_2 = new JLabel("Ошибка: одна из сторон меньше или равна 0");
        ExceptionMessageOnePillowcaseLabe_2.setForeground(Color.RED);
        ExceptionMessageOnePillowcaseLabe_2.setVisible(false);
        JLabel ExceptionMessageTwoPillowcaseLabel_2 = new JLabel("Ошибка: количество меньше 0");
        ExceptionMessageTwoPillowcaseLabel_2.setForeground(Color.RED);
        ExceptionMessageTwoPillowcaseLabel_2.setVisible(false);
        JLabel ExceptionMessageThreePillowcaseLabel_2 = new JLabel("Ошибка: размер клапана меньше 0 или больше стороны изделия");
        ExceptionMessageThreePillowcaseLabel_2.setForeground(Color.RED);
        ExceptionMessageThreePillowcaseLabel_2.setVisible(false);
        JLabel ExceptionMessageFourPillowcaseLabel_2 = new JLabel("Ошибка: шов меньше 0");
        ExceptionMessageFourPillowcaseLabel_2.setForeground(Color.RED);
        ExceptionMessageFourPillowcaseLabel_2.setVisible(false);

        PillowcaseDataPanel.add(titlePillowcaseLable_2, new GridBagConstraints(10, 20, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(activePillowcaseCheckBox_2, new GridBagConstraints(20, 20, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideOnePillowcase_2, new GridBagConstraints(30, 20, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(typeSeparatorPillowcaseLable_2, new GridBagConstraints(40, 20, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideTwoPillowcase_2, new GridBagConstraints(50, 20, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(quantityPillowcaseLable_2, new GridBagConstraints(60, 20, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(quantityPillowcaseTextField_2, new GridBagConstraints(70, 20, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(valvePillowcaseLable_2, new GridBagConstraints(80, 20, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(valvePillowcaseTextField_2, new GridBagConstraints(90, 20, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(seamPillowcaseLable_2, new GridBagConstraints(100, 20, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(seamPillowcaseTextField_2, new GridBagConstraints(110, 20, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(handSelectionPillowcaseLable_2, new GridBagConstraints(120, 20, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(handSelectionPillowcaseCheckBox_2, new GridBagConstraints(130, 20, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageOnePillowcaseLabe_2, new GridBagConstraints(0, 21, 110, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageTwoPillowcaseLabel_2, new GridBagConstraints(0, 22, 110, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageThreePillowcaseLabel_2, new GridBagConstraints(0, 23, 110, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageFourPillowcaseLabel_2, new GridBagConstraints(0, 24, 110, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        // прописываем логику действия при клике на чекбокс заполнения
        boolean valueActivePillowcaseCheckBox_2 = activePillowcaseCheckBox_2.isSelected();
        if (valueActivePillowcaseCheckBox_2 == false){
            sideOnePillowcase_2.setEditable(false);
            sideTwoPillowcase_2.setEditable(false);
            quantityPillowcaseTextField_2.setEditable(false);
            valvePillowcaseTextField_2.setEditable(false);
            seamPillowcaseTextField_2.setEditable(false);
        }
        if (valueActivePillowcaseCheckBox_2 == true){
            sideOnePillowcase_2.setEditable(true);
            sideTwoPillowcase_2.setEditable(true);
            quantityPillowcaseTextField_2.setEditable(true);
            valvePillowcaseTextField_2.setEditable(true);
            seamPillowcaseTextField_2.setEditable(true);
        }
        activePillowcaseCheckBox_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean valueActivePillowcaseCheckBox_2 = activePillowcaseCheckBox_2.isSelected();
                //System.out.println(valueActivePillowcaseType1CheckBox_1);
                if (valueActivePillowcaseCheckBox_2 == false){
                    sideOnePillowcase_2.setEditable(false);
                    sideTwoPillowcase_2.setEditable(false);
                    quantityPillowcaseTextField_2.setEditable(false);
                    valvePillowcaseTextField_2.setEditable(false);
                    seamPillowcaseTextField_2.setEditable(false);
                }
                if (valueActivePillowcaseCheckBox_2 == true){
                    sideOnePillowcase_2.setEditable(true);
                    sideTwoPillowcase_2.setEditable(true);
                    quantityPillowcaseTextField_2.setEditable(true);
                    valvePillowcaseTextField_2.setEditable(true);
                    seamPillowcaseTextField_2.setEditable(true);
                }
            }
        });

        // -= наволочки размер 3 =-
        JLabel titlePillowcaseLable_3 = new JLabel("Размер №3");
        JCheckBox activePillowcaseCheckBox_3 = new JCheckBox();
        JLabel typeSeparatorPillowcaseLable_3 = new JLabel("x");
        JLabel quantityPillowcaseLable_3 = new JLabel("Количество:");
        JLabel valvePillowcaseLable_3 = new JLabel("Клапан(см.):");
        JLabel seamPillowcaseLable_3 = new JLabel("Шов(см.):");
        JLabel handSelectionPillowcaseLable_3 = new JLabel("Расход по большой стороне:");
        JCheckBox handSelectionPillowcaseCheckBox_3 = new JCheckBox();

        JFormattedTextField sideOnePillowcase_3 = new JFormattedTextField(
                new NumberFormatter(number));
        sideOnePillowcase_3.setColumns(3);
        sideOnePillowcase_3.setValue(0);
        JFormattedTextField sideTwoPillowcase_3 = new JFormattedTextField(
                new NumberFormatter(number));
        sideTwoPillowcase_3.setColumns(3);
        sideTwoPillowcase_3.setValue(0);
        JFormattedTextField quantityPillowcaseTextField_3 = new JFormattedTextField(
                new NumberFormatter(number));
        quantityPillowcaseTextField_3.setColumns(3);
        quantityPillowcaseTextField_3.setValue(0);
        JFormattedTextField valvePillowcaseTextField_3 = new JFormattedTextField(
                new NumberFormatter(number));
        valvePillowcaseTextField_3.setColumns(3);
        valvePillowcaseTextField_3.setValue(0);
        JFormattedTextField seamPillowcaseTextField_3 = new JFormattedTextField(
                new NumberFormatter(number));
        seamPillowcaseTextField_3.setColumns(3);
        seamPillowcaseTextField_3.setValue(0);

        JLabel ExceptionMessageOnePillowcaseLabe_3 = new JLabel("Ошибка: одна из сторон меньше или равна 0");
        ExceptionMessageOnePillowcaseLabe_3.setForeground(Color.RED);
        ExceptionMessageOnePillowcaseLabe_3.setVisible(false);
        JLabel ExceptionMessageTwoPillowcaseLabel_3 = new JLabel("Ошибка: количество меньше 0");
        ExceptionMessageTwoPillowcaseLabel_3.setForeground(Color.RED);
        ExceptionMessageTwoPillowcaseLabel_3.setVisible(false);
        JLabel ExceptionMessageThreePillowcaseLabel_3 = new JLabel("Ошибка: размер клапана меньше 0 или больше стороны изделия");
        ExceptionMessageThreePillowcaseLabel_3.setForeground(Color.RED);
        ExceptionMessageThreePillowcaseLabel_3.setVisible(false);
        JLabel ExceptionMessageFourPillowcaseLabel_3 = new JLabel("Ошибка: шов меньше 0");
        ExceptionMessageFourPillowcaseLabel_3.setForeground(Color.RED);
        ExceptionMessageFourPillowcaseLabel_3.setVisible(false);

        PillowcaseDataPanel.add(titlePillowcaseLable_3, new GridBagConstraints(10, 30, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(activePillowcaseCheckBox_3, new GridBagConstraints(20, 30, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideOnePillowcase_3, new GridBagConstraints(30, 30, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(typeSeparatorPillowcaseLable_3, new GridBagConstraints(40, 30, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideTwoPillowcase_3, new GridBagConstraints(50, 30, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(quantityPillowcaseLable_3, new GridBagConstraints(60, 30, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(quantityPillowcaseTextField_3, new GridBagConstraints(70, 30, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(valvePillowcaseLable_3, new GridBagConstraints(80, 30, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(valvePillowcaseTextField_3, new GridBagConstraints(90, 30, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(seamPillowcaseLable_3, new GridBagConstraints(100, 30, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(seamPillowcaseTextField_3, new GridBagConstraints(110, 30, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(handSelectionPillowcaseLable_3, new GridBagConstraints(120, 30, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(handSelectionPillowcaseCheckBox_3, new GridBagConstraints(130, 30, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageOnePillowcaseLabe_3, new GridBagConstraints(0, 31, 110, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageTwoPillowcaseLabel_3, new GridBagConstraints(0, 32, 110, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageThreePillowcaseLabel_3, new GridBagConstraints(0, 33, 110, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageFourPillowcaseLabel_3, new GridBagConstraints(0, 34, 110, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        // прописываем логику действия при клике на чекбокс заполнения
        boolean valueActivePillowcaseCheckBox_3 = activePillowcaseCheckBox_3.isSelected();
        if (valueActivePillowcaseCheckBox_3 == false){
            sideOnePillowcase_3.setEditable(false);
            sideTwoPillowcase_3.setEditable(false);
            quantityPillowcaseTextField_3.setEditable(false);
            valvePillowcaseTextField_3.setEditable(false);
            seamPillowcaseTextField_3.setEditable(false);
        }
        if (valueActivePillowcaseCheckBox_3 == true){
            sideOnePillowcase_3.setEditable(true);
            sideTwoPillowcase_3.setEditable(true);
            quantityPillowcaseTextField_3.setEditable(true);
            valvePillowcaseTextField_3.setEditable(true);
            seamPillowcaseTextField_3.setEditable(true);
        }
        activePillowcaseCheckBox_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean valueActivePillowcaseCheckBox_3 = activePillowcaseCheckBox_3.isSelected();
                //System.out.println(valueActivePillowcaseType1CheckBox_1);
                if (valueActivePillowcaseCheckBox_3 == false){
                    sideOnePillowcase_3.setEditable(false);
                    sideTwoPillowcase_3.setEditable(false);
                    quantityPillowcaseTextField_3.setEditable(false);
                    valvePillowcaseTextField_3.setEditable(false);
                    seamPillowcaseTextField_3.setEditable(false);
                }
                if (valueActivePillowcaseCheckBox_3 == true){
                    sideOnePillowcase_3.setEditable(true);
                    sideTwoPillowcase_3.setEditable(true);
                    quantityPillowcaseTextField_3.setEditable(true);
                    valvePillowcaseTextField_3.setEditable(true);
                    seamPillowcaseTextField_3.setEditable(true);
                }
            }
        });

        // -= наволочки размер 4 =-
        JLabel titlePillowcaseLable_4 = new JLabel("Размер №4");
        JCheckBox activePillowcaseCheckBox_4 = new JCheckBox();
        JLabel typeSeparatorPillowcaseLable_4 = new JLabel("x");
        JLabel quantityPillowcaseLable_4 = new JLabel("Количество:");
        JLabel valvePillowcaseLable_4 = new JLabel("Клапан(см.):");
        JLabel seamPillowcaseLable_4 = new JLabel("Шов(см.):");
        JLabel handSelectionPillowcaseLable_4 = new JLabel("Расход по большой стороне:");
        JCheckBox handSelectionPillowcaseCheckBox_4 = new JCheckBox();

        JFormattedTextField sideOnePillowcase_4 = new JFormattedTextField(
                new NumberFormatter(number));
        sideOnePillowcase_4.setColumns(3);
        sideOnePillowcase_4.setValue(0);
        JFormattedTextField sideTwoPillowcase_4 = new JFormattedTextField(
                new NumberFormatter(number));
        sideTwoPillowcase_4.setColumns(3);
        sideTwoPillowcase_4.setValue(0);
        JFormattedTextField quantityPillowcaseTextField_4 = new JFormattedTextField(
                new NumberFormatter(number));
        quantityPillowcaseTextField_4.setColumns(3);
        quantityPillowcaseTextField_4.setValue(0);
        JFormattedTextField valvePillowcaseTextField_4 = new JFormattedTextField(
                new NumberFormatter(number));
        valvePillowcaseTextField_4.setColumns(3);
        valvePillowcaseTextField_4.setValue(0);
        JFormattedTextField seamPillowcaseTextField_4 = new JFormattedTextField(
                new NumberFormatter(number));
        seamPillowcaseTextField_4.setColumns(3);
        seamPillowcaseTextField_4.setValue(0);

        JLabel ExceptionMessageOnePillowcaseLabe_4 = new JLabel("Ошибка: одна из сторон меньше или равна 0");
        ExceptionMessageOnePillowcaseLabe_4.setForeground(Color.RED);
        ExceptionMessageOnePillowcaseLabe_4.setVisible(false);
        JLabel ExceptionMessageTwoPillowcaseLabel_4 = new JLabel("Ошибка: количество меньше 0");
        ExceptionMessageTwoPillowcaseLabel_4.setForeground(Color.RED);
        ExceptionMessageTwoPillowcaseLabel_4.setVisible(false);
        JLabel ExceptionMessageThreePillowcaseLabel_4 = new JLabel("Ошибка: размер клапана меньше 0 или больше стороны изделия");
        ExceptionMessageThreePillowcaseLabel_4.setForeground(Color.RED);
        ExceptionMessageThreePillowcaseLabel_4.setVisible(false);
        JLabel ExceptionMessageFourPillowcaseLabel_4 = new JLabel("Ошибка: шов меньше 0");
        ExceptionMessageFourPillowcaseLabel_4.setForeground(Color.RED);
        ExceptionMessageFourPillowcaseLabel_4.setVisible(false);

        PillowcaseDataPanel.add(titlePillowcaseLable_4, new GridBagConstraints(10, 40, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(activePillowcaseCheckBox_4, new GridBagConstraints(20, 40, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideOnePillowcase_4, new GridBagConstraints(30, 40, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(typeSeparatorPillowcaseLable_4, new GridBagConstraints(40, 40, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideTwoPillowcase_4, new GridBagConstraints(50, 40, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(quantityPillowcaseLable_4, new GridBagConstraints(60, 40, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(quantityPillowcaseTextField_4, new GridBagConstraints(70, 40, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(valvePillowcaseLable_4, new GridBagConstraints(80, 40, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(valvePillowcaseTextField_4, new GridBagConstraints(90, 40, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(seamPillowcaseLable_4, new GridBagConstraints(100, 40, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(seamPillowcaseTextField_4, new GridBagConstraints(110, 40, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(handSelectionPillowcaseLable_4, new GridBagConstraints(120, 40, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(handSelectionPillowcaseCheckBox_4, new GridBagConstraints(130, 40, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageOnePillowcaseLabe_4, new GridBagConstraints(0, 41, 110, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageTwoPillowcaseLabel_4, new GridBagConstraints(0, 42, 110, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageThreePillowcaseLabel_4, new GridBagConstraints(0, 43, 110, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageFourPillowcaseLabel_4, new GridBagConstraints(0, 44, 110, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        // прописываем логику действия при клике на чекбокс заполнения
        boolean valueActivePillowcaseCheckBox_4 = activePillowcaseCheckBox_4.isSelected();
        if (valueActivePillowcaseCheckBox_4 == false){
            sideOnePillowcase_4.setEditable(false);
            sideTwoPillowcase_4.setEditable(false);
            quantityPillowcaseTextField_4.setEditable(false);
            valvePillowcaseTextField_4.setEditable(false);
            seamPillowcaseTextField_4.setEditable(false);
        }
        if (valueActivePillowcaseCheckBox_4 == true){
            sideOnePillowcase_4.setEditable(true);
            sideTwoPillowcase_4.setEditable(true);
            quantityPillowcaseTextField_4.setEditable(true);
            valvePillowcaseTextField_4.setEditable(true);
            seamPillowcaseTextField_4.setEditable(true);
        }
        activePillowcaseCheckBox_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean valueActivePillowcaseCheckBox_4 = activePillowcaseCheckBox_4.isSelected();
                //System.out.println(valueActivePillowcaseType1CheckBox_4);
                if (valueActivePillowcaseCheckBox_4 == false){
                    sideOnePillowcase_4.setEditable(false);
                    sideTwoPillowcase_4.setEditable(false);
                    quantityPillowcaseTextField_4.setEditable(false);
                    valvePillowcaseTextField_4.setEditable(false);
                    seamPillowcaseTextField_4.setEditable(false);
                }
                if (valueActivePillowcaseCheckBox_4 == true){
                    sideOnePillowcase_4.setEditable(true);
                    sideTwoPillowcase_4.setEditable(true);
                    quantityPillowcaseTextField_4.setEditable(true);
                    valvePillowcaseTextField_4.setEditable(true);
                    seamPillowcaseTextField_4.setEditable(true);
                }
            }
        });

        // -= наволочки размер 5 =-
        JLabel titlePillowcaseLable_5 = new JLabel("Размер №5");
        JCheckBox activePillowcaseCheckBox_5 = new JCheckBox();
        JLabel typeSeparatorPillowcaseLable_5 = new JLabel("x");
        JLabel quantityPillowcaseLable_5 = new JLabel("Количество:");
        JLabel valvePillowcaseLable_5 = new JLabel("Клапан(см.):");
        JLabel seamPillowcaseLable_5 = new JLabel("Шов(см.):");
        JLabel handSelectionPillowcaseLable_5 = new JLabel("Расход по большой стороне:");
        JCheckBox handSelectionPillowcaseCheckBox_5 = new JCheckBox();

        JFormattedTextField sideOnePillowcase_5 = new JFormattedTextField(
                new NumberFormatter(number));
        sideOnePillowcase_5.setColumns(3);
        sideOnePillowcase_5.setValue(0);
        JFormattedTextField sideTwoPillowcase_5 = new JFormattedTextField(
                new NumberFormatter(number));
        sideTwoPillowcase_5.setColumns(3);
        sideTwoPillowcase_5.setValue(0);
        JFormattedTextField quantityPillowcaseTextField_5 = new JFormattedTextField(
                new NumberFormatter(number));
        quantityPillowcaseTextField_5.setColumns(3);
        quantityPillowcaseTextField_5.setValue(0);
        JFormattedTextField valvePillowcaseTextField_5 = new JFormattedTextField(
                new NumberFormatter(number));
        valvePillowcaseTextField_5.setColumns(3);
        valvePillowcaseTextField_5.setValue(0);
        JFormattedTextField seamPillowcaseTextField_5 = new JFormattedTextField(
                new NumberFormatter(number));
        seamPillowcaseTextField_5.setColumns(3);
        seamPillowcaseTextField_5.setValue(0);

        JLabel ExceptionMessageOnePillowcaseLabe_5 = new JLabel("Ошибка: одна из сторон меньше или равна 0");
        ExceptionMessageOnePillowcaseLabe_5.setForeground(Color.RED);
        ExceptionMessageOnePillowcaseLabe_5.setVisible(false);
        JLabel ExceptionMessageTwoPillowcaseLabel_5 = new JLabel("Ошибка: количество меньше 0");
        ExceptionMessageTwoPillowcaseLabel_5.setForeground(Color.RED);
        ExceptionMessageTwoPillowcaseLabel_5.setVisible(false);
        JLabel ExceptionMessageThreePillowcaseLabel_5 = new JLabel("Ошибка: размер клапана меньше 0 или больше стороны изделия");
        ExceptionMessageThreePillowcaseLabel_5.setForeground(Color.RED);
        ExceptionMessageThreePillowcaseLabel_5.setVisible(false);
        JLabel ExceptionMessageFourPillowcaseLabel_5 = new JLabel("Ошибка: шов меньше 0");
        ExceptionMessageFourPillowcaseLabel_5.setForeground(Color.RED);
        ExceptionMessageFourPillowcaseLabel_5.setVisible(false);

        PillowcaseDataPanel.add(titlePillowcaseLable_5, new GridBagConstraints(10, 50, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(activePillowcaseCheckBox_5, new GridBagConstraints(20, 50, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideOnePillowcase_5, new GridBagConstraints(30, 50, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(typeSeparatorPillowcaseLable_5, new GridBagConstraints(40, 50, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideTwoPillowcase_5, new GridBagConstraints(50, 50, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(quantityPillowcaseLable_5, new GridBagConstraints(60, 50, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(quantityPillowcaseTextField_5, new GridBagConstraints(70, 50, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(valvePillowcaseLable_5, new GridBagConstraints(80, 50, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(valvePillowcaseTextField_5, new GridBagConstraints(90, 50, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(seamPillowcaseLable_5, new GridBagConstraints(100, 50, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(seamPillowcaseTextField_5, new GridBagConstraints(110, 50, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(handSelectionPillowcaseLable_5, new GridBagConstraints(120, 50, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(handSelectionPillowcaseCheckBox_5, new GridBagConstraints(130, 50, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageOnePillowcaseLabe_5, new GridBagConstraints(0, 51, 110, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageTwoPillowcaseLabel_5, new GridBagConstraints(0, 52, 110, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageThreePillowcaseLabel_5, new GridBagConstraints(0, 53, 110, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageFourPillowcaseLabel_5, new GridBagConstraints(0, 54, 110, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        // прописываем логику действия при клике на чекбокс заполнения
        boolean valueActivePillowcaseCheckBox_5 = activePillowcaseCheckBox_5.isSelected();
        if (valueActivePillowcaseCheckBox_5 == false){
            sideOnePillowcase_5.setEditable(false);
            sideTwoPillowcase_5.setEditable(false);
            quantityPillowcaseTextField_5.setEditable(false);
            valvePillowcaseTextField_5.setEditable(false);
            seamPillowcaseTextField_5.setEditable(false);
        }
        if (valueActivePillowcaseCheckBox_5 == true){
            sideOnePillowcase_5.setEditable(true);
            sideTwoPillowcase_5.setEditable(true);
            quantityPillowcaseTextField_5.setEditable(true);
            valvePillowcaseTextField_5.setEditable(true);
            seamPillowcaseTextField_5.setEditable(true);
        }
        activePillowcaseCheckBox_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean valueActivePillowcaseCheckBox_5 = activePillowcaseCheckBox_5.isSelected();
                //System.out.println(valueActivePillowcaseType1CheckBox_5);
                if (valueActivePillowcaseCheckBox_5 == false){
                    sideOnePillowcase_5.setEditable(false);
                    sideTwoPillowcase_5.setEditable(false);
                    quantityPillowcaseTextField_5.setEditable(false);
                    valvePillowcaseTextField_5.setEditable(false);
                    seamPillowcaseTextField_5.setEditable(false);
                }
                if (valueActivePillowcaseCheckBox_5 == true){
                    sideOnePillowcase_5.setEditable(true);
                    sideTwoPillowcase_5.setEditable(true);
                    quantityPillowcaseTextField_5.setEditable(true);
                    valvePillowcaseTextField_5.setEditable(true);
                    seamPillowcaseTextField_5.setEditable(true);
                }
            }
        });

        pillowcaseDataPage.add(titlePagePanel, BorderLayout.NORTH);
        pillowcaseDataPage.add(PillowcaseDataPanel, BorderLayout.CENTER); // добавить панель в окно
        pillowcaseDataPage.setVisible(true);

        JScrollPane scrollPillowcase = new JScrollPane(pillowcaseDataPage);
        scrollPillowcase.setVisible(true);
        // ------- КОНЕЦ оформления вкладки с наволочками -------



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
                boolean resultFillFormAll = true;
                boolean resultFillFormPillowcase_1_1 = true;
                boolean resultFillFormPillowcase_1_2 = true;
                boolean resultFillFormPillowcase_1_3 = true;
                boolean resultFillFormPillowcase_1_4 = true;
                boolean resultFillFormPillowcase_2_1 = true;
                boolean resultFillFormPillowcase_2_2 = true;
                boolean resultFillFormPillowcase_2_3 = true;
                boolean resultFillFormPillowcase_2_4 = true;
                boolean resultFillFormPillowcase_3_1 = true;
                boolean resultFillFormPillowcase_3_2 = true;
                boolean resultFillFormPillowcase_3_3 = true;
                boolean resultFillFormPillowcase_3_4 = true;
                boolean resultFillFormPillowcase_4_1 = true;
                boolean resultFillFormPillowcase_4_2 = true;
                boolean resultFillFormPillowcase_4_3 = true;
                boolean resultFillFormPillowcase_4_4 = true;
                boolean resultFillFormPillowcase_5_1 = true;
                boolean resultFillFormPillowcase_5_2 = true;
                boolean resultFillFormPillowcase_5_3 = true;
                boolean resultFillFormPillowcase_5_4 = true;



                // ------- проверки по НАВОЛОЧКАМ -------
                // -= проверка размера 1 =-
                String vsideOnePillowcase_1 = sideOnePillowcase_1.getText();
                int nvsideOnePillowcase_1 = parseInt(vsideOnePillowcase_1); // приводим к целому числу
                //System.out.println(nvsideOnePillowcase_1);
                String vsideTwoPillowcase_1 = sideTwoPillowcase_1.getText();
                int nvsideTwoPillowcase_1 = parseInt(vsideTwoPillowcase_1); // приводим к целому числу
                //System.out.println(nvsideTwoPillowcase_1);
                if (nvsideOnePillowcase_1 != 0 && nvsideTwoPillowcase_1 == 0
                        || nvsideOnePillowcase_1 == 0 && nvsideTwoPillowcase_1 != 0
                        || nvsideOnePillowcase_1 < 0
                        || nvsideTwoPillowcase_1 < 0){
                    resultFillFormPillowcase_1_1 = false;
                    ExceptionMessageOnePillowcaseLabe_1.setVisible(true);
                }
                if (nvsideOnePillowcase_1 == 0 && nvsideTwoPillowcase_1 == 0
                        || nvsideOnePillowcase_1 > 0 && nvsideTwoPillowcase_1 > 0){
                    resultFillFormPillowcase_1_1 = true;
                    ExceptionMessageOnePillowcaseLabe_1.setVisible(false);
                }
                String vquantityPillowcaseTextField_1 = quantityPillowcaseTextField_1.getText();
                int nvquantityPillowcaseTextField_1 = parseInt(vquantityPillowcaseTextField_1); // приводим к целому числу
                //System.out.println(nvquantityPillowcaseTextField_1);
                if (nvquantityPillowcaseTextField_1 < 0){
                    resultFillFormPillowcase_1_2 = false;
                    ExceptionMessageTwoPillowcaseLabel_1.setVisible(true);
                }
                if (nvquantityPillowcaseTextField_1 >= 0){
                    resultFillFormPillowcase_1_2 = true;
                    ExceptionMessageTwoPillowcaseLabel_1.setVisible(false);
                }
                String vvalvePillowcaseTextField_1 = valvePillowcaseTextField_1.getText();
                int nvvalvePillowcaseTextField_1 = parseInt(vvalvePillowcaseTextField_1); // приводим к целому числу
                //System.out.println(nvvalvePillowcaseTextField_1);
                if (nvvalvePillowcaseTextField_1 < 0
                        || nvvalvePillowcaseTextField_1 > nvsideOnePillowcase_1
                        || nvvalvePillowcaseTextField_1 > nvsideTwoPillowcase_1){
                    resultFillFormPillowcase_1_3 = false;
                    ExceptionMessageThreePillowcaseLabel_1.setVisible(true);
                }
                if (nvvalvePillowcaseTextField_1 >= 0
                        && nvvalvePillowcaseTextField_1 <= nvsideOnePillowcase_1
                        && nvvalvePillowcaseTextField_1 <= nvsideTwoPillowcase_1){
                    resultFillFormPillowcase_1_3 = true;
                    ExceptionMessageThreePillowcaseLabel_1.setVisible(false);
                }
                String vseamPillowcaseTextField_1 = seamPillowcaseTextField_1.getText();
                int nvseamPillowcaseTextField_1 = parseInt(vseamPillowcaseTextField_1); // приводим к целому числу
                //System.out.println(nvseamPillowcaseTextField_1);
                if (nvseamPillowcaseTextField_1 < 0){
                    resultFillFormPillowcase_1_4 = false;
                    ExceptionMessageFourPillowcaseLabel_1.setVisible(true);
                }
                if (nvseamPillowcaseTextField_1 >= 0){
                    resultFillFormPillowcase_1_4 = true;
                    ExceptionMessageFourPillowcaseLabel_1.setVisible(false);
                }

                // -= проверка размера 2 =-
                String vsideOnePillowcase_2 = sideOnePillowcase_2.getText();
                int nvsideOnePillowcase_2 = parseInt(vsideOnePillowcase_2); // приводим к целому числу
                //System.out.println(nvsideOnePillowcase_2);
                String vsideTwoPillowcase_2 = sideTwoPillowcase_2.getText();
                int nvsideTwoPillowcase_2 = parseInt(vsideTwoPillowcase_2); // приводим к целому числу
                //System.out.println(nvsideTwoPillowcase_2);
                if (nvsideOnePillowcase_2 != 0 && nvsideTwoPillowcase_2 == 0
                        || nvsideOnePillowcase_2 == 0 && nvsideTwoPillowcase_2 != 0
                        || nvsideOnePillowcase_2 < 0
                        || nvsideTwoPillowcase_2 < 0){
                    resultFillFormPillowcase_2_1 = false;
                    ExceptionMessageOnePillowcaseLabe_2.setVisible(true);
                }
                if (nvsideOnePillowcase_2 == 0 && nvsideTwoPillowcase_2 == 0
                        || nvsideOnePillowcase_2 > 0 && nvsideTwoPillowcase_2 > 0){
                    resultFillFormPillowcase_2_1 = true;
                    ExceptionMessageOnePillowcaseLabe_2.setVisible(false);
                }
                String vquantityPillowcaseTextField_2 = quantityPillowcaseTextField_2.getText();
                int nvquantityPillowcaseTextField_2 = parseInt(vquantityPillowcaseTextField_2); // приводим к целому числу
                //System.out.println(nvquantityPillowcaseTextField_2);
                if (nvquantityPillowcaseTextField_2 < 0){
                    resultFillFormPillowcase_2_2 = false;
                    ExceptionMessageTwoPillowcaseLabel_2.setVisible(true);
                }
                if (nvquantityPillowcaseTextField_2 >= 0){
                    resultFillFormPillowcase_2_2 = true;
                    ExceptionMessageTwoPillowcaseLabel_2.setVisible(false);
                }
                String vvalvePillowcaseTextField_2 = valvePillowcaseTextField_2.getText();
                int nvvalvePillowcaseTextField_2 = parseInt(vvalvePillowcaseTextField_2); // приводим к целому числу
                //System.out.println(nvvalvePillowcaseTextField_2);
                if (nvvalvePillowcaseTextField_2 < 0
                        || nvvalvePillowcaseTextField_2 > nvsideOnePillowcase_2
                        || nvvalvePillowcaseTextField_2 > nvsideTwoPillowcase_2){
                    resultFillFormPillowcase_2_3 = false;
                    ExceptionMessageThreePillowcaseLabel_2.setVisible(true);
                }
                if (nvvalvePillowcaseTextField_2 >= 0
                        && nvvalvePillowcaseTextField_2 <= nvsideOnePillowcase_2
                        && nvvalvePillowcaseTextField_2 <= nvsideTwoPillowcase_2){
                    resultFillFormPillowcase_2_3 = true;
                    ExceptionMessageThreePillowcaseLabel_2.setVisible(false);
                }
                String vseamPillowcaseTextField_2 = seamPillowcaseTextField_2.getText();
                int nvseamPillowcaseTextField_2 = parseInt(vseamPillowcaseTextField_2); // приводим к целому числу
                //System.out.println(nvseamPillowcaseTextField_2);
                if (nvseamPillowcaseTextField_2 < 0){
                    resultFillFormPillowcase_2_4 = false;
                    ExceptionMessageFourPillowcaseLabel_2.setVisible(true);
                }
                if (nvseamPillowcaseTextField_2 >= 0){
                    resultFillFormPillowcase_2_4 = true;
                    ExceptionMessageFourPillowcaseLabel_2.setVisible(false);
                }

                // -= проверка размера 3 =-
                String vsideOnePillowcase_3 = sideOnePillowcase_3.getText();
                int nvsideOnePillowcase_3 = parseInt(vsideOnePillowcase_3); // приводим к целому числу
                //System.out.println(nvsideOnePillowcase_3);
                String vsideTwoPillowcase_3 = sideTwoPillowcase_3.getText();
                int nvsideTwoPillowcase_3 = parseInt(vsideTwoPillowcase_3); // приводим к целому числу
                //System.out.println(nvsideTwoPillowcase_3);
                if (nvsideOnePillowcase_3 != 0 && nvsideTwoPillowcase_3 == 0
                        || nvsideOnePillowcase_3 == 0 && nvsideTwoPillowcase_3 != 0
                        || nvsideOnePillowcase_3 < 0
                        || nvsideTwoPillowcase_3 < 0){
                    resultFillFormPillowcase_3_1 = false;
                    ExceptionMessageOnePillowcaseLabe_3.setVisible(true);
                }
                if (nvsideOnePillowcase_3 == 0 && nvsideTwoPillowcase_3 == 0
                        || nvsideOnePillowcase_3 > 0 && nvsideTwoPillowcase_3 > 0){
                    resultFillFormPillowcase_3_1 = true;
                    ExceptionMessageOnePillowcaseLabe_3.setVisible(false);
                }
                String vquantityPillowcaseTextField_3 = quantityPillowcaseTextField_3.getText();
                int nvquantityPillowcaseTextField_3 = parseInt(vquantityPillowcaseTextField_3); // приводим к целому числу
                //System.out.println(nvquantityPillowcaseTextField_3);
                if (nvquantityPillowcaseTextField_3 < 0){
                    resultFillFormPillowcase_3_2 = false;
                    ExceptionMessageTwoPillowcaseLabel_3.setVisible(true);
                }
                if (nvquantityPillowcaseTextField_3 >= 0){
                    resultFillFormPillowcase_3_2 = true;
                    ExceptionMessageTwoPillowcaseLabel_3.setVisible(false);
                }
                String vvalvePillowcaseTextField_3 = valvePillowcaseTextField_3.getText();
                int nvvalvePillowcaseTextField_3 = parseInt(vvalvePillowcaseTextField_3); // приводим к целому числу
                //System.out.println(nvvalvePillowcaseTextField_3);
                if (nvvalvePillowcaseTextField_3 < 0
                        || nvvalvePillowcaseTextField_3 > nvsideOnePillowcase_3
                        || nvvalvePillowcaseTextField_3 > nvsideTwoPillowcase_3){
                    resultFillFormPillowcase_3_3 = false;
                    ExceptionMessageThreePillowcaseLabel_3.setVisible(true);
                }
                if (nvvalvePillowcaseTextField_3 >= 0
                        && nvvalvePillowcaseTextField_3 <= nvsideOnePillowcase_3
                        && nvvalvePillowcaseTextField_3 <= nvsideTwoPillowcase_3){
                    resultFillFormPillowcase_3_3 = true;
                    ExceptionMessageThreePillowcaseLabel_3.setVisible(false);
                }
                String vseamPillowcaseTextField_3 = seamPillowcaseTextField_3.getText();
                int nvseamPillowcaseTextField_3 = parseInt(vseamPillowcaseTextField_3); // приводим к целому числу
                //System.out.println(nvseamPillowcaseTextField_3);
                if (nvseamPillowcaseTextField_3 < 0){
                    resultFillFormPillowcase_3_4 = false;
                    ExceptionMessageFourPillowcaseLabel_3.setVisible(true);
                }
                if (nvseamPillowcaseTextField_3 >= 0){
                    resultFillFormPillowcase_3_4 = true;
                    ExceptionMessageFourPillowcaseLabel_3.setVisible(false);
                }

                // -= проверка размера 4 =-
                String vsideOnePillowcase_4 = sideOnePillowcase_4.getText();
                int nvsideOnePillowcase_4 = parseInt(vsideOnePillowcase_4); // приводим к целому числу
                //System.out.println(nvsideOnePillowcase_4);
                String vsideTwoPillowcase_4 = sideTwoPillowcase_4.getText();
                int nvsideTwoPillowcase_4 = parseInt(vsideTwoPillowcase_4); // приводим к целому числу
                //System.out.println(nvsideTwoPillowcase_4);
                if (nvsideOnePillowcase_4 != 0 && nvsideTwoPillowcase_4 == 0
                        || nvsideOnePillowcase_4 == 0 && nvsideTwoPillowcase_4 != 0
                        || nvsideOnePillowcase_4 < 0
                        || nvsideTwoPillowcase_4 < 0){
                    resultFillFormPillowcase_4_1 = false;
                    ExceptionMessageOnePillowcaseLabe_4.setVisible(true);
                }
                if (nvsideOnePillowcase_4 == 0 && nvsideTwoPillowcase_4 == 0
                        || nvsideOnePillowcase_4 > 0 && nvsideTwoPillowcase_4 > 0){
                    resultFillFormPillowcase_4_1 = true;
                    ExceptionMessageOnePillowcaseLabe_4.setVisible(false);
                }
                String vquantityPillowcaseTextField_4 = quantityPillowcaseTextField_4.getText();
                int nvquantityPillowcaseTextField_4 = parseInt(vquantityPillowcaseTextField_4); // приводим к целому числу
                //System.out.println(nvquantityPillowcaseTextField_4);
                if (nvquantityPillowcaseTextField_4 < 0){
                    resultFillFormPillowcase_4_2 = false;
                    ExceptionMessageTwoPillowcaseLabel_4.setVisible(true);
                }
                if (nvquantityPillowcaseTextField_4 >= 0){
                    resultFillFormPillowcase_4_2 = true;
                    ExceptionMessageTwoPillowcaseLabel_4.setVisible(false);
                }
                String vvalvePillowcaseTextField_4 = valvePillowcaseTextField_4.getText();
                int nvvalvePillowcaseTextField_4 = parseInt(vvalvePillowcaseTextField_4); // приводим к целому числу
                //System.out.println(nvvalvePillowcaseTextField_4);
                if (nvvalvePillowcaseTextField_4 < 0
                        || nvvalvePillowcaseTextField_4 > nvsideOnePillowcase_4
                        || nvvalvePillowcaseTextField_4 > nvsideTwoPillowcase_4){
                    resultFillFormPillowcase_4_3 = false;
                    ExceptionMessageThreePillowcaseLabel_4.setVisible(true);
                }
                if (nvvalvePillowcaseTextField_4 >= 0
                        && nvvalvePillowcaseTextField_4 <= nvsideOnePillowcase_4
                        && nvvalvePillowcaseTextField_4 <= nvsideTwoPillowcase_4){
                    resultFillFormPillowcase_4_3 = true;
                    ExceptionMessageThreePillowcaseLabel_4.setVisible(false);
                }
                String vseamPillowcaseTextField_4 = seamPillowcaseTextField_4.getText();
                int nvseamPillowcaseTextField_4 = parseInt(vseamPillowcaseTextField_4); // приводим к целому числу
                //System.out.println(nvseamPillowcaseTextField_4);
                if (nvseamPillowcaseTextField_4 < 0){
                    resultFillFormPillowcase_4_4 = false;
                    ExceptionMessageFourPillowcaseLabel_4.setVisible(true);
                }
                if (nvseamPillowcaseTextField_4 >= 0){
                    resultFillFormPillowcase_4_4 = true;
                    ExceptionMessageFourPillowcaseLabel_4.setVisible(false);
                }

                // -= проверка размера 5 =-
                String vsideOnePillowcase_5 = sideOnePillowcase_5.getText();
                int nvsideOnePillowcase_5 = parseInt(vsideOnePillowcase_5); // приводим к целому числу
                //System.out.println(nvsideOnePillowcase_5);
                String vsideTwoPillowcase_5 = sideTwoPillowcase_5.getText();
                int nvsideTwoPillowcase_5 = parseInt(vsideTwoPillowcase_5); // приводим к целому числу
                //System.out.println(nvsideTwoPillowcase_5);
                if (nvsideOnePillowcase_5 != 0 && nvsideTwoPillowcase_5 == 0
                        || nvsideOnePillowcase_5 == 0 && nvsideTwoPillowcase_5 != 0
                        || nvsideOnePillowcase_5 < 0
                        || nvsideTwoPillowcase_5 < 0){
                    resultFillFormPillowcase_5_1 = false;
                    ExceptionMessageOnePillowcaseLabe_5.setVisible(true);
                }
                if (nvsideOnePillowcase_5 == 0 && nvsideTwoPillowcase_5 == 0
                        || nvsideOnePillowcase_5 > 0 && nvsideTwoPillowcase_5 > 0){
                    resultFillFormPillowcase_5_1 = true;
                    ExceptionMessageOnePillowcaseLabe_5.setVisible(false);
                }
                String vquantityPillowcaseTextField_5 = quantityPillowcaseTextField_5.getText();
                int nvquantityPillowcaseTextField_5 = parseInt(vquantityPillowcaseTextField_5); // приводим к целому числу
                //System.out.println(nvquantityPillowcaseTextField_5);
                if (nvquantityPillowcaseTextField_5 < 0){
                    resultFillFormPillowcase_5_2 = false;
                    ExceptionMessageTwoPillowcaseLabel_5.setVisible(true);
                }
                if (nvquantityPillowcaseTextField_5 >= 0){
                    resultFillFormPillowcase_5_2 = true;
                    ExceptionMessageTwoPillowcaseLabel_5.setVisible(false);
                }
                String vvalvePillowcaseTextField_5 = valvePillowcaseTextField_5.getText();
                int nvvalvePillowcaseTextField_5 = parseInt(vvalvePillowcaseTextField_5); // приводим к целому числу
                //System.out.println(nvvalvePillowcaseTextField_5);
                if (nvvalvePillowcaseTextField_5 < 0
                        || nvvalvePillowcaseTextField_5 > nvsideOnePillowcase_5
                        || nvvalvePillowcaseTextField_5 > nvsideTwoPillowcase_5){
                    resultFillFormPillowcase_5_3 = false;
                    ExceptionMessageThreePillowcaseLabel_5.setVisible(true);
                }
                if (nvvalvePillowcaseTextField_5 >= 0
                        && nvvalvePillowcaseTextField_5 <= nvsideOnePillowcase_5
                        && nvvalvePillowcaseTextField_5 <= nvsideTwoPillowcase_5){
                    resultFillFormPillowcase_5_3 = true;
                    ExceptionMessageThreePillowcaseLabel_5.setVisible(false);
                }
                String vseamPillowcaseTextField_5 = seamPillowcaseTextField_5.getText();
                int nvseamPillowcaseTextField_5 = parseInt(vseamPillowcaseTextField_5); // приводим к целому числу
                //System.out.println(nvseamPillowcaseTextField_5);
                if (nvseamPillowcaseTextField_5 < 0){
                    resultFillFormPillowcase_5_4 = false;
                    ExceptionMessageFourPillowcaseLabel_5.setVisible(true);
                }
                if (nvseamPillowcaseTextField_5 >= 0){
                    resultFillFormPillowcase_5_4 = true;
                    ExceptionMessageFourPillowcaseLabel_5.setVisible(false);
                }
                // ------- КОНЕЦ проверок по наволочкам -------


                // ------- проверка статусов ошибок перед отправкой данных -------
                if (resultFillFormPillowcase_1_1 != true || resultFillFormPillowcase_1_2 != true
                        || resultFillFormPillowcase_1_3 != true || resultFillFormPillowcase_1_4 != true
                        || resultFillFormPillowcase_2_1 != true || resultFillFormPillowcase_2_2 != true
                        || resultFillFormPillowcase_2_3 != true || resultFillFormPillowcase_2_4 != true
                        || resultFillFormPillowcase_3_1 != true || resultFillFormPillowcase_3_2 != true
                        || resultFillFormPillowcase_3_3 != true || resultFillFormPillowcase_3_4 != true
                        || resultFillFormPillowcase_4_1 != true || resultFillFormPillowcase_4_2 != true
                        || resultFillFormPillowcase_4_3 != true || resultFillFormPillowcase_4_4 != true
                        || resultFillFormPillowcase_5_1 != true || resultFillFormPillowcase_5_2 != true
                        || resultFillFormPillowcase_5_3 != true || resultFillFormPillowcase_5_4 != true){
                    resultFillFormAll = false;
                }
                //System.out.println(resultFillFormPillowcase);

                // ------- отправка данных если всё корректно -------
                if (resultFillFormAll == true){

                    // отправка информации по наволочкам
                    int[] arraySideOnePillowcase = new int[]{
                            nvsideOnePillowcase_1,
                            nvsideOnePillowcase_2,
                            nvsideOnePillowcase_3,
                            nvsideOnePillowcase_4,
                            nvsideOnePillowcase_5
                    };
                    int[] arraySideTwoPillowcase = new int[]{
                            nvsideTwoPillowcase_1,
                            nvsideTwoPillowcase_2,
                            nvsideTwoPillowcase_3,
                            nvsideTwoPillowcase_4,
                            nvsideTwoPillowcase_5
                    };
                    int[] arrayQuantityPillowcaseTextField = new int[]{
                            nvquantityPillowcaseTextField_1,
                            nvquantityPillowcaseTextField_2,
                            nvquantityPillowcaseTextField_3,
                            nvquantityPillowcaseTextField_4,
                            nvquantityPillowcaseTextField_5
                    };
                    int[] arrayValvePillowcaseTextField = new int[]{
                            nvvalvePillowcaseTextField_1,
                            nvvalvePillowcaseTextField_2,
                            nvvalvePillowcaseTextField_3,
                            nvvalvePillowcaseTextField_4,
                            nvvalvePillowcaseTextField_5
                    };
                    int[] arraySeamPillowcaseTextField = new int[]{
                            nvseamPillowcaseTextField_1,
                            nvseamPillowcaseTextField_2,
                            nvseamPillowcaseTextField_3,
                            nvseamPillowcaseTextField_4,
                            nvseamPillowcaseTextField_5
                    };

                    int[][] arrayPillowcaseData = new int[][]{
                            arraySideOnePillowcase,
                            arraySideTwoPillowcase,
                            arrayQuantityPillowcaseTextField,
                            arrayValvePillowcaseTextField,
                            arraySeamPillowcaseTextField
                    };
                }
            }
        });
    }
}