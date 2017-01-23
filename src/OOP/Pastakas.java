package OOP;

/**
 * TEHTUD seotud klassiga Kirjanik
 * Created by Evelin.Jogi on 3.02.2016.
 */
public class Pastakas {
    int tint;
    int kulutatudTint;
    int tintiAlles;
    
    //mis see teeb, saab käivitada nüüd konstrukorit, otseselt vaja pole, 
    //kui just ei harjuta siin mingit koodi altpoolt meetoditega
   // prindib käivitades välja "seesiinonkonstruktorPastakas" ning muud ei puutu!
    //NB! Kui aga käivitada Kirjanik seotud klass, siis jällegi jääb puutumata see psvm osa!

    public static void main(String[] args) {  
        System.out.print("seesiinonkonstruktorPastakas");
   }
    
    public Pastakas(int tindiKogus) {
        tint = tindiKogus;
        System.out.println(tint);
    }

    public void kirjuta(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isSpaceChar(c)) {
                count++;
            }
        }
        kulutatudTint = count;
        System.out.println(kulutatudTint);
    }

    public void prindiPaljuTintiAlles() {
        tintiAlles = tint - kulutatudTint;
        System.out.println(tintiAlles);
    }
}

