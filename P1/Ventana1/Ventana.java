package Ventana1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

    public Ventana() {
        initValues();
    }// end Ventana

    private void initValues() {

        setTitle("Ventana1");
        setSize(300, 300);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Font font1 = new Font("Arial", 1, 24);
        Font font2 = new Font("Arial", 1, 12);
        JLabel texto1 = new JLabel("0");
        JLabel texto2 = new JLabel("0");
        JButton boton1 = new JButton("Iniciar contador");

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                boton1.setEnabled(false);
                new Thread(() -> {
                    for (int i = 1; i <= 10; i++) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        texto1.setText(String.valueOf(i));
                    }
                }).start();
                new Thread(() -> {
                    for (int i = 1; i <= 10; i++) {
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        texto2.setText(String.valueOf(i));
                    }
                    boton1.setEnabled(true);
                }).start();

            }
        };

        boton1.addActionListener(actionListener);
        texto1.setFont(font1);
        boton1.setFont(font2);
        texto1.setBounds(10, 10, 50, 25);
        texto2.setFont(font1);
        texto2.setBounds(10, 30, 50, 25);
        boton1.setBounds(50, 60, 150, 35);

        add(texto1);
        add(texto2);
        add(boton1);
    }// end initValues
}