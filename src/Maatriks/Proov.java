package Maatriks;
import java.util.Arrays;
public class Proov {
    public static void main(String[] args) {
        int [][] numbrilaud = new int[9][9];
        int value;
        for (int rida = 0; rida < numbrilaud.length; rida++) {
            value = 1;
            for (int veerg = 0; veerg < numbrilaud[rida].length; veerg++) {

                numbrilaud[rida][veerg] = value;
                if(value<=rida)      //typical solution for it
                    value++;
            }
        }
        printMaatriks(numbrilaud);
    }
    private static void printMaatriks(int[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("mis juhtus");
    }
}