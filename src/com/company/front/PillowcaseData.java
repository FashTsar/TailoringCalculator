package com.company.front;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

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

        // ------- создаём поля второй строки и распределяем поля по панели -------
        JLabel titlePillowcaseType1Lable_2 = new JLabel("Размер №2");
        JCheckBox activePillowcaseType1CheckBox_2 = new JCheckBox();
        JLabel typeSeparator_2 = new JLabel("x");

        JFormattedTextField sideOne_2 = new JFormattedTextField(
                new NumberFormatter(number));
        sideOne_2.setColumns(5);
        sideOne_2.setValue(0);
        JFormattedTextField sideTwo_2 = new JFormattedTextField(
                new NumberFormatter(number));
        sideTwo_2.setColumns(5);
        sideTwo_2.setValue(0);

        PillowcaseDataPanel.add(titlePillowcaseType1Lable_2, new GridBagConstraints(0, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(activePillowcaseType1CheckBox_2, new GridBagConstraints(1, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideOne_2, new GridBagConstraints(2, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(typeSeparator_2, new GridBagConstraints(3, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideTwo_2, new GridBagConstraints(4, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // ------- создаём поля третьей строки и распределяем поля по панели -------
        JLabel titlePillowcaseType1Lable_3 = new JLabel("Размер №3");
        JCheckBox activePillowcaseType1CheckBox_3 = new JCheckBox();
        JLabel typeSeparator_3 = new JLabel("x");

        JFormattedTextField sideOne_3 = new JFormattedTextField(
                new NumberFormatter(number));
        sideOne_3.setColumns(5);
        sideOne_3.setValue(0);
        JFormattedTextField sideTwo_3 = new JFormattedTextField(
                new NumberFormatter(number));
        sideTwo_3.setColumns(5);
        sideTwo_3.setValue(0);

        PillowcaseDataPanel.add(titlePillowcaseType1Lable_3, new GridBagConstraints(0, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(activePillowcaseType1CheckBox_3, new GridBagConstraints(1, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideOne_3, new GridBagConstraints(2, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(typeSeparator_3, new GridBagConstraints(3, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideTwo_3, new GridBagConstraints(4, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // ------- создаём поля четвёртой строки и распределяем поля по панели -------
        JLabel titlePillowcaseType1Lable_4 = new JLabel("Размер №4");
        JCheckBox activePillowcaseType1CheckBox_4 = new JCheckBox();
        JLabel typeSeparator_4 = new JLabel("x");

        JFormattedTextField sideOne_4 = new JFormattedTextField(
                new NumberFormatter(number));
        sideOne_4.setColumns(5);
        sideOne_4.setValue(0);
        JFormattedTextField sideTwo_4 = new JFormattedTextField(
                new NumberFormatter(number));
        sideTwo_4.setColumns(5);
        sideTwo_4.setValue(0);

        PillowcaseDataPanel.add(titlePillowcaseType1Lable_4, new GridBagConstraints(0, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(activePillowcaseType1CheckBox_4, new GridBagConstraints(1, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideOne_4, new GridBagConstraints(2, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(typeSeparator_4, new GridBagConstraints(3, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideTwo_4, new GridBagConstraints(4, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // ------- создаём поля пятой строки и распределяем поля по панели -------
        JLabel titlePillowcaseType1Lable_5 = new JLabel("Размер №5");
        JCheckBox activePillowcaseType1CheckBox_5 = new JCheckBox();
        JLabel typeSeparator_5 = new JLabel("x");

        JFormattedTextField sideOne_5 = new JFormattedTextField(
                new NumberFormatter(number));
        sideOne_5.setColumns(5);
        sideOne_5.setValue(0);
        JFormattedTextField sideTwo_5 = new JFormattedTextField(
                new NumberFormatter(number));
        sideTwo_5.setColumns(5);
        sideTwo_5.setValue(0);

        PillowcaseDataPanel.add(titlePillowcaseType1Lable_5, new GridBagConstraints(0, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(activePillowcaseType1CheckBox_5, new GridBagConstraints(1, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideOne_5, new GridBagConstraints(2, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(typeSeparator_5, new GridBagConstraints(3, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(sideTwo_5, new GridBagConstraints(4, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

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
    }
}
