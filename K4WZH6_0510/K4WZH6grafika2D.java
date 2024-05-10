package hu.the.K4WZH6;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class K4WZH6grafika2D extends JComponent {

    private Image kep;

    public K4WZH6grafika2D() {
        kep = Toolkit.getDefaultToolkit().getImage("the.PNG");
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        //az ablak középpontjának koordinátái
        int cx = getSize( ).width / 2 ;
        int cy = getSize( ).height / 2;

        // és elforgatás 30 fokkal az óramutató járásával ellentétesen
        g2.rotate(-30*Math.PI/180);

        // Vágás használata
        Shape oldVago = g2.getClip( );

        // ezzel az elipszissel vágjuk a rajzolt elemeket
        Shape e = new Ellipse2D.Double(-cx,-cy/2, cx*3/4, cy*2);
        g2.clip(e);

        // Téglalap létrehozása
        Shape r = new Rectangle2D.Float(-cx,-cy, cx*2, cy);

        // Vonalas minta 45 fokos szögben kék és sárga színek közötti átmenettel
        g2.setPaint(new GradientPaint(40,40,Color.blue,50,50,Color.yellow,true));
        g2.fill(r);

        // zöld színnel kitöltött ellipszis (most kör) rajzolása
        Shape k = new Ellipse2D.Float(0,0,cx,cy);
        g2.setPaint(Color.green);
        g2.fill(k);

        // a lila határvonal beállítása
        g2.setPaint(Color.magenta);
        g2.setStroke(new BasicStroke(5));
        g2.draw(k);
        g2.setClip(oldVago);

        // szöveg megjelenítése
        g2.setFont(new Font("Times New Roman", Font.BOLD, 60));

        //Vízszintes vonalas minta fekete piros átmenettel
        g2.setPaint(new GradientPaint(-cx,0,Color.black,cx,0,Color.red,false));
        g2.drawString("Tokaj-Hegyalja Egyetem", -cx*2/3,cy/5);

        // az alábbi képet 80%-ban áttetsző módon jelenítjük meg
        Composite regiC = g2.getComposite();
        AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER,0.90F);
        g2.setComposite(regiC);

        // kép megjelenítése
        g2.drawImage(kep, -cx/3, -5*cy/6, this);
        g2.setComposite(regiC);

    }

    public static void main(String[] args) {

        JFrame keret = new JFrame("2D JAVA Grafika");
        Container tarolo = keret.getContentPane( );
        tarolo.setLayout(new BorderLayout( ));
        tarolo.add(new K4WZH6grafika2D(), BorderLayout.CENTER);
        keret.setSize(800,800);
        keret.setLocation(350,100);
        keret.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e)
                    {
                        System.exit(0);
                    }
                }
        );
        keret.setVisible(true);


    }

}
