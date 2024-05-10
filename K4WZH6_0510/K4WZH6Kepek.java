package hu.the.K4WZH6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class K4WZH6Kepek extends JFrame {

    ImageIcon ikonKep;
    Image kep;

    public K4WZH6Kepek() {
        super("Képek méretezése");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,400);
        setBackground(Color.white);

        ikonKep = new ImageIcon("the.PNG");
        kep = ikonKep.getImage();
    }

    public void paint(Graphics g){
        Rectangle r = getBounds();
        g.setColor(Color.blue);
        g.drawRect(10,35,r.width-20,r.height-45);

        int wkep = kep.getWidth(this);
        int hkep = kep.getHeight(this);
        int xpoz = 20, ypoz = 45;

        //25%
        g.drawImage(kep,xpoz,ypoz,wkep/4,hkep/4,this);

        //50%
        xpoz += (wkep/4)+18;
        g.drawImage(kep,xpoz,ypoz,wkep/2,hkep/2,this);

        //100%
        xpoz += (wkep/2)+18;
        g.drawImage(kep,xpoz,ypoz,wkep,hkep,this);
    }

    public static void main(String[] args) {
        (new K4WZH6Kepek()).setVisible(true);
    }

}
