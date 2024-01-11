import java.util.Scanner;
public class Main{
    
    public class hitung{
        public double gaji (double gajiPokok, double lembur){
            double bonus = lembur * 55000;
            return gajiPokok + bonus;
        }
    }
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        
        Main class1 = new Main();
        Main.hitung class2 = class1. new hitung();
        
        System.out.print("Masukkan Gaji Pokok   : ");
        double gajiPokok = in.nextDouble();

        System.out.print("Masukkan Lama Lembur  : ");
        double lembur = in.nextDouble();

        double gajiBersih = class2.gaji(gajiPokok, lembur);
        
        System.out.println("Hasil                 : "+gajiBersih);
    }

}
