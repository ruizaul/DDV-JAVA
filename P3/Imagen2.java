import javax.swing.*;
import java.awt.event.*;

public class Imagen2 extends JLabel implements Runnable, KeyListener{
	
	private String url1, url2;
	private ImageIcon icon;
	private int posX = 10;
	private int posY = 120;
	private boolean runStatus = false, right=false, shift=false, arriba=false;

	public Imagen2(String url1, String url2){
		this.url1=url1;
		this.url2=url2;

		icon = new ImageIcon(this.getClass().getResource(url1));
		setIcon(icon);	

	}

	public void run(){
		runStatus=true;	
		
		while(true){
			try{
				
				Thread.sleep(20);
				if(arriba==true){
					posY=100;
				}
				else{
					posY=120;
				}
				if(right==true && shift==true){
					posX+=5;
				}
				else if (right==true && shift==false){
					posX++;

				}

				if((posX%2)!=0){
					icon = new ImageIcon(this.getClass().getResource(url2));

				} else{
					icon = new ImageIcon(this.getClass().getResource(url1));

				}

				setBounds(posX,posY,42,42);	
				setIcon(icon);

				

			}catch(Exception e){}
			
			
		}

	
	}

	public void keyTyped(KeyEvent ke){}

	public void keyPressed(KeyEvent ke){
		if(runStatus){

			if(ke.getKeyCode() == KeyEvent.VK_RIGHT){
				right = true;
			}
			if(ke.getKeyCode() == KeyEvent.VK_SHIFT){
				shift = true;
			}
			if(ke.getKeyCode() == KeyEvent.VK_UP){
				arriba = true;
			}


		}
	}

	public void keyReleased(KeyEvent ke){

		if(ke.getKeyCode() == KeyEvent.VK_RIGHT){
			right = false;
		}
		if(ke.getKeyCode() == KeyEvent.VK_SHIFT){
			shift = false;
		}
		if(ke.getKeyCode() == KeyEvent.VK_UP){
				arriba = false;
		}



	}

}