
import javax.swing.*;
import java.awt.event.*;

public class Personaje extends JLabel implements Runnable,KeyListener{
    private String url1,url2;
    private int posX=10,posXBack=0;
    private ImageIcon icon;
    private boolean changeImg=false,runStatus=false,right=false,shift=false;
    JLabel background;

    public Personaje(String url1,String url2){
        this.url1=url1;
        this.url2=url2;
        icon=new ImageIcon(this.getClass().getResource(url1));
        setIcon(icon);
    }

    public void run(){
        runStatus=true;
        while(true){
            System.out.println("while");            
            if(right&&shift){moveImage(20, 40);}
            if(right){moveImage(1,100);}
        }
    }
    private void moveImage(int power,int time){
        if(changeImg){
            icon=new ImageIcon(this.getClass().getResource(url1));
            changeImg=false;
        }else{
            icon=new ImageIcon(this.getClass().getResource(url2));
            changeImg=true;
        }
        if(posX>=120 && posXBack>=-500){
            posXBack-=power;
            background.setBounds(posXBack,0,10000,400);
            setBounds(120,174,42,42);
        }else if(posX<=263){            
            posX+=power;            
            setBounds(posX,174,42,42);
            System.out.println(posX);
        }
        setIcon(icon);
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            
        }
    }

    public void keyTyped(KeyEvent ke){}

    public void keyPressed(KeyEvent ke){
        if(runStatus){
            if(ke.getKeyCode()==KeyEvent.VK_RIGHT){right=true;}

            if(ke.getKeyCode()==KeyEvent.VK_SHIFT){shift=true;}
        }
    }

    public void keyReleased(KeyEvent ke){
        if(ke.getKeyCode()==KeyEvent.VK_RIGHT){right=false;}

        if(ke.getKeyCode()==KeyEvent.VK_SHIFT){shift=false;}
    }
}
