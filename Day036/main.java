import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner w = new Scanner (System.in);

        System.out.print("Masukkan harga tas: ");
        int harga = w.nextInt();

        if (harga >= 200000) {
            System.out.println("Tas ini termasuk mahal!");
        if (harga >= 500000) {
            System.out.println("tas ini tergolong mewah dan mahal!");
         } else {
            System.out.println("Masih standar, tapi tetap bagus!");
            }
        } else {
            System.out.println("Tas ini termasuk murah dan lumayan terjangkau!");
        }


    }
    
}
