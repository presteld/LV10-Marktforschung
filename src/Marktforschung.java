import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

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
    private JTextArea taAusgabe;

    private ArrayList<Bewertung> alBewertungen = new ArrayList<Bewertung>();

    public Marktforschung() throws HeadlessException {
        setTitle("Markforschung");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,500);
        setContentPane(jpPanel);
        setVisible(true);


        alBewertungen.add(new Bewertung("Jasmin K.",LocalDateTime.of(2024,12,19,0,0,0),2,4,5,1));
        alBewertungen.add(new Bewertung("Roland K.",LocalDateTime.of(2024,11,17,0,0,0),2,3,5,1));
        alBewertungen.add(new Bewertung("Helga K.",LocalDateTime.of(2024,9,17,0,0,0),1,3,5,1));
        btnErfassen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                erfassen();
            }
        });
        btnAlleAusgeben.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                alleAusgeben();
            }
        });
    }



    private void alleAusgeben() {
        taAusgabe.setText("Folgende Bewertungen wurden gespeichert:\n\n");

        for (Bewertung bewB: alBewertungen){

            taAusgabe.append("\n" +   bewB.getsName() + "\t" +    bewB.getiBetreuung() + "\t" +    bewB.getiQualitaet() +"\t"  + bewB.getiTermintreue() + "\t" + bewB.getiPreis()+ "\t"+ bewB.getLdtDatum() );
        }

    }

    public void erfassen() {
        String sName = txtName.getText().toString();

        String sDatum = txtDatum.getText().toString();
        LocalDateTime ldtDatum = LocalDate.parse(sDatum).atStartOfDay();

        int iBetreuung = Integer.parseInt(cboBetreuung.getSelectedItem().toString());
        int iQualitaet = Integer.parseInt(cboQualitaet.getSelectedItem().toString());
        int iTermintreue = Integer.parseInt(cboTermintreue.getSelectedItem().toString());
        int iPreis = Integer.parseInt(cboPreis.getSelectedItem().toString());

        Bewertung bewKunde = new Bewertung(sName,ldtDatum,iBetreuung,iQualitaet,iTermintreue,iPreis);
        alBewertungen.add(bewKunde);

    }


    public static void main(String[] args) {
       new Marktforschung();

    }
}
