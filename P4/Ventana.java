import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame{

	public Ventana() {
		initValues();
	}

	private void initValues() {

		JLabel background = new JLabel();
		ImageIcon icon = new ImageIcon(this.getClass().getResource("images/background.jpg"));

		JButton btnStart = new JButton("Start");
		Personaje pj = new Personaje("images/mario1.png","images/mario2.png");
		

		background.setIcon(icon);
		
		
		pj.setFocusable(true);
		background.setFocusable(false);
		btnStart.setFocusable(false);

		btnStart.setBounds(10,40,70,25);
		pj.setBounds(10,175,42,42);
		background.setBounds(0,-30,510,300);
		
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e){

				Thread t = new Thread(pj);
				t.start();
				
				
		
			}

		};

		btnStart.addActionListener(listener);
		pj.addKeyListener(pj);
		
		add(btnStart);
		add(pj);
		add(background);

		setTitle("Ventana 3");
		setSize(300,300);
		setResizable(false);
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}



}