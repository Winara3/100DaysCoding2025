package Dayyyy051;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner w = new Scanner (System.in);

        System.out.print("Masukkan Angka: ");
        int angka = w.nextInt();

        for (int i = 0; i < angka; i++) {
            System.out.println("Nilai i = " + i);
        }
    }
}
