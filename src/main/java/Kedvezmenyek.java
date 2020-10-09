import java.util.ArrayList;

public class Kedvezmenyek {

    protected static final Kedvezmeny KEDVEZMENYNINCS       = new KedvezmenyNincs      ("NINCS KEDVEZMÉNY");
    protected static final Kedvezmeny KEDVEZMENYMEGAPACK    = new KedvezmenyMegapack   ("MEGAPACK");
    protected static final Kedvezmeny KEDVEZMENYKETTOTFIZET = new KedvezmenyKettotFizet("KETTŐT FIZET, HÁRMAT KAP");

    public static ArrayList<Kedvezmeny> getKedvezmenyek() {
        ArrayList<Kedvezmeny> kedvezmenyLista = new ArrayList<>();

        kedvezmenyLista.add(KEDVEZMENYKETTOTFIZET);
        kedvezmenyLista.add(KEDVEZMENYMEGAPACK);

        return kedvezmenyLista;
    }

}