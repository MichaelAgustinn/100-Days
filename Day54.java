package Day54;
import java.util.Scanner;
public class Main {

public static double kelilingLingkaran(double PI, double jariJari){
    return (2*PI*jariJari);
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        double hasil;
        
        System.out.print("masukkan jari-jari: ");
        double jariJari = in.nextDouble();
        
        hasil = kelilingLingkaran(3.14,jariJari);
        
        System.out.println("Hasil Keliling Lingkaran = "+hasil);
        
        }
}
