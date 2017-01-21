package OOP;

/**
 * Loo klass Zelda, mis käitub nii nagu käesolev programm ootab.
 *
 * Reeglid:
 * 1. Legend klassi muuta ei tohi.
 * 2. Zelda kaotab nii palju elusid kui kollil elusid on.
 *
 * package OOP;

 /**
 * TEHTUD!
 * Created by kullirist on 19/01/2017.
 * Zelda on seotud Legend main klassiga

public class Zelda {

    private int elusid;
    public Zelda(int elusid) {
        this.elusid = elusid;
    }
    public void kaklusKolliga(int kollilelusid){
        this.elusid = this.elusid - kollilelusid;
    }
    public void prindiMituEluAlles(){
        System.out.println(this.elusid);
    }

    public void prindiKasOnElus(){
        if(this.elusid > 0){
            System.out.println("Elus");
        }
        else{
            System.out.println("Surnud");
        }
    }
}



 */
public class Legend {
    public static void main(String[] args) {
        int kollilElusid;

        int elusid = 35;
        Zelda zelda = new Zelda(elusid);

        kollilElusid = 25;
        zelda.kaklusKolliga(kollilElusid);

        zelda.prindiMituEluAlles();

        kollilElusid = 57;
        zelda.kaklusKolliga(kollilElusid);

        zelda.prindiKasOnElus();

    }
}
