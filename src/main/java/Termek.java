//import java.util.Date;

public class Termek {

    private TermekTipus termekTipus;
    //private Date        lejaratiDatum;

    public Termek(TermekTipus termekTipus) {
        this.termekTipus = termekTipus;
    }

    public TermekTipus getTermekTipus() {
        return termekTipus;
    }

    public int getAr() {
        return this.termekTipus.getAr();
    }

    public String getNev() {
        return this.termekTipus.getNev();
    }

    public Kedvezmeny getKedvezmeny() {
        return this.termekTipus.getKedvezmeny();
    }
}