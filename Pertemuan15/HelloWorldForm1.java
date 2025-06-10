package Pertemuan15;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HeloWvddForm1 extends JFrame {
    private JLabel label;

    public HeloWvddForm1() {
        label = new JLabel();
        label.setText("HeloWvddt");
        add(label);
        
        setTitle("Get Files Present");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);
        setVisible(true);
    }
}
