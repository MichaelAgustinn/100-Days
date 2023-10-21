package day13;

import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double bbIdeal1 = 0;
        double bbIdeal2 = 0;
        double bbIdeal = 0;
        
        System.out.print("Masukkan Namamu : ");
        String nama = in.nextLine();
        
        System.out.print("Apa Jenis Kelamin Anda (pria/wanita): ");
        String jk = in.nextLine();
        
        if (jk.equalsIgnoreCase("pria")){
        
        System.out.println("Masukkan Tinggi Badan Anda dalam satuan(cm) : ");
        double tb = in.nextDouble();
        bbIdeal1 = tb-100;
        bbIdeal2 = bbIdeal1*0.1;
        bbIdeal = bbIdeal1-bbIdeal2;
        
        System.out.println("Berat Badan Idealmu Adalah : "+bbIdeal);
        
        }else if (jk.equalsIgnoreCase("wanita")){
        System.out.println("Masukkan Tinggi Badan Anda dalam satuan(cm) : ");
        double tb = in.nextDouble();
        bbIdeal1 = tb-100;
        bbIdeal2 = bbIdeal1*0.15;
        bbIdeal = bbIdeal1-bbIdeal2;
        
        System.out.println("Berat Badan Idealmu Adalah : "+bbIdeal);
        
        }else{
        System.out.println("Jenis Kelamin Tidak Terdeteksi");
        }
        
        
    }
    
}
