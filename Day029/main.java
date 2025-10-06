import java.util.Scanner;
public class main {
    public static void main(String[] args) {
         Scanner a = new Scanner (System.in);
         System.out.print("Masukkan bilangan pertama\t: ");
         int b = a.nextInt();
         System.out.print("Masukkan bilangan kedua \t: ");
         int c = a.nextInt();

         System.out.println("Bilangan pertama lebih besar\t: " + (b>c));
         System.out.println("Bilangan kedua lebih besar\t: " + (b<c));


    }
   
}
