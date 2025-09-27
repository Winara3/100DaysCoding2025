    import java.util.Scanner;
    public class main {
    public static void main(String[] args) {
                Scanner inp = new Scanner(System.in);
        
        System.out.print("BIODATA \n");
        System.out.print("Masukkan Nama : ");
        String nama = inp.nextLine();
        System.out.print("Tanggal Lahir : ");
        int ttl = inp.nextInt();
        System.out.print("semester : ");
        byte Semester = inp.nextByte();
        System.out.print("umur : ");
        short umur = inp.nextShort();
        System.out.print("jumlah saudara : ");
        long jumlahSaudara = inp.nextLong();
        System.out.print("tinggi badan : ");
        float tb = inp.nextFloat();
        System.out.print("beratbadan :");
        double bb = inp.nextDouble();
        System.out.print("golongan darah : ");
        char GolonganDarah = inp.next().charAt(0);
        System.out.print("status mahasiswa: ");
        Boolean Status = inp.nextBoolean();       
        
        
        System.out.println("BIODATA\n");
        System.out.println("Nama : "+nama);
        System.out.println("Tanggal Lahir :"+ttl);
        System.out.println("Semester : "+ Semester);
        System.out.println("umur : "+umur);
        System.out.println("jumlah saudara : "+jumlahSaudara);
        System.out.println("Tinggi badan : "+tb);
        System.out.println("Berat badan : "+bb);
        System.out.println("Golongan darah : "+GolonganDarah);
        System.out.println("Status Mahasiswa: " + Status);
        

        
    }

    }
    

