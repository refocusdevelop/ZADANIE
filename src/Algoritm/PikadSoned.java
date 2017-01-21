/**
 * Antud on massiiv. Mitu sõne on massiivis keskmisest pikemad?
public class PikadSoned {

    String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"}; // vastus on 3

}              TEHTUD!!!
 */



package Algoritm;

import java.util.Arrays;

/**
 * Antud on massiiv. Mitu sõne on massiivis keskmisest pikemad?
 */
public class PikadSoned {
    public static void main(String[] args) {
        String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"}; // vastus on 3

        double summa = 0;
        for (int i = 0; i < naide.length; i++) {
            naide[i].length();
            System.out.println(naide[i].length());

            summa = summa + naide[i].length();
        }
        System.out.println(summa);

        double keskmine = summa/naide.length;
        System.out.println(keskmine);

        int vastus = 0;
        for (int i = 0; i < naide.length; i++) {
            if (naide[i].length()> keskmine) {
                vastus++;
            }
        }
        System.out.println(vastus);
    }




}
