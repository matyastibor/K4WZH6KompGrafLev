package hu.the.K4WZH6;

import javax.swing.JFrame;
import javax.swing.JButton;
public class K4WZH6Prog4 extends JFrame
{
    K4WZH6Prog4()
    {
        JFrame ablak = new JFrame();
        ablak.setLayout(null);

        JButton gomb = new JButton("Kilépés!");
        gomb.setBounds(140 , 120 , 100 , 30);
        ablak.add(gomb);
        gomb.addActionListener(e -> ablak.dispose()); // Ablak bezárása a gombra kattintva

        ablak.setSize(400,300);
        ablak.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ablak.setVisible(true);
    }

    public static void main(String[] args)
    {
        new K4WZH6Prog4();
    }

}
