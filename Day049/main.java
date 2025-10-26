package Day049;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
         Scanner w = new Scanner (System.in);

         System.out.print("Masukkan angka: ");
         int a = w.nextInt();
         
         System.out.printf ("%s\n", (a % 2 == 0) ? "Genap" : "Ganjil");
    
    }

}
       