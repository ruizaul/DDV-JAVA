package Ventana1;

import javax.swing.*;

public class Etiqueta extends JLabel implements Runnable {

    JButton btnStart;

    public Etiqueta(String txt1) {
        setText(txt1);
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
                setText(Integer.ToString(i));
            } catch (Exception e) {
            }
        } // end for
        btnStart.setEnabled(true);
    } // end run
}