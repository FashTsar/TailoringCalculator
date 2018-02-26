package com.company.front;

import javax.swing.*;

public class MainPage extends JFrame{
    private JButton forProgram = new JButton("О Программе"); // кнопка
    private JButton amountTissue = new JButton("Количество ткани"); // кнопка
    private JButton amountBeddingSet = new JButton("Количество КПБ"); // кнопка

    public MainPage() {
        super("Калькулятор закройщика"); // название окна
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // при закрытии окна прекращать работу

        JPanel mainePage = new JPanel(); // создаём панель
        forProgram.addActionListener(new ForProgram ());
        amountTissue.addActionListener(new AmountTissue ());
        amountBeddingSet.addActionListener(new AmountBeddingSet ());

        mainePage.add(forProgram);

        ButtonGroup groupVaritables = new ButtonGroup();
        groupVaritables.add(amountTissue);
        groupVaritables.add(amountBeddingSet);
        mainePage.add(amountTissue);
        mainePage.add(amountBeddingSet);

        // Замена панели содержимого
        setContentPane(mainePage);

        // Определение размера окна
        setSize(300, 130);
    }
}
