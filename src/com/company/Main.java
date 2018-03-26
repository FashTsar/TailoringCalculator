package com.company;

import com.company.front.FirstDownload;
import com.company.front.PillowcaseData;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // ------- запуск страницы загрузки -------
        FirstDownload startFirstDownload = new FirstDownload();
        startFirstDownload.FirstDownloadPage();

        // ------- запуск страницы получения данных -------
        PillowcaseData setPillowcaseData = new PillowcaseData();
        setPillowcaseData.PillowcaseData(); // запускаем страницу заполнения данных
    }
}