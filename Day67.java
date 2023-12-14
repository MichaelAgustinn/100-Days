import java.util.Scanner;
public class Main {
    public static String nama(String nama1, String nama2){
        String namaLengkap = nama1+' '+nama2;
        System.out.println("Nama Lengkap");
        System.out.println(namaLengkap);
      return namaLengkap;  
    }
    
    public static int umur(int usia){
        int age = usia;
        System.out.println("Usia");
        System.out.println(age);
      return age;
    }
    
    public static String alamat(String alamat){
        String alamatIn = alamat;
        System.out.println("Alamat");
        System.out.println(alamatIn);
      return alamatIn;  
    }
    
    public static void main(String[] args){
        String namaDepan, namaBelakang, address;
        int umur1=0;
        Scanner in = new Scanner (System.in);
       System.out.print("Masukkan Nama Depan: ");
        namaDepan = in.nextLine();
        System.out.print("Masukkan Nama Belakang: ");
        namaBelakang = in.nextLine();
        System.out.print("Masukkan Umur: ");
        umur1 = in.nextInt();
        System.out.print("Masukkan Alamat: ");
        in.nextLine();
        address = in.nextLine();
        System.out.println("");
        
        nama(namaDepan, namaBelakang);
        System.out.println("");
        umur(umur1);
        System.out.println("");
        alamat(address);
        
    }
}
