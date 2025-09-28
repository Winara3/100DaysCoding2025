package Day021;

public class main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
 
       a = a + b;
       b = a - b;
       a = a - b;

       System.out.println("hasil a: " + a);
       System.out.println("hasil b: " + b);
    }
    
}
