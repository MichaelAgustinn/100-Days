package Main;
import java.util.Scanner;
public class Main {

    public static double tambah(double x, double y){
        double hasil = x+y;
        return hasil;
    }
    
    public static double kali(double x, double y){
        double hasil = x*y;
        return hasil;
    }
    
    public static double kurang(double x, double y){
        double hasil = x-y;
        return hasil;
    }
    
    public static double bagi(double x, double y){
        double hasil = x/y;
        return hasil;
    }
    
    public static double hasilBagi(double x, double y){
        double hasil = x%y;
        return hasil;
    }
    
    
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        double x1=0,y2=0,total;
        char operator;
        
       System.out.print("Masukkan angka 1: ");
        x1 = in.nextDouble();
        
        System.out.print("Masukkan angka 2: ");
        y2 = in.nextDouble();
        
        System.out.print("Masukkan Operator: ");
        operator = in.next().charAt(0);
        
        if(operator=='+'){
            total = tambah(x1,y2);
            System.out.println(total);
        }else if(operator=='-'){
            total = kurang(x1,y2);
        System.out.println(total);
        }else if(operator=='*'){
            total = kali(x1,y2);
        System.out.println(total);
        }else if(operator=='/'){
            total = bagi(x1,y2);
        System.out.println(total);
        }else if(operator=='%'){
           total = hasilBagi(x1,y2);
        System.out.println(total);
        }else{
            System.out.println("Operator tidak dikenali");
        }
        
        
    }
}
