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

        // ------- создаём панель вкладок -------
        JTabbedPane tabbedPane = new JTabbedPane();

        // ------- наволочки -------
        JPanel pillowcaseDataPage = new JPanel();
        pillowcaseDataPage.setLayout(new BorderLayout());

        // создаём панель для загаловка
        JPanel titlePagePanel = new JPanel();
        titlePagePanel.setMinimumSize(titlePagePanel.getPreferredSize()); // оптимальный минимальный размер
        JLabel TitlePageLable = new JLabel("Размеры наволочек (в сантиметрах):");
        titlePagePanel.add(TitlePageLable);
        titlePagePanel.setVisible(true);

        NumberFormat number = new DecimalFormat("#"); // формат ввода в поле (только цифры)
        boolean bigHandSelection = false; // считат ли расход по болшой стороне

        // создаём панель для полей
        JPanel PillowcaseDataPanel = new JPanel();
        PillowcaseDataPanel.setLayout(new GridBagLayout()); // способ расположения элементов в панели загрузки
        PillowcaseDataPanel.setMinimumSize(PillowcaseDataPanel.getPreferredSize()); // оптимальный минимальный размер

        for (int x=1; x<=5; x++){
            JLabel titlePillowcaseLable = new JLabel("Размер №"+x);
            JCheckBox activePillowcaseCheckBox = new JCheckBox();
            JLabel typeSeparatorLable = new JLabel("x");
            JLabel quantityLable = new JLabel("Количество:");
            JLabel valveLable = new JLabel("Клапан(см.):");
            JLabel seamLable = new JLabel("Шов(см.):");
            JLabel handSelectionLable = new JLabel("Расход по большой стороне:");
            JCheckBox handSelectionCheckBox = new JCheckBox();

            JFormattedTextField sideOne = new JFormattedTextField(
                    new NumberFormatter(number));
            sideOne.setColumns(3);
            sideOne.setValue(0);
            JFormattedTextField sideTwo = new JFormattedTextField(
                    new NumberFormatter(number));
            sideTwo.setColumns(3);
            sideTwo.setValue(0);
            JFormattedTextField quantityTextField = new JFormattedTextField(
                    new NumberFormatter(number));
            quantityTextField.setColumns(3);
            quantityTextField.setValue(0);
            JFormattedTextField valveTextField = new JFormattedTextField(
                    new NumberFormatter(number));
            valveTextField.setColumns(3);
            valveTextField.setValue(0);
            JFormattedTextField seamTextField = new JFormattedTextField(
                    new NumberFormatter(number));
            seamTextField.setColumns(3);
            seamTextField.setValue(0);

            JLabel ExceptionMessageOneLabe = new JLabel("Ошибка: одна из сторон меньше или равна 0");
            ExceptionMessageOneLabe.setForeground(Color.RED);
            ExceptionMessageOneLabe.setVisible(false);
            JLabel ExceptionMessageTwoLabel = new JLabel("Ошибка: количество меньше 0");
            ExceptionMessageTwoLabel.setForeground(Color.RED);
            ExceptionMessageTwoLabel.setVisible(false);
            JLabel ExceptionMessageThreeLabel = new JLabel("Ошибка: размер клапана меньше 0");
            ExceptionMessageThreeLabel.setForeground(Color.RED);
            ExceptionMessageThreeLabel.setVisible(false);
            JLabel ExceptionMessageFourLabel = new JLabel("Ошибка: размер клапана больше стороны изделия");
            ExceptionMessageFourLabel.setForeground(Color.RED);
            ExceptionMessageFourLabel.setVisible(false);

            PillowcaseDataPanel.add(titlePillowcaseLable, new GridBagConstraints(10, x*10, 1, 1, 1, 1,
                    GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                    new Insets(2, 2, 2, 2), 0, 0));

            PillowcaseDataPanel.add(activePillowcaseCheckBox, new GridBagConstraints(20, x*10, 1, 1, 1, 1,
                    GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                    new Insets(2, 2, 2, 2), 0, 0));

            PillowcaseDataPanel.add(sideOne, new GridBagConstraints(30, x*10, 1, 1, 1, 1,
                    GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                    new Insets(2, 2, 2, 2), 0, 0));

            PillowcaseDataPanel.add(typeSeparatorLable, new GridBagConstraints(40, x*10, 1, 1, 1, 1,
                    GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                    new Insets(2, 2, 2, 2), 0, 0));

            PillowcaseDataPanel.add(sideTwo, new GridBagConstraints(50, x*10, 1, 1, 1, 1,
                    GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                    new Insets(2, 2, 2, 2), 0, 0));

            PillowcaseDataPanel.add(quantityLable, new GridBagConstraints(60, x*10, 1, 1, 1, 1,
                    GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                    new Insets(2, 2, 2, 2), 0, 0));

            PillowcaseDataPanel.add(quantityTextField, new GridBagConstraints(70, x*10, 1, 1, 1, 1,
                    GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                    new Insets(2, 2, 2, 2), 0, 0));

            PillowcaseDataPanel.add(valveLable, new GridBagConstraints(80, x*10, 1, 1, 1, 1,
                    GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                    new Insets(2, 2, 2, 2), 0, 0));

            PillowcaseDataPanel.add(valveTextField, new GridBagConstraints(90, x*10, 1, 1, 1, 1,
                    GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                    new Insets(2, 2, 2, 2), 0, 0));

            PillowcaseDataPanel.add(seamLable, new GridBagConstraints(100, x*10, 1, 1, 1, 1,
                    GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                    new Insets(2, 2, 2, 2), 0, 0));

            PillowcaseDataPanel.add(seamTextField, new GridBagConstraints(110, x*10, 1, 1, 1, 1,
                    GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                    new Insets(2, 2, 2, 2), 0, 0));

            PillowcaseDataPanel.add(handSelectionLable, new GridBagConstraints(120, x*10, 1, 1, 1, 1,
                    GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                    new Insets(2, 2, 2, 2), 0, 0));

            PillowcaseDataPanel.add(handSelectionCheckBox, new GridBagConstraints(130, x*10, 1, 1, 1, 1,
                    GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                    new Insets(2, 2, 2, 2), 0, 0));

            PillowcaseDataPanel.add(ExceptionMessageOneLabe, new GridBagConstraints(0, x*10+1, 110, 1, 1, 1,
                    GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 0), 0, 0));

            PillowcaseDataPanel.add(ExceptionMessageTwoLabel, new GridBagConstraints(0, x*10+2, 110, 1, 1, 1,
                    GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 0), 0, 0));

            PillowcaseDataPanel.add(ExceptionMessageThreeLabel, new GridBagConstraints(0, x*10+3, 110, 1, 1, 1,
                    GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 0), 0, 0));

            PillowcaseDataPanel.add(ExceptionMessageFourLabel, new GridBagConstraints(0, x*10+4, 110, 1, 1, 1,
                    GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 0), 0, 0));

            // прописываем логику действия при клике на чекбокс заполнения
            boolean valueActivePillowcaseCheckBox = activePillowcaseCheckBox.isSelected();
            if (valueActivePillowcaseCheckBox == false){
                sideOne.setEditable(false);
                sideTwo.setEditable(false);
                quantityTextField.setEditable(false);
                valveTextField.setEditable(false);
                seamTextField.setEditable(false);
            }
            if (valueActivePillowcaseCheckBox == true){
                sideOne.setEditable(true);
                sideTwo.setEditable(true);
                quantityTextField.setEditable(true);
                valveTextField.setEditable(true);
                seamTextField.setEditable(true);
            }
            activePillowcaseCheckBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    boolean valueActivePillowcaseCheckBox = activePillowcaseCheckBox.isSelected();
                    //System.out.println(valueActivePillowcaseType1CheckBox_1);
                    if (valueActivePillowcaseCheckBox == false){
                        sideOne.setEditable(false);
                        sideTwo.setEditable(false);
                        quantityTextField.setEditable(false);
                        valveTextField.setEditable(false);
                        seamTextField.setEditable(false);
                    }
                    if (valueActivePillowcaseCheckBox == true){
                        sideOne.setEditable(true);
                        sideTwo.setEditable(true);
                        quantityTextField.setEditable(true);
                        valveTextField.setEditable(true);
                        seamTextField.setEditable(true);
                    }
                }
            });

            // прописываем логику действия при клике на чекбокс выбора стороны
            boolean valueHandSelectionCheckBox = handSelectionCheckBox.isSelected();
            if (valueHandSelectionCheckBox == false){
                bigHandSelection = false;
                //System.out.println(bigHandSelection);
            }
            if (valueHandSelectionCheckBox == true){
                bigHandSelection = true;
                //System.out.println(bigHandSelection);
            }
            handSelectionCheckBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    boolean bigHandSelection = false; // считат ли расход по болшой стороне
                    boolean valueHandSelectionCheckBox = handSelectionCheckBox.isSelected();
                    //System.out.println(valueActivePillowcaseType1CheckBox_1);
                    if (valueHandSelectionCheckBox == false){
                        bigHandSelection = false;
                        //System.out.println(bigHandSelection);
                    }
                    if (valueHandSelectionCheckBox == true){
                        bigHandSelection = true;
                        //System.out.println(bigHandSelection);
                    }
                }
            });
        }

        pillowcaseDataPage.add(titlePagePanel, BorderLayout.NORTH);
        pillowcaseDataPage.add(PillowcaseDataPanel, BorderLayout.CENTER); // добавить панель в окно
        pillowcaseDataPage.setVisible(true);
        tabbedPane.addTab("наволочки", pillowcaseDataPage);
        tabbedPane.setVisible(true);

        // ------- создаём панель для кнопок -------
        JPanel ButtonPanel = new JPanel();
        ButtonPanel.setMinimumSize(ButtonPanel.getPreferredSize()); // оптимальный минимальный размер
        JButton saveButton = new JButton("Сохранить");
        ButtonPanel.add(saveButton);
        ButtonPanel.setVisible(true);

        mainPage.add(tabbedPane, BorderLayout.CENTER);
        mainPage.add(ButtonPanel, BorderLayout.SOUTH);
        mainPage.setVisible(true);
    }
}