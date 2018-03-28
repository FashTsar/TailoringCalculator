package com.company.front;

import com.company.Calculation;
import com.company.GetLastData;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import static java.lang.Integer.parseInt;

public class LastDate extends JFrame {

    public void LastDate(){
        // ------- создаём форму и задаём основные параметры -------
        JFrame PageData = new JFrame("Шаг 4"); // создаём фрейм и задаём загаловок
        PageData.setResizable(false); // запретить менять размер окна
        PageData.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // при нажатии на крестик заканчивать работу
        PageData.setLocationRelativeTo(null); // окно появляется посередине
        PageData.setLayout(new BorderLayout());

        // ------- создаём панель для загаловка -------
        JPanel TitlePagePanel = new JPanel();
        TitlePagePanel.setMinimumSize(TitlePagePanel.getPreferredSize()); // оптимальный минимальный размер
        JLabel TitlePageLable = new JLabel("Оставшиеся данные:");
        TitlePagePanel.add(TitlePageLable);
        TitlePagePanel.setVisible(true);

        NumberFormat number = new DecimalFormat("#"); // формат ввода в поле (только цифры)

        // ------- создаём панель для полей -------
        JPanel PillowcaseDataPanel = new JPanel();
        PillowcaseDataPanel.setLayout(new GridBagLayout()); // способ расположения элементов в панели загрузки
        PillowcaseDataPanel.setMinimumSize(PillowcaseDataPanel.getPreferredSize()); // оптимальный минимальный размер

        // ------- создаём поля первой строки и распределяем поля по панели -------
        JLabel titlePillowcaseType1Lable_1 = new JLabel("Ширина ткани(см.):");
        JLabel ExceptionMessageLabel_1_1 = new JLabel("Ошибка: ширина ткани меньше или равна 0");
        ExceptionMessageLabel_1_1.setForeground(Color.RED);
        ExceptionMessageLabel_1_1.setVisible(false);

        JFormattedTextField widthFabric = new JFormattedTextField(
                new NumberFormatter(number));
        widthFabric.setColumns(3);
        widthFabric.setValue(150);

        PillowcaseDataPanel.add(titlePillowcaseType1Lable_1, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(widthFabric, new GridBagConstraints(1, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageLabel_1_1, new GridBagConstraints(0, 1, 8, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // ------- создаём поля первой строки и распределяем поля по панели -------
        JLabel titlePillowcaseType1Lable_2 = new JLabel("Запас ткани на шов(см.):");
        JLabel ExceptionMessageLabel_2_1 = new JLabel("Ошибка: значение меньше 0");
        ExceptionMessageLabel_2_1.setForeground(Color.RED);
        ExceptionMessageLabel_2_1.setVisible(false);

        JFormattedTextField seam = new JFormattedTextField(
                new NumberFormatter(number));
        seam.setColumns(3);
        seam.setValue(0);

        PillowcaseDataPanel.add(titlePillowcaseType1Lable_2, new GridBagConstraints(0, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(seam, new GridBagConstraints(1, 10, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        PillowcaseDataPanel.add(ExceptionMessageLabel_2_1, new GridBagConstraints(0, 11, 8, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0));

        // ------- создаём панель для кнопок -------
        JPanel ButtonPanel = new JPanel();
        ButtonPanel.setMinimumSize(TitlePagePanel.getPreferredSize()); // оптимальный минимальный размер
        JButton NextButton = new JButton("Рассчитать");
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
                boolean resultFillForm = true;
                boolean resultFillForm_1_1 = true;
                boolean resultFillForm_2_1 = true;

                // проверки по ширине ткани
                String valueWidthFabric = widthFabric.getText();
                int nvalueWidthFabric = parseInt(valueWidthFabric); // приводим строку к целому числу
                //System.out.println(nvalueWidthFabric);
                if (nvalueWidthFabric <= 0) {
                    //System.out.println("Ошибка: ширина ткани меньше или равна 0");
                    ExceptionMessageLabel_1_1.setVisible(true);
                    PageData.pack(); // оптимизировать размер окна
                    resultFillForm_1_1 = false;
                }
                if (nvalueWidthFabric > 0) {
                    //System.out.println("Корректно");
                    ExceptionMessageLabel_1_1.setVisible(false);
                    PageData.pack(); // оптимизировать размер окна
                    resultFillForm_1_1 = true;
                }

                // проверки по шву
                String valueSeam = seam.getText();
                int nvalueSeam = parseInt(valueSeam); // приводим строку к целому числу
                //System.out.println(nvalueSeam);
                if (nvalueSeam < 0) {
                    //System.out.println("Ошибка: шов меньше 0");
                    ExceptionMessageLabel_2_1.setVisible(true);
                    PageData.pack(); // оптимизировать размер окна
                    resultFillForm_2_1 = false;
                }
                if (nvalueSeam >= 0) {
                    //System.out.println("OK");
                    ExceptionMessageLabel_2_1.setVisible(false);
                    PageData.pack(); // оптимизировать размер окна
                    resultFillForm_2_1 = true;
                }

                if (resultFillForm_1_1 != true || resultFillForm_2_1 != true) {
                    resultFillForm = false;
                }

                //System.out.println(resultFillForm);
                if (resultFillForm == true) {

                    GetLastData.nvalueWidthFabric = nvalueWidthFabric;
                    GetLastData.nvalueSeam = nvalueSeam;

                    PageData.setVisible(false); // скрыть окно
                    Calculation startCalculation = new Calculation();
                    startCalculation.Calculation(); // запускаем страницу рассчёта
                }
            }
        });
    }
}
