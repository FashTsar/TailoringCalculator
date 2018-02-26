package com.company.front;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForProgram implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        String message = "Тут будет описание программы!";
        JOptionPane.showMessageDialog(null, message, "О программе", JOptionPane.PLAIN_MESSAGE);
    }
}