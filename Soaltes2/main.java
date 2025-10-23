package Soaltes2;
import java.util.Scanner;
public class main {
    public static void main(String[] args) { 
    Scanner w = new Scanner (System.in);

    System.out.printf("Menu Utama:\n1. Hitung Predikat Nilai\n2. Tentukan Ganjil atau Genap\n3. Tentukan Positif, Negatif, atau Nol\n Pilih menu utama: \n");
    int pil = w.nextInt();

    if (pil == 1) {
        System.out.print("Masukkan nilai (0-100): ");
        int n = w.nextInt();
        n = n/10;

        switch (n) {
            case 0,1,2,3 -> {System.out.println("E");}
            case 4 -> {System.out.println("D");}
            case 5,6 -> {System.out.println("C");}
            case 7 -> {System.out.println("B");}
            case 8,9,10 -> {System.out.println("A");}
            default -> {System.out.println("Salah input");}
        }
    } else if (pil == 2) {
        System.out.print("Masukkan angka sembarang: ");
        int n = w.nextInt();
        System.out.printf("%s\n", (n%2==0?"Angkanya ganjil":"Angkanya genap"));
    } else if (pil == 3) {
        System.out.print("Masukkan angka sembarang: ");
        int n = w.nextInt();
        System.out.printf("%s", (n>0)?"Angkanya positif":(n<0)?"Angkanya negatif":"Angkanya nol");
    } else {
        System.out.println("Ganbatte, pilihanmu tidak ada dalam menu");
    }
}

}
