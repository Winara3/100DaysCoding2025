import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner w = new Scanner (System.in);
         System.out.print("Masukkan bilangan pertama\t: ");
         int b = w.nextInt();
         System.out.print("Masukkan bilangan kedua \t: ");
         int c = w.nextInt();
         System.out.println("Bilangan pertama tidak lebih kecil\t: " + (b>=c));
         System.out.println("Bilangan kedua tidak lebih kecil\t: " + (b<=c));
    }
    
}
  