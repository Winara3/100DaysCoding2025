import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner w = new Scanner (System.in);

        System.out.print("Masukkan gaji kotor: ");
        int gaji = w.nextInt();

        System.out.print("Masukkan persen potongan: ");
        float persen = w.nextFloat();

        System.out.printf("Gaji bersih= Rp%.2f\n", gaji-(gaji * persen)/100);
    }
    
}
