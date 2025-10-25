package Day048;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner w = new Scanner (System.in);

        System.out.println("=====Operator=====");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /  ");

        System.out.print("Masukkan operator: ");
        String op = w.nextLine();

        System.out.print("Masukkan angka pertama: ");
        int a = w.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = w.nextInt();

        switch (op) {
            case "+":
            System.out.println(a+b);
            break;

            case "-":
            System.out.println(a-b);
            break;

            case "*":
            System.out.println(a*b);
            break;

            case "/":
            if (b == 0) {
                System.out.println("eror pembagian 0");
                break;
            } else {
                System.out.println((float) a/b);
                break;
            }

            default:
            System.out.println("Salahhh");
            break;
        }

    }
}
