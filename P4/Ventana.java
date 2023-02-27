
import javax.swing.*;
import java.awt.event.*;
public class Ventana extends JFrame{
    public Ventana(){
        initValues();
    }
    private void initValues(){
        JLabel background=new JLabel();
        ImageIcon icon=new ImageIcon(this.getClass().getResource("images/background.jpeg"));
        background.setIcon(icon);
        

        Personaje img=new Personaje("images/mario1.png","images/mario2.png","images/marioSalto.png");
        img.background=background;

        JButton btnStart=new JButton("Start");

        img.setFocusable(true);
        btnStart.setFocusable(false);

        btnStart.setBounds(10,80,75,30);
        background.setBounds(0,-596,3840,1080);
        img.setBounds(10,174,42,42);

        ActionListener listener=new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                Thread t=new Thread(img);
                t.start();
            }//end actionPerformed
        };
        btnStart.addActionListener(listener);
        img.addKeyListener(img);

        add(img);
        add(btnStart);
        add(background);

        setTitle("Ventana");
        setSize(300,300);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}