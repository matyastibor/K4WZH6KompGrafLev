package hu.the.K4WZH6;
import java.awt.*;
import javax.swing.*;
public class K4WZH6Prog7 extends JFrame {

    public K4WZH6Prog7(){
        super("MT");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(480,240);
        setBackground(Color.white);
    }

    public void paint(Graphics g){
        Rectangle r = getBounds();
        g.setColor(Color.yellow);
        g.fillRect(0,0,r.width,r.height);

        Font f = new Font("Times New Roman", Font.BOLD+Font.ITALIC,30);
        g.setFont(f);
        g.setColor(Color.blue);
        g.drawString("Programtervező informatikus 2024", 20, 100);

        Font f1 = new Font("Calibri", Font.BOLD,24);
        g.setFont(f1);
        g.setColor(Color.darkGray);
        g.drawString("Programtervező informatikus 2024", 20, 150);

        Font f2 = new Font("Arial", Font.ITALIC,18);
        g.setFont(f2);
        g.setColor(Color.red);
        g.drawString("Programtervező informatikus 2024", 20, 200);

    }

    public static void main(String[] args){
        K4WZH6Prog7 MT = new K4WZH6Prog7();
        MT.setVisible(true);
    }

}
