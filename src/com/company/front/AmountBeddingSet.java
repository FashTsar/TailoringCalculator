package com.company.front;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AmountBeddingSet implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        String message = "Тут будет рассчёт количества КПБ из ткани!";
        JOptionPane.showMessageDialog(null, message, "Количество КПБ", JOptionPane.PLAIN_MESSAGE);
    }
}