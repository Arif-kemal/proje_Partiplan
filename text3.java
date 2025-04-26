import javax.swing.*;
import java.awt.HeadlessException;
public class text3 extends JFrame {
    public OyunEkrani(String titile) throws HeadlessException {
        super(titile);
    }

    public static void main(String[] args) {
        OyunEkrani ekran = new OyunEkrani("Uzay Oyunu");
        ekran.setResizable(false);
        ekran.setFocusable(false);

        ekran.setSize(800,600);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Oyun oyun= new Oyun ();
        ekran.add(oyun);
        oyun.requestFocus();

        oyun.setFocusable(true);
        oyun.addKeyListener(oyun);
        oyun.setFocusTraversalKeysEnabled(false);
        ekran.setVisible(true);
    }
}