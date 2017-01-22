package Maatriks;
import java.util.Arrays;
/**
 * Loo 9*9 suurune maatriks, millele tekib loode suunaline nurkade muster, nagu näites.
 * 1 1 1 1 1 1 1 1 1
 * 1 2 2 2 2 2 2 2 2
 * 1 2 3 3 3 3 3 3 3
 * 1 2 3 4 4 4 4 4 4
 * 1 2 3 4 5 5 5 5 5
 * 1 2 3 4 5 6 6 6 6
 * 1 2 3 4 5 6 7 7 7
 * 1 2 3 4 5 6 7 8 8
 * 1 2 3 4 5 6 7 8 9
 * Tundub raske? Leia seoseid rea ja veeru indeksi numbritega.
 public class LoodeNurk {
 // Lihtsalt abiline meetod, et maatriksit välja printida
 private static void printMaatriks(int[][] laud) {
 for (int i = 0; i < laud.length; i++) {
 System.out.println(Arrays.toString(laud[i]));
 }
 System.out.println("");
 }}  ORIGINAL
 for (int i = 0; i < 9; i++) {
 for (int j = 0; j < 9; j++) {
 if (i+j<9 && i-j>=0) {
 maatriks[i][j] = "0";
 } else if (i+j>=8 && i-j<=0) {
 maatriks[i][j] = "0";
 } else {
 maatriks[i][j] = " ";
 }
 }
 System.out.println(Arrays.toString(maatriks[i]));
 }
 */
public class LoodenurkKoikRidaSama {
    // Lihtsalt abiline meetod, et maatriksit välja printida
    public static void main(String[] args) {   //PEAB YHT MAIN MEETODIT JU SISALDAMA!!!
        int [][] maatriks = new int[10][10];    //masiiv mis hoiab numbreid, genereeri NR 1, x = 9, y = 9
        int value;
        for (int rida = 0; rida < maatriks.length; rida++) {  //reanumber rida
            value = 1;
            //it always groups by ++
            //        and then no changes
            for (int veerg = 0; veerg < maatriks[rida].length; veerg++) { //algab nulliga, lõppeb maatriks-rida-pikkusega

                maatriks[rida][veerg] = value;
                value++;
            }
        }
        printMaatriks(maatriks);   //ava see NR 2
    }


    private static void printMaatriks(int[][] laud) {    //prindi tee see NR 3
        for (int i = 0; i < laud.length; i++) {        //see lihtsalt prindib ridu
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("mis juhtus");
    }
}