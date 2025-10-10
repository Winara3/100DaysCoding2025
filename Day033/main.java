import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner w = new Scanner (System.in);

        System.out.print("Apakah kamu suka membaca buku ?: ");
        boolean mtk = w.nextBoolean();

        System.out.println("Kamu suka? " + mtk);
        System.out.println("Kamu gak suka? " + !mtk);
    }
    
}
