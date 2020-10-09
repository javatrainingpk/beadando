import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Tesztek {

    @Test
    public void kosarTeszt() {
        Kosar kosar = new Kosar();
        assertEquals(0, kosar.kosarOsszegez());

        for (int i = 0; i < 5; i++) {
            kosar.hozzaad(new Termek(TermekTipus.TELISZALAMI));
        }
        assertEquals(10000, kosar.kosarOsszegez());

        kosar.hozzaad(new Termek(TermekTipus.GESZTENYE));

        kosar.listaz();
        assertEquals(Kedvezmenyek.KEDVEZMENYKETTOTFIZET, kosar.getLegjobbKedvezmeny());

        //Itt szándékosan hibás értékre vizsgálunk a tesztelés során
        assertEquals(12000, kosar.kosarOsszegez());
    }

}