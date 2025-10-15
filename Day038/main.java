package Day038;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
         Scanner w = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka= w.nextInt();

        if (angka > 0) {
            System.out.println("Angka tersebut adalah positif.");
        } else if (angka < 0) {
            System.out.println("Angka tersebut adalah negatif.");
        } else {
            System.out.println("Angka tersebut adalah nol.");
        }
    }
}
  