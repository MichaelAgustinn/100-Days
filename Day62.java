package Main;
import java.util.Scanner;
public class Main {

    public static int tambah(int x, int y){
        int hasil = x+y;
        return hasil;
    }
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int x1=0,y2=0,total;
        
       System.out.print("Masukkan angka 1: ");
        x1 = in.nextInt();
        
        System.out.print("Masukkan angka 2: ");
        y2 = in.nextInt();
        
        total = tambah(x1,y2);
        
        System.out.println(total);
        
    }
}
