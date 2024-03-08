package hu.the.K4WZH6;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class K4WZH6Prog3 extends JFrame
{
    K4WZH6Prog3()
    {
        JFrame ablak = new JFrame();
        ablak.setLayout(null);

        JLabel felirat1 = new JLabel("Programtervező informatikus, PTI");
        felirat1.setBounds(20,100,250,30); // Pozicionálás és méretezés
        ablak.add(felirat1);

        JLabel felirat2 = new JLabel("Programtervező informatikus, 2024");
        felirat2.setBounds(20,120,250,30);
        ablak.add(felirat2);

        ablak.setSize(400,300);
        ablak.setLocationRelativeTo(null); // Képernyő közepére rendezi az ablakot
        ablak.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ablak.setVisible(true);
    }

    public static void main(String[] args)
    {
        new K4WZH6Prog3();
    }

}
