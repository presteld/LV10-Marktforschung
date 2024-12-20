import javax.swing.*;
import java.awt.*;

public class Marktforschung extends JFrame {

    private JPanel jpPanel;
    private JLabel lblName;
    private JLabel lblDatum;
    private JLabel lblBetreuung;
    private JLabel lblQualitaet;
    private JLabel lblTermintreue;
    private JLabel lblPreis;
    private JTextField txtName;
    private JTextField txtDatum;
    private JComboBox cboBetreuung;
    private JComboBox cboQualitaet;
    private JComboBox cboTermintreue;
    private JComboBox cboPreis;
    private JCheckBox cbLetzte30Tage;
    private JButton btnErfassen;
    private JButton btnBerechnen;
    private JButton btnAlleAusgeben;
    private JTextArea tyAusgabe;

    public Marktforschung() throws HeadlessException {
        setTitle("Markforschung");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,500);
        setContentPane(jpPanel);
        setVisible(true);


    }

    public static void main(String[] args) {
       new Marktforschung();

    }
}
