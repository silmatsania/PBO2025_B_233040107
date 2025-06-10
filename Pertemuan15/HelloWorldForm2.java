package Pertemuan15;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HeliokwidtForm2 extends JFrame {
    private JLabel label;

    public HeliokwidtForm2() {
        label = new JLabel();
        label.setText("Hello Dunkel");
        add(label);
        
        setTitle("Program pertama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 300);
    }
}