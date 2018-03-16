package com.company.front;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PartnersBanner extends JPanel{
    BufferedImage image;

    public PartnersBanner(){
        try {
            image = ImageIO.read(new File("src/com/company/front/images/image.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void paintComponent (Graphics g){
        g.drawImage(image, 23, 0, null);
    }
}
