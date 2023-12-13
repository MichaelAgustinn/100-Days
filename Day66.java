import java.util.Scanner;
public class Main {
    public static String nama(String nama1, String nama2){
        String namaLengkap = nama1+' '+nama2;
        System.out.println("Nama Lengkap");
        System.out.println(namaLengkap);
      return namaLengkap;  
    }
    public static void main(String[] args){
        String namaDepan, namaBelakang;
        Scanner in = new Scanner (System.in);
       System.out.print("Masukkan Nama Depan: ");
        namaDepan = in.nextLine();
        System.out.print("Masukkan Nama Belakang: ");
        namaBelakang = in.nextLine();
        
        nama(namaDepan, namaBelakang);
        
    }
}
