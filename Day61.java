package Main;
import java.util.Scanner;
public class Main {
    public static void pertukaran(float x, float y){
        float z = x;
        x = y;
        y = z;
        
        System.out.println("Tukar Nilai");
        System.out.println("angka 1 = "+x);
        System.out.println("angka 2 = "+y);
    }
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        float x1,y2;
        
       System.out.print("Masukkan angka 1: ");
        x1 = in.nextFloat();
        
        System.out.print("Masukkan angka 2: ");
        y2 = in.nextFloat();
        
        System.out.println("Keadaan Awal");
        System.out.println("angka 1 = "+x1);
        System.out.println("angka 2 = "+y2);
        
        pertukaran(x1,y2);
        
        
    }
}
