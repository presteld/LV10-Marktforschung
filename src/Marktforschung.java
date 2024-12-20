import javax.swing.*;
import java.awt.*;

public class Marktforschung extends JFrame {

    private JPanel jpPanel;

    public Marktforschung() throws HeadlessException {
        setTitle("Markforschung");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,500);
        setContentPane(jpPanel);
        setVisible(true);


    }

    public static void main(String[] args) {
       new Marktforschung();

    }
}
