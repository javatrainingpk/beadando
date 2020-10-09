public class KedvezmenyKettotFizet extends Kedvezmeny {

    public KedvezmenyKettotFizet(String nev) {
        super(nev);
    }

    @Override
    public int szamol(TermekTipus termek, int darab) {
        return (darab / 3) * termek.getAr();
    }
}