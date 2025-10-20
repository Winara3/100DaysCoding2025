package Day043;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner w = new Scanner (System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = w.nextInt();

        if (angka % 15 == 0) {
            System.out.println("Kelipatan 3 dan 5");
        } else if (angka % 3 == 0) {
            System.out.println("Kelipatan 3");
        } else if (angka  % 5  == 0) {
            System.out.println("Kelipatan 5");
        } else {
            System.out.println("Bukan kelipatan");
        }
    }
}
