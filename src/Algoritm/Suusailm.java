package Algoritm;
/**
 * Antud on kaks massiivi õhu temperatuuridega. Arvuta mõlema puhul mitu positiivset temperatuuri
 * on massiivis rohkem kui negatiivseid.
 *
 *    HOW MANY POSITIVE - WHICH IS BIGGER
 */
public class Suusailm {

    //see siin määrab et tuleb leida POS numbreid
    static int positiiv(int[] massiiv) {  //meetod ees PEAB olema static kuna see siin on ju static EES

        int temp = 0;    //loendur algab. Ja algab nulliga. but we must have it here!!!!
        for (int i = 0; i < massiiv.length; i++) {
            if (massiiv[i] > 0)
                temp++;

        }
        return temp;
    }

    //see on PÕHI ja see teeb ta masssiivi loenduriks
    public static void main(String[] args) {  //meil on klass see on eskiis,
        // kui see pole static, siin ON VAJA OMA OBJEKT - siin on parem aken esimesle korrusel
        //kui on static siis lihtsalt eskiisi omadus, siis on suvaline aken A WINDOW

        int[] kraadid1 = {11, 10, 5, 1, 3, -2, -6, 2, -13, -24, -9, 0};
        int[] kraadid2 = {-23, -25, -22, -18, -15, -19, -13, 99};

        int loender1 = positiiv(kraadid1);
        int loender2 = positiiv(kraadid2);

        if (loender1 > loender2) {
            System.out.println("kraadid1soojem");
        } else {
            System.out.println("kraadid2soojem");
        }

    }
}

