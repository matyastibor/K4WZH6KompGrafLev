package hu.the.K4WZH6;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

public class K4WZH6_bead01 extends JFrame {
    ImageIcon ikonKep1, ikonKep2;

    Image kep, kep2;

    public K4WZH6_bead01() {
        super("Komputergrafika és képfeldolgozás");
        //setLocationRelativeTo(null); // Képernyő közepére rendezi az ablakot
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(560,500);
        setBackground(Color.yellow);

        // 1. kép
        ikonKep1 = new ImageIcon("mg1.jpg");
        kep = ikonKep1.getImage();

        // 2. kép
        ikonKep2 = new ImageIcon("mg2.jpg");
        kep2 = ikonKep2.getImage();

    }

    public void paint(Graphics g){
        // Négyszög megrajzolása
        Rectangle r = getBounds();
        g.setColor(Color.magenta);
        g.drawRect(30,35,500,50);

        // Cím kiírása
        Font f = new Font("Times New Roman", Font.BOLD+Font.ITALIC,30);
        g.setFont(f);
        g.setColor(Color.RED);
        g.drawString("Komputergrafika és képfeldolgozás", 60, 70);

        Graphics2D g2 = (Graphics2D) g;

        //az ablak középpontjának koordinátái
        //int cx = getSize( ).width / 2 ;
        //int cy = getSize( ).height / 2;
        int cx = 0;
        int cy = 300;

        // Téglalap létrehozása
        Shape teglalap = new Rectangle2D.Float(r.width-220,r.height-120, 200,100 );

        // Vonalas minta 45 fokos szögben kék és sárga színek közötti átmenettel
        g2.setPaint(new GradientPaint(40,40,Color.blue,50,50,Color.yellow,true));
        g2.fill(teglalap);

        // zöld színnel kitöltött ellipszis (most kör) rajzolása
        Shape k = new Ellipse2D.Float(cx,cy,300,300);
        g2.setPaint(Color.green);
        g2.fill(k);

        int wkep = kep.getWidth(this)/2;
        int hkep = kep.getHeight(this)/2;
        int xpoz = (r.width/2)-(wkep/2), ypoz = 95;

        // 50% méretben
        g.drawImage(kep,xpoz,ypoz,wkep,hkep,this);

        int wkep2 = kep2.getWidth(this)/3;
        int hkep2 = kep2.getHeight(this)/3;
        int xpoz2 = (r.width/3)-(wkep/3), ypoz2 = 310;

        // egy harmad méretben
        g.drawImage(kep2,xpoz2,ypoz2,wkep2,hkep2,this);

    }

    public static void main(String[] args) {
        (new K4WZH6_bead01()).setVisible(true);
    }

}