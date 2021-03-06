package OOP;

import java.util.ArrayList;
import java.util.HashMap;

/** TEHTUD. Seotud klassiga Gitter
 * Created by Pille Ulmas, marko757@gmail.com, kristitammet@gmail.com, filip.fjodorov@tptlive.ee on 20.01.2017.

 ***ALL RED CAN BE CALLED OUT:
 public class Chat {
 public Chat(String toaNimi) {}
 public void sisestaSonum(String taavi, String s) {}
 public void prindiKoikSonumidKoosKasutajanimega() {}
 public void adminKustutabSonumi(String s) {}
 public void prindiToaNimi() {}
 }
 */

public class Chat {
    //HashMap sonumid = new HashMap();
    ArrayList<String> nimed = new ArrayList<>();
    ArrayList<String> sonumid = new ArrayList<>();
    int loendur;
    String toaNimi;
    public Chat(String toaNimi){
        this.toaNimi = toaNimi;
    }
    public void sisestaSonum(String nimi, String sonum){
        //sonumid.put(nimi, sonum);
        nimed.add(nimed.size(),nimi);
        sonumid.add(sonumid.size(),sonum);

    }
    public void prindiKoikSonumidKoosKasutajanimega(){
        //System.out.println(sonumid);
        for (int i = 0; i < nimed.size(); i++) {
            System.out.println(nimed.get(i)+": "+sonumid.get(i));
        }
        System.out.println("");
    }
    public void adminKustutabSonumi(String sonum){
        /*for (int i = 0; i <sonumid.size() ; i++) {
            if (sonumid.containsValue(sonum)){
                //sonumid.replace(sonumid.,sonum,"Kustutatud, ebakorrektne keelekasutus!");
            }
        }
        */
        for (int i = 0; i <sonumid.size() ; i++) {
            if (sonum == sonumid.get(i)){
                sonumid.set(i, "Kustutatud Admini poolt!");
            }
        }
    }
    public void prindiToaNimi(){
        System.out.println(toaNimi);
    }
}