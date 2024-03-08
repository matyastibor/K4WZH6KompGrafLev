package hu.the.K4WZH6;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class K4WZH6Prog2 extends JFrame {

    JLabel felirat;

    K4WZH6Prog2()
    {
        setSize(400,300);
        felirat = new JLabel("Programtervező informatikus, BSC");
        add(felirat);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String args[])
    {
        new K4WZH6Prog2();
    }

}
