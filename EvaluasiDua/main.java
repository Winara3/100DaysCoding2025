import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner w = new Scanner (System.in);

        //soal no.1
        System.out.print("Masukkan nilai tugas: ");
        String tugas = w.nextLine();
        System.out.print("Masukkan nilai UTS: ");
        String UTS = w.nextLine();
        System.out.print("Masukkan nilai UAS: ");
        String UAS = w.nextLine();

        //konversi nilai dari String ke Int
        int a = Integer.parseInt (tugas);
        int b = Integer.parseInt(UTS);
        int c = Integer.parseInt(UAS);

       //Menghitung nilai akhir
       double tgs = a * 0.3;
       double uts = b * 0.3;
       double uas = c * 0.4;
       double total = tgs + uts + uas;

       //Menampilkan huruf mutu: 
       if (total >= 85) {
        System.out.println("A");
       } else if (total >= 70  && total <= 84) {
        System.out.println("B");
       } else if (total >= 55  && total <= 69) {
        System.out.println("C");
       } else if (total < 55) {
        System.out.println("D");
      } 



     //soal no.3
        System.out.print("Masukkan daya listrik: ");
        int daya = w.nextInt();

        if (daya == 900  ) {
            System.out.println("Tarif Rp.1352 per kHW");
        } else if (daya == 13000 ) {
            System.out.println("Tarif Rp.1.444 per kHW");
        } else if (daya == 2200 ) {
            System.out.println("Tarif Rp. 1.444 per kHW");
        } else {
            System.out.println("Golongan tidak tedaftar");
        }
    }
}
