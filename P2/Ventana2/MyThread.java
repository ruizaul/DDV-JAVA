package Ventana2;

import javax.swing.*;

public class MyThread extends Thread {
    JLabel texto1;
    int n = 1;
    boolean tr = true;

    public void run() {

        while (true) {
            try {

                Thread.sleep(10);

                if (tr == true) {
                    texto1.setBounds(n, 10, 50, 25);
                    n++;
                    if (n == 260) {
                        tr = false;
                    }
                }

                if (tr == false) {
                    texto1.setBounds(n, 10, 50, 25);
                    n--;
                    if (n == 10) {
                        tr = true;
                    }
                }

            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }

}
