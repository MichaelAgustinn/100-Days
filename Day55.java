package Day55;
import java.util.Scanner;
public class main{

public static double luasLingkaran(double PI, double jariJari){
    return (PI*jariJari*jariJari);
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        double hasil;
        
        System.out.print("masukkan jari-jari: ");
        double jariJari = in.nextDouble();
        
        hasil = luasLingkaran(3.14,jariJari);
        
        System.out.println("Hasil Luas Lingkaran = "+hasil);
        
        }
}
