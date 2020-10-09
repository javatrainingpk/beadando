import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Kosar {

    private List<Termek>             kosarban          = new ArrayList<>();
    private HashMap<String, Integer> termekekDarabbal  = new HashMap<>();
    private Kedvezmeny               legjobbKedvezmeny;

    public void hozzaad(Termek termek) {
        kosarban.add(termek);
    }

    //Csak a Junit-os teszteléshez felvéve
    public Kedvezmeny getLegjobbKedvezmeny() {
        return legjobbKedvezmeny;
    }

    public void kosarOsszesit() {
        termekekDarabbal.clear();

        for (TermekTipus termekTipus : TermekTipus.values()) {
            termekekDarabbal.put(termekTipus.getNev(), 0);

            for (Termek termekek : kosarban) {
                if (termekek.getTermekTipus() == termekTipus) {
                    termekekDarabbal.put(termekek.getNev(), termekekDarabbal.get(termekek.getNev()) + 1);
                }
            }
        }
    }

    private void teteleketListaz() {
        System.out.println("A kosár tartalma:");
        for (String termekNeve : termekekDarabbal.keySet()) {
            System.out.println("- " + termekNeve + ": " + termekekDarabbal.get(termekNeve) + " db");
        }
    }

    private void legjobbKedvezmenytKeres() {
        legjobbKedvezmeny = Kedvezmenyek.KEDVEZMENYNINCS;
        for (Kedvezmeny kedvezmeny : Kedvezmenyek.getKedvezmenyek()) {
            if (kedvezmeny.osszesit(termekekDarabbal) > legjobbKedvezmeny.osszesit(termekekDarabbal)) {
                legjobbKedvezmeny = kedvezmeny;
            }
        }
    }

    protected int kosarOsszegez() {
        int osszeg = 0;
        for (Termek termek : kosarban) {
            osszeg += termek.getAr();
        }
        return osszeg;
    }

    public void listaz() {
        kosarOsszesit();
        teteleketListaz();
        legjobbKedvezmenytKeres();
        System.out.println("A kosár eredeti ára      : " + kosarOsszegez());
        System.out.println("A kosár kedvezményes ára : " + (kosarOsszegez() - legjobbKedvezmeny.osszesit(termekekDarabbal)));
        System.out.println("Kedvezmény típus neve    : " + legjobbKedvezmeny.getNev());
    }

}