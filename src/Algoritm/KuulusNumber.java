package Algoritm;

/**
 *           TEHTUD!!!
 * tehtud by Dmitry Lukas, Juri Ahhundov
 * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis rohkem?
 * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
 * Alginfo
 * public class KuulusNumber {

 public static void main(String[] args) {

 int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7
 }

 }
 Gert Vesterberg Tegin ajaviiteks esimese algoritmi ül. ära, http://pastebin.com/kMGFGtVc
 Marko Mõznikov mida see x -> x tähendab
 GERT
 Kasutasin lambdasid, mis on alates java8'st toetatud. x on argument,
 ning y on argumendi väärtus (antud juhul siis vastava integeri väärtus arrays konkreetsel iteratsiooni hetkel).
 Põhimõtteliselt saab seda ülesannet ka tsükli abil lahendada, aga koodi on siis vist veidi rohkem.
 http://www.oracle.com/webfolder/technetwork/tutorials/obe/java/Lambda-QuickStart/index.html
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis rohkem?
 * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
 */
public class KuulusNumber {

    public static void main(String[] args) {

        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7
        ArrayList<Integer> tulemus = new ArrayList();
        ArrayList <Integer> moodid = new ArrayList();


        for (int i = 0; i < naide.length; i++) {
            if (naide[i] != 3) {
                tulemus.add(naide[i]);
            }
        }
        System.out.println(tulemus);

        int mood = 0;
        for (int i : tulemus) {

            int sagedus = Collections.frequency(tulemus, i);
            System.out.println(sagedus);

            if (sagedus == mood) {
                moodid.add(i);
            }

            if (sagedus > mood) {
                moodid.clear();
                moodid.add(i);
                mood = sagedus;
            }
        }
        System.out.println(moodid);
    }
}
