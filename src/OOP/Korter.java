package OOP;

/**
 *   seotud klassiga Pidu
 *   //tegi Jyri Ahhundov  -No ma tegin enda Korteri veidi napakalt läbi massiivi, ArrayList teeb suurema osa käsitööst ära ja ei ole fix suurusega
 */

import java.util.Arrays;

public class Korter {
    private int mahutab;
    private int counter = 0;
    private String[] kylalised;

    // Klassi konstruktor
    public Korter(int mahutab) {
        this.mahutab = mahutab;
        kylalised = new String[mahutab];
    }

    // Meetod saabus, lisab esimesse tühja masiivi pessa meetodis etteantud stringi
    public void saabus(String str) {
        for (int i = 0; i < kylalised.length; i++) {
            if (kylalised[i] == null) {
                kylalised[i] = str;
                counter++;
                return;
            }
        }
    }

    // Meetod lahkus, eemaldab esimese kokkulangevuse peale massiivi pesast etteantud stringi
    public void lahkus(String str) {
        for (int i = 0; i < kylalised.length; i++) {
            if (kylalised[i].equals(str)) {
                kylalised[i] = null;
                counter--;
                return;
            }
        }
    }

    // Prindib välja mahutab ja counteri vahe
    public void prindiPaljuVeelMahub() {
        System.out.println("Veel mahub " + (mahutab - counter) + " külalist");
    }

    // Prindib välja counteri
    public void prindiKylalisteArv() {
        System.out.println("Külaliste arv on: " + counter);
        System.out.println("Massiiv: " + Arrays.toString(kylalised)); // Listsalt testin, kas nimed on olemas
    }
}
