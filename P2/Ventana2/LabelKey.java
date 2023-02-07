package Ventana2;
import javax.swing.*;
import java.awt.event.*;

public class LabelKey extends JLabel implements Runnable{

    int posX = 10;
    int limitRight = 250;
    int limitLeft = 10;
    
    public LabelKey(String texto) {
        setText(texto);
    }

    public void run() {
            this.addKeyListener(new KeyListener() {
                public void keyTyped(KeyEvent ke) {}
                public void keyPressed(KeyEvent ke) {
                    if (ke.getKeyCode() == ke.VK_RIGHT) {
                        if (posX == limitRight) {
                            posX = limitRight;
                        }
                        else {
                            posX += 3;
                            setBounds(posX, 40,50,25);
                        }
                    }


                    if (ke.getKeyCode() == ke.VK_LEFT) {
                        if (posX <= limitLeft) {
                            posX = limitLeft;
                        }
                        else {
                            posX -= 3;
                            setBounds(posX, 40,50,25);
                        }  
                    }
                }
                public void keyReleased(KeyEvent ke) {}
            });
    }
}
