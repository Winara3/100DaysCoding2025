package Day011;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // String
        System.out.print("nama: ");
        String a = input.nextLine();
        // Integer
        System.out.print("umurInt: ");
        int b = input.nextInt();
        // Byte
        System.out.print("beratBadanByte: ");
        Byte c = input.nextByte();
        // Short
        System.out.print("ukuransepatuS: ");
        Short d = input.nextShort();
        // Long
        System.out.print("hargajamL: ");
        long e = input.nextLong();
        // Float
        System.out.print("tinggiF: ");
        float f = input.nextFloat();
        // Double
        System.out.print("hargatasD: ");
        double g = input.nextDouble();
        // Boolean
        System.out.print("angkatan25Bool: ");
        boolean h = input.nextBoolean();
        // Char
        System.out.print("insial: ");
        char i = input.next().charAt(0);


        // output hasil
       System.out.println("nama kamu: " + a);
       System.out.println("umur kamu: " + b);
       System.out.println("bb mu: " + c); 
       System.out.println("asal kamu: " + d);
       System.out.println("harga jam kmu: " + e);
       System.out.println("tinggimu: " + f);
       System.out.println("harga tasmu: " + g);
       System.out.println("kmu angkatan25: " + h);
       System.out.println("insial: " + i);
    

    }
    
}
