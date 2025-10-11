import java.util.Scanner;

public class main {   
    public static void main(String[] args) {
        
        Scanner win = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int a = win.nextInt();
        System.out.print("Masukkan angka : ");
        int b = win.nextInt();

        System.out.println("Angka pertama dan kedua nilainya sama : " + (a == b));
        System.out.println("Angka pertama dan kedua nilainya beda : " + (a != b));

    }
}
