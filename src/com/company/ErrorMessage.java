package com.company;

import javax.swing.*;
import java.awt.*;

public class ErrorMessage {

    public void getErrorMessage(boolean resultFillFormPillowcase, boolean resultFillFormQuilt){
        JFrame errorPage = new JFrame("ОШИБКА"); // создаём фрейм и задаём загаловок
        errorPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // при нажатии на крестик заканчивать работу
        errorPage.setLocationRelativeTo(null); // окно появляется посередине
        errorPage.setLayout(new BorderLayout()); // способ расположения элементов в окне
        errorPage.setResizable(false); // запретить менять размер окна

        JPanel bodyErrorMessage = new JPanel();
        bodyErrorMessage.setLayout(new GridBagLayout());
        bodyErrorMessage.setMinimumSize(bodyErrorMessage.getPreferredSize()); // оптимальный минимальный размер

        JLabel ExceptionMessagePillowcase = new JLabel("Ошибка: некорректно заполнены данные по наволочкам");
        ExceptionMessagePillowcase.setForeground(Color.RED);
        if (resultFillFormPillowcase == true){
            ExceptionMessagePillowcase.setVisible(false);
        }
        if (resultFillFormPillowcase == false){
            ExceptionMessagePillowcase.setVisible(true);
        }

        JLabel ExceptionMessageQuilt = new JLabel("Ошибка: некорректно заполнены данные по пододеяльникам");
        ExceptionMessageQuilt.setForeground(Color.RED);
        if (resultFillFormQuilt == true){
            ExceptionMessageQuilt.setVisible(false);
        }
        if (resultFillFormQuilt == false){
            ExceptionMessageQuilt.setVisible(true);
        }

        bodyErrorMessage.add(ExceptionMessagePillowcase, new GridBagConstraints(0, 10, 110, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(5, 5, 5, 5), 0, 0));

        bodyErrorMessage.add(ExceptionMessageQuilt, new GridBagConstraints(0, 20, 110, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(5, 5, 5, 5), 0, 0));

        errorPage.add(bodyErrorMessage, BorderLayout.CENTER);
        errorPage.pack();
        errorPage.setVisible(true);
    }
}
