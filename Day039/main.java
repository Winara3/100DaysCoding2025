package Day039;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner w = new Scanner (System.in);
       
        System.out.print("Masukkan pilihan: ");
        int pilihan = w.nextInt();
        
        System.out.println("==Menu Makanan==");
        System.out.println("1. Sushi");
        System.out.println("2. Sashimi");
        System.out.println("3. Takoyaki"); 
        System.out.println("=====");
        
        if (pilihan == 1){
            System.out.println("anda memilih Sushi");
        }else if(pilihan == 2){
            System.out.println("anda memilih Sashimi");
        }else if(pilihan == 3){
            System.out.println("anda memilih Takoyaki");
        }else{
            System.out.println("pilihan tidak tersedia");
        }
    }
}
