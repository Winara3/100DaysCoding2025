package Day053;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner w = new Scanner (System.in);

        System.out.print("Masukkan angka: ");
        int angka = w.nextInt();

        for (int i = 0; i < angka; i++) {
            if (angka <= 10) {
                break;
            }
            System.out.println("Nilai i = " + i);
        }
    }
}
