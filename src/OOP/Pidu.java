package OOP;

import java.util.ArrayList;

/**
 * TEHTUD, seotud klassiga Pidu
 * SEE ON SEE KORTER PROJEKT - vaata Korter.java
 *
 * Peole on kutsutud rohkem inimesi kui korterisse mahub. Sinu ülesanne on Korteri
 * objekt ehitada nii, et üleliigsetest keelduda saaks.
 *
 * Reeglid
 * 1. Pidu klassi muuta ei tohi.
 * 2. Maja maksimum on 10 inimest.
 * 3. Kui Korter on täis siis on täis. Rohkem juurde ei saa
 *
 *       VEEL
 *       package OOP;
 import java.util.ArrayList;
 public class Korter {
    ArrayList<String> korter = new ArrayList<>();
    int mahutavus;
    int paljuMahubVeel;
    public Korter(int mahutab) {mahutavus = mahutab;
    }
    public void saabus(String taavi) {
        if (korter.size() < mahutavus) {
            korter.add(taavi);
        } else {
            System.out.println("Sa ei mahu kahjuks peole, meid on juba 10");
        }
    }
    public void prindiKylalisteArv() {
        System.out.println(korter.size());
    }
    public void prindiPaljuVeelMahub() {
        paljuMahubVeel = mahutavus - korter.size();
        System.out.println(paljuMahubVeel);
    }
    public void lahkus(String taavi) {
        korter.remove(taavi);
    }
}
*/

public class Pidu {
    public static void main(String[] args) {

        int mahutab = 10;
        Korter korter = new Korter(mahutab);

        korter.saabus("Taavi");
        korter.saabus("Pilve");
        korter.saabus("Maarika");
        korter.saabus("Joonas");
        korter.saabus("Kalle");
        korter.saabus("Muri");
        korter.saabus("Sille");

        korter.prindiKylalisteArv();
        korter.prindiPaljuVeelMahub();

        korter.lahkus("Taavi");

        korter.saabus("Tambet");
        korter.saabus("Liisa");
        korter.saabus("Liis");
        korter.saabus("Veidro");
        korter.saabus("Moonika");
        korter.saabus("Politsei");

        korter.lahkus("Sille");

        korter.prindiKylalisteArv(); // peaks olema 9, järjekorda ei ole.
    }
}
