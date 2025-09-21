package Day014;

public class Main {
    public static void main(String[] args) {
        
        // String -> Integer
        String a = "10";
        int angka1 = Integer.parseInt(a);
        System.out.println(angka1 + 2);
        
        //String -> double
        String b = "2.34";
        double angka2 = Double.parseDouble(b);
        System.out.println(angka2);
        
        //String -> Boolean
        String c = "true";
        String d = "false";
        boolean kondisi1 = Boolean.parseBoolean(c);
        boolean kondisi2 = Boolean.parseBoolean(d);
        System.out.println(kondisi1);
        System.out.println(kondisi2);
        
        // String -> float
        String e = "3.14f";
        float angka3 = Float.parseFloat(e);
        System.out.println(angka3);
        
        //String -> Long
        String f = "12345678999999";
        long angka4 = Long.parseLong(f);
        System.out.println(angka4);
        
        //String -> short
        String g = "32000";
        short angka5 = Short.parseShort(g);
        System.out.println(angka5);
        
        //String -> Byte
        String h = "127";
        byte angka6 = Byte.parseByte(h);
        System.out.println(angka6);
        
        //String -> char
        String i = "Halo";
        char huruf = i.charAt(2);
        System.out.println(huruf);
                
   }
}
