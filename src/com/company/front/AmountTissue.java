package com.company.front;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AmountTissue implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        String message = "Тут будет рассчёт ткани по размерам КПБ!";
        JOptionPane.showMessageDialog(null, message, "Количество ткани", JOptionPane.PLAIN_MESSAGE);
    }
}