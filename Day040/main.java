package Day040;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner w = new Scanner (System.in);

  System.out.print("Masukkan angka pertama:");
  int a = w.nextInt();

  System.out.println("Pilih operasi:");
  System.out.println("1. Penjumlahan");
  System.out.println("2. Pengurangan");
  System.out.println("3. Perkalian");
  System.out.println("4. Pembagian");
  System.out.print("Masukkan pilihan (1-4):");
  int operator = w.nextInt();

  System.out.print("Masuk angka kedua: ");
  int b = w.nextInt();

   if (operator == 1) {
    System.out.println(a + b);
  } else if (operator == 2) {
    System.out.println(a - b);
  } else if (operator == 3) {
    System.out.println(a * b);
  } else if (operator == 4) {
    if (b == 0) {
      System.out.println("Error: pembagian dengan 0");
    } else {
      System.out.printf("%.2f", (float) a/b);
       
    }
    }
  }
}

