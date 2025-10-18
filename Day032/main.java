import java.util.Scanner;
public class main {
public static void main(String[] args) {
    Scanner w = new Scanner (System.in);

    System.out.print("Apakah kamu memiliki tiket?: ");
    boolean tiket = w.nextBoolean();

    System.out.print("apakah kamu memiliki kartu VVIP?: ");
    boolean viv = w.nextBoolean();

    boolean izin = tiket || viv;
    System.out.println("Kamu memenuhi salah satu syarat untuk masuk: "   + izin);
}
    
}
