package Ventana2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame {
    public Ventana() {
        initValues();
    }

    private void initValues() {

        setTitle("Ventana #2");
        setSize(300, 300);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Font font1 = new Font("Arial", 1, 22);
        JLabel texto1 = new JLabel("0");
        JButton btnStart = new JButton("Start");

        texto1.setFont(font1);
        texto1.setBounds(10, 10, 50, 25);
        btnStart.setBounds(10, 40, 75, 25);

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyThread t = new MyThread();
                t.texto1 = texto1;
                t.start();
            }
        };

        add(texto1);
        add(btnStart);
        btnStart.addActionListener(listener);

    }
}
