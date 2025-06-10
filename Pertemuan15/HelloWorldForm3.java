package Pertemuan15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Penjumlahan extends JFrame implements ActionListener {
    private JTextField field1, field2;
    private JButton btnHitung;

    public Penjumlahan() {
        // Setting frame
        setTitle("Program Penjumlahan");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);

        // Membuat komponen
        field1 = new JTextField(10);
        field2 = new JTextField(10);
        btnHitung = new JButton("Hitung");

        // Menambahkan action listener
        btnHitung.addActionListener(this);

        // Menambahkan komponen ke frame
        add(new JLabel("Angka 1:"));
        add(field1);
        add(new JLabel("Angka 2:"));
        add(field2);
        add(btnHitung);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double angka1 = Double.parseDouble(field1.getText());
            double angka2 = Double.parseDouble(field2.getText());
            double hasil = angka1 + angka2;
            
            JOptionPane.showMessageDialog(this, 
                "Jumlah: " + hasil, 
                "Hasil Penjumlahan", 
                JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, 
                "Input harus berupa angka!", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Penjumlahan();
    }
}