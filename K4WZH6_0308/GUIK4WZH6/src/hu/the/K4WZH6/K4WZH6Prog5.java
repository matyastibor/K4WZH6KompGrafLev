package hu.the.K4WZH6;

import javax.swing.JButton;
import javax.swing.JFrame;

public class K4WZH6Prog5 extends JFrame {
    K4WZH6Prog5()
    {
        JFrame ablak = new JFrame();
        ablak.setLayout(null);

        JButton gomb1 = new JButton("Kilépés");
        gomb1.setBounds(20 , 100 , 100 , 30);
        ablak.add(gomb1);
        gomb1.addActionListener(e -> ablak.dispose());

        JButton gomb2 = new JButton("Változtat");
        gomb2.setBounds(140 , 100 , 100 , 30);
        ablak.add(gomb2);
        gomb2.addActionListener(e -> ablak.setTitle("Működik!"));

        JButton gomb3 = new JButton("Vissza");
        gomb3.setBounds(260 , 100 , 100 , 30);
        ablak.add(gomb3);
        gomb3.addActionListener(e -> ablak.setTitle("Előző!"));

        ablak.setSize(400,300);
        ablak.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ablak.setVisible(true);
    }

    public static void main(String[] args)
    {
        new K4WZH6Prog5();
    }

}
