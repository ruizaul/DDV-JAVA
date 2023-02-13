import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame {
    public Ventana(){
        initValues();
    }

    private void initValues(){

        JButton btnStart = new JButton("Start");
        Imagen img1 = new Imagen("images/mario1.png","images/mario2.png",50,40);
        Imagen2 img2 = new Imagen2("images/link1.png","images/link2.png");

        img2.setFocusable(true);
        btnStart.setFocusable(false);

        btnStart.setBounds(10,10,75,25);
        img1.setBounds(10,40,42,42);
        img2.setBounds(10,80,42,42);
        
        ActionListener listener = new ActionListener(){
                public void actionPerformed(ActionEvent e){

                    Thread t = new Thread(img1);
                    t.start();

                    Thread t2 = new Thread(img2);
                    t2.start();
                    
                }
        };

        btnStart.addActionListener(listener);
        img2.addKeyListener(img2);
        
        add(btnStart);
        add(img1);
        add(img2);

        setTitle("Ventana 3");
        setSize(300,300);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    };
}