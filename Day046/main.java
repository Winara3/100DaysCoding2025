package Day046;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner w = new Scanner (System.in);

        System.out.println("===== Menu =====");
        System.out.println("1. Sushi");
        System.out.println("2. Takoyaki");
        System.out.println("3. Ramen");
        System.out.print("Masukkan pilihan menu: ");
        int menu = w.nextInt();

        switch (menu) {
            case (1):
            System.out.println("Sushi");
            break;

            case (2):
            System.out.println("Takoyaki");
            break;

            case (3):
            System.out.println("Ramen");
            break;

            default:
            System.out.println("tidak valid");
        }
    }
}
