import java.util.HashMap;

public abstract class Kedvezmeny {
    private String nev;

    public Kedvezmeny(String nev) {
        this.nev = nev;
    }

    public String getNev() {
        return nev;
    }

    public int osszesit(HashMap<String, Integer> termekekDarabbal) {
        int kedvezmeny = 0;
        for (TermekTipus termekTipus : TermekTipus.values()) {
            for (String termekNeve : termekekDarabbal.keySet()) {
                if (   termekTipus.getNev().equals(termekNeve)
                    && (termekTipus.getKedvezmeny() == this)) {
                    kedvezmeny += szamol(termekTipus, termekekDarabbal.get(termekNeve));
                }
            }
        }
        return kedvezmeny;
    }

    public abstract int szamol(TermekTipus termek, int darab);
}