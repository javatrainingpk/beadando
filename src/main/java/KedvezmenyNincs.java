public class KedvezmenyNincs extends Kedvezmeny {

    public KedvezmenyNincs(String nev) {
        super(nev);
    }

    @Override
    public int szamol(TermekTipus termek, int darab) {
        return 0;
    }
}