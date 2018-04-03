package com.company.front;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class FirstDownload extends JFrame{

    public void FirstDownloadPage() throws InterruptedException {

        // ------- создаём форму и задаём основные параметры -------
        JFrame downloadPage = new JFrame("Загрузка"); // создаём фрейм и задаём загаловок
        //downloadPage.setSize(150, 205); // размеры окна
        downloadPage.setUndecorated(true); // убираем рамки
        downloadPage.setMinimumSize(downloadPage.getPreferredSize()); // оптимальный минимальный размер
        downloadPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // при нажатии на крестик заканчивать работу
        downloadPage.setLocationRelativeTo(null); // окно появляется посередине
        downloadPage.setLayout(new BorderLayout()); // способ расположения элементов в окне

        // ------- создаём основные панели -------
        JPanel titlePageAndLoadingPanel = new JPanel(); // создаём панель для загаловка и прогрессбара
        titlePageAndLoadingPanel.setLayout(new BorderLayout()); // способ расположения элементов
        JPanel titlePartnersAndPartnersAndLinePanel = new JPanel(); // создаём панель размещения рекламы
        titlePartnersAndPartnersAndLinePanel.setLayout(new BorderLayout()); // способ расположения элементов
        downloadPage.add(titlePageAndLoadingPanel, BorderLayout.NORTH); // прижимаем панель к верху
        downloadPage.add(titlePartnersAndPartnersAndLinePanel, BorderLayout.CENTER); // прижимаем панель к центру

        // ------- заголовок страницы -------
        JPanel titlePage = new JPanel();
        JLabel titlePageLabel = new JLabel("Загрузка программы...");
        titlePage.add(titlePageLabel);
        titlePageAndLoadingPanel.add(titlePage, BorderLayout.NORTH);

        // ------- заголовок рекламы -------
        JPanel titlePartners = new JPanel();
        JLabel titlePartnersLabel = new JLabel("Наши партнёры:");
        titlePartners.add(titlePartnersLabel);
        titlePartnersAndPartnersAndLinePanel.add(titlePartners, BorderLayout.NORTH);

        // ------- панели загрузки, рекламного баннера и ссылки -------
        JPanel loadingPanel = new JPanel(); // создаём панель загрузки
        loadingPanel.setLayout(new GridLayout()); // способ расположения элементов в панели загрузки
        JPanel partnersPanel = new JPanel(); // создаём панель партнёров
        partnersPanel.setLayout(new BorderLayout());
        JPanel linkPanel = new JPanel(); // создаём панель с сылкой
        titlePageAndLoadingPanel.add(loadingPanel, BorderLayout.CENTER); // прижимаем панель к верху
        titlePartnersAndPartnersAndLinePanel.add(partnersPanel, BorderLayout.CENTER); // прижимаем панель к центру
        titlePartnersAndPartnersAndLinePanel.add(linkPanel, BorderLayout.PAGE_END); // прижимаем панель к низу

        // ------- создаём ссылку -------
        com.company.front.SwingLink linkSwingLink = new com.company.front.SwingLink("Мониторинг обменных пунктов BestChange.ru", "https://www.bestchange.ru/?p=33505");
        linkPanel.add(linkSwingLink);
        linkSwingLink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // меняем курсор на руку

        // ------- создаём баннер -------
        //PartnersBanner panel = new PartnersBanner();
        //partnersPanel.add(panel, BorderLayout.CENTER);

        // ------- создаём прогрессбар (полоса загрузки) -------
        JProgressBar downloadProgressBar = new JProgressBar(); // создаём прогрессбар
        downloadProgressBar.setStringPainted(true); // можно видеть прогресс в процентах
        downloadProgressBar.setMinimum(0); // минммальное значение прогрессбара
        downloadProgressBar.setMaximum(100); // максимальное значение прогрессбара
        loadingPanel.add(downloadProgressBar, GridLayout.class); // добавляем прогрессбар на панель загрузки

        // ------- делаем окно видимым -------
        downloadPage.pack(); // оптимизировать размер окна
        downloadPage.setVisible(true); // окно видно

        // ------- заполняем прогрессбар -------
        for (int x = downloadProgressBar.getMinimum(); x <= downloadProgressBar.getMaximum(); x++){
            Thread.sleep(50);
            downloadProgressBar.setValue(x);
        }

        // ------- закрываем окно -------
        downloadPage.dispose(); // закрываем форму
    }
}
