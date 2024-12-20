import java.time.LocalDateTime;

public class Bewertung {
    private String sName;
    private LocalDateTime ldtDatum;
    private int iBetreuung;
    private int iQualitaet;
    private int iTermintreue;
    private int iPreis;


    public Bewertung(String sName, LocalDateTime ldtDatum, int iBetreuung, int iQualitaet, int iTermintreue, int iPreis) {
        this.sName = sName;
        this.ldtDatum = ldtDatum;
        this.iBetreuung = iBetreuung;
        this.iQualitaet = iQualitaet;
        this.iTermintreue = iTermintreue;
        this.iPreis = iPreis;
    }

    public double berechneDurchschnitt(){
        return (iBetreuung+iQualitaet+iTermintreue+iPreis) / 4.0;

    }


    public String getsName() {
        return sName;
    }

    public LocalDateTime getLdtDatum() {
        return ldtDatum;
    }

    public int getiBetreuung() {
        return iBetreuung;
    }

    public int getiQualitaet() {
        return iQualitaet;
    }

    public int getiTermintreue() {
        return iTermintreue;
    }

    public int getiPreis() {
        return iPreis;
    }
}
