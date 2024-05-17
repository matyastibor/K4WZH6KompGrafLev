package hu.the.K4WZH6;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import  javax.swing.JLabel;
public class K4WZH6Prog6 extends JFrame {
    JLabel felirat1;
    JLabel felirat2;

    K4WZH6Prog6() {
        felirat1 = new JLabel("Programtervező informatikus, PTI");
        felirat2 = new JLabel("Programtervező informatikus, 2024");

        felirat1.setBounds(50, 50, 250, 30);
        felirat2.setBounds(50, 100, 250, 30);

        add(felirat1);
        add(felirat2);

        //setLayout(new FlowLayout());
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(400, 300);
        setVisible(true);

    }

    public static void main(String args[]) {
        new K4WZH6Prog6();
    }
}