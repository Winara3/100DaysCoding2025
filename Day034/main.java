package Day034;
import java.util.Scanner;   
public class main {
    public static void main(String[] args) {
        Scanner w = new Scanner (System.in);

        System.out.print("Masukkan usia anda: ");
        int usia = w.nextInt();

        if  (usia >= 18 && usia <= 30){
            System.out.println("Anda sudah dewasa dan masih muda");
        } else {
            System.out.println("Anda bukan dewasa muda");

        }
    }
}   
    
