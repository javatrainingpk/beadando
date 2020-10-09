public enum TermekTipus {

    TELISZALAMI("téliszalámi", 2000, Kedvezmenyek.KEDVEZMENYKETTOTFIZET),
    GUMIKACSA  ("gumikacsa"  , 3000, Kedvezmenyek.KEDVEZMENYKETTOTFIZET),
    UBORKA     ("uborka"     , 2800, Kedvezmenyek.KEDVEZMENYMEGAPACK),
    GESZTENYE  ("gesztenye"  , 1000, Kedvezmenyek.KEDVEZMENYMEGAPACK);

    private final String     nev;
    private final int        ar;
    private final Kedvezmeny kedvezmeny;

    TermekTipus(String nev, int ar, Kedvezmeny kedvezmeny) {
        this.nev        = nev;
        this.ar         = ar;
        this.kedvezmeny = kedvezmeny;
    }

    public String getNev() {
        return nev;
    }

    public int getAr() {
        return ar;
    }

    public Kedvezmeny getKedvezmeny() {
        return kedvezmeny;
    }

}