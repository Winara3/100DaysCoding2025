package Evaluasi2;
 import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner w = new Scanner (System.in);

        //soal no.2
        System.out.println("====Menu Makanan====");
        System.out.println("1. Nasi goreng - Rp15.000");
        System.out.println("2. Mie goreng - Rp12.000");
        System.out.println("3. Ayam Bakar - Rp18.000");

        System.out.print("Masukkan pilihan menu: ");
        int pilihan = w.nextInt();
        System.out.print("Masukkan jumlah porsi: ");
        int porsi = w.nextInt();

        String menu = "   ";
        double harga = 0;

        if  (pilihan == 1) {
        menu = "Nasi goreng - Rp.15.000"; 
        harga = 15000;
        } else if (pilihan == 2) {
            menu = "Mie goreng - Rp12.000";
            harga = 12000;
        } else if (pilihan == 3) {
            menu = "Ayam bakar - Rp18.000";
            harga = 18000;
        }

        double total = harga * porsi;

        if (porsi > 2 && total > 50000) {
            total = total - (total * 0.10);
        } else if (total > 50000 || porsi> 2) {
            total = total - (total * 0.05);
        }

        System.out.println("menu " + menu);
        System.out.println("jumlah " + porsi);
        System.out.println("Total harga = " + total);

    }
}
