public class KedvezmenyMegapack extends Kedvezmeny {

    public KedvezmenyMegapack(String nev) {
        super(nev);
    }

    @Override
    public int szamol(TermekTipus termek, int darab) {
        return (darab / 12) * 6000;
    }
}