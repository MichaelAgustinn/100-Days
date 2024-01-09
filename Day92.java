import java.util.Scanner;

public class Day92 {
    public class Membaca{
        public void output(String nama, String tanggal, String alamat){
            System.out.println("Nama          : "+nama);
            System.out.println("Tanggal Lahir : "+tanggal);
            System.out.println("Alamat        : "+alamat);
        }
    }
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        
        Day92 class1 = new Day92();
        Main.Membaca class2 = class1. new Membaca();
        
        System.out.print("Masukkan Nama          : ");
        String nama = in.nextLine();
        
        System.out.print("Masukkan Tanggal Lahir : ");
        String tanggal = in.nextLine();
        
        System.out.print("Masukkan Alamat        : ");
        String alamat = in.nextLine();
        
        class2.output(nama, tanggal, alamat);
    }

}
