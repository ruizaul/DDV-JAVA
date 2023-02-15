import javax.swing.*;

public class Imagen extends JLabel implements Runnable {

    ImageIcon icon;
    String url, url2;
    int time, posY;

    public Imagen(String url, String url2, Integer time, Integer posY) {

        this.url = url;
        this.url2 = url2;
        this.time = time;
        this.posY = posY;

        icon = new ImageIcon(this.getClass().getResource(url));
        setIcon(icon);
    }

    public void run() {

        for (int x = 10; x <= 250; x++) {
            if ((x % 2) != 0) {
                icon = new ImageIcon(this.getClass().getResource(url2));
            } else {
                icon = new ImageIcon(this.getClass().getResource(url));
            }
            setIcon(icon);
            setBounds(x,posY,42,42);
            try {
                Thread.sleep(time);
            } catch (Exception e) {
            }
        }

    }


}