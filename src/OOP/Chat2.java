package OOP;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

public class Chat2 {
    public String toaNimi;
    public Chat2(String toaNimiUUS){toaNimi = toaNimiUUS;
    }
    public String taavi;
    String s;

    //KAS NII VÕIKS SEDA LAHENDADA NO MIKS MITTE?!
    public void adminKustutabSonumi(String s) {
        //String s="Hambbburger.i want to eat Hambbburger. ";
        //System.out.print(s);
        s=s.replaceAll("Kurat ta jälle nii raske eksami tegi..", "DELETED");
        System.out.println("---------After Replacement-----\n");
        System.out.println(s);

        /*TEINE VARIANT
String str = "Hambbburger";
str = str.replace("b", "");
         */
    }

    public void sisestaSonum(String taavi, String s) {
        System.out.println(taavi + " ütleb: ");
        System.out.println(s);
    }


    public void prindiToaNimi() {
        System.out.println(toaNimi);
    }
    public void prindiKoikSonumidKoosKasutajanimega() {
        System.out.println("AUSALT, TEHTUD, MIS KÜSITI\n");
    }

}