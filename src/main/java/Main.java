import java.util.Scanner;

public class Main {

    private static void bekeres(Kosar kosar) {
        int     darab   = 0;
        Scanner scanner = new Scanner(System.in);
        boolean hibaVolt;

        for (TermekTipus termekTipus : TermekTipus.values()) {
            System.out.println(termekTipus.getNev() + " darabszáma = ");
            do {
                hibaVolt = false;
                try {
                    darab = scanner.nextInt();
                } catch(Exception e) {
                    hibaVolt = true;
                    System.out.println("Hibás érték, kérem adja meg újra!");
                    scanner = new Scanner(System.in);
                }
            }
            while(hibaVolt);

            for (int i = 0; i < darab; i++) {
                kosar.hozzaad(new Termek(termekTipus));
            }
        }
    }

    public static void main(String[] args) {
        Kosar kosar = new Kosar();
        bekeres(kosar);
        kosar.listaz();
    }

}