package Day052;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner w = new Scanner (System.in); 

        System.out.print("Masukan angka: ");
        int a = w.nextInt();

        while (a < 15) {
            System.out.println("benar");
            a++;
        }
    }
    
}
