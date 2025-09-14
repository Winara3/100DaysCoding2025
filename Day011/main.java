package Day011;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Membuat objek Scanner
        Scanner input = new Scanner(System.in);

        // Input String
        System.out.print("nama: ");
        String nama = input.nextLine();

        // Input integer
        System.out.print("umur: ");
        int umur = input.nextInt();

        // Input double
        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggi = input.nextDouble();

        // Output hasil
        System.out.println("\n=== Data Diri ===");
        System.out.println("nama aku : " + nama + "cantik");
        System.out.println("Umur aku masih : " + umur + " tahun");
        System.out.println("Tinggi aku juga : " + tinggi + " cm");
        
    }
    
}
