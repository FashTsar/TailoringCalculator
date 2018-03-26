package com.company.front;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class LastDate extends JFrame {

    public void LastDate(){
        // ------- создаём форму и задаём основные параметры -------
        JFrame PillowcaseData = new JFrame("Шаг 4"); // создаём фрейм и задаём загаловок
        PillowcaseData.setResizable(false); // запретить менять размер окна
        PillowcaseData.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // при нажатии на крестик заканчивать работу
        PillowcaseData.setLocationRelativeTo(null); // окно появляется посередине
        PillowcaseData.setLayout(new BorderLayout());

        // ------- создаём панель для загаловка -------
        JPanel TitlePagePanel = new JPanel();
        TitlePagePanel.setMinimumSize(TitlePagePanel.getPreferredSize()); // оптимальный минимальный размер
        JLabel TitlePageLable = new JLabel("Оставшиеся данные:");
        TitlePagePanel.add(TitlePageLable);
        TitlePagePanel.setVisible(true);

        NumberFormat number = new DecimalFormat("#"); // формат ввода в поле (только цифры)
    }
}
