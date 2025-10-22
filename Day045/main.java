import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner w = new Scanner (System.in);

    int gapok = 0;
    double tot = 0;
    boolean nikah = false;

    System.out.print("Masukkan golongan: ");
    String gol = w.nextLine();

    switch (gol) {
        case "A":
            gapok = 5000000;
            break;
        case "B":
            gapok = 4000000;
            break;
        case "C":
            gapok = 3000000;
            break;
        default:
            gapok = 0;
            break;
    }
    System.out.println(gapok);

    System.out.print("Apakah sudah menikah (y/n): ");
    String nik = w.nextLine();

    if (nik.equals("y")) {
        nikah = true;
    } if (nikah) {
        tot = gapok + (gapok * 0.1);
    } else {
        tot = gapok;
    }

    tot = tot - (tot * 0.05);
    System.out.println(tot);

}

       
        
    }
    

