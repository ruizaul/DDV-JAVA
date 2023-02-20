import javax.swing.*;

public class Fondo extends JLabel implements Runnable {

    ImageIcon fondo;
    String url;

    public Fondo(String url) {

        this.url = url;

        fondo = new ImageIcon(this.getClass().getResource(url));
        setIcon(fondo);

    }

    public void run() {

        
        
    }


}