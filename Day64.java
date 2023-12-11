package Main;
import java.util.Scanner;
public class Main {

    public static double kali(double x, double y){
        double hasil = x*y;
        return hasil;
    }
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        double x1=0,y2=0,total;
        
       System.out.print("Masukkan angka 1: ");
        x1 = in.nextDouble();
        
        System.out.print("Masukkan angka 2: ");
        y2 = in.nextDouble();
        
        total = kali(x1,y2);
        
        System.out.println(total);
        
    }
}
