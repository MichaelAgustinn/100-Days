package day100coding;

import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        //tipe data area
        String kartuMember, diskon;
        
        int pilihan, tipe;
        
        double harga=0, diskon1, discount=0;
        
        double iPhone7, iPhone13Pro, iPhone12Pro;
        iPhone7 = 3000000; 
        iPhone13Pro = 9000000; 
        iPhone12Pro = 6000000;
        
        double pocoF5, pocoX5, pocoM5;
        pocoF5 = 5000000; 
        pocoX5 = 3000000;
        pocoM5 = 2000000;
        
        double realmeC21, realmeC30, realmeNarzo;
        realmeC21 = 2000000;
        realmeC30 = 6000000;
        realmeNarzo = 4000000;
        //tipe data area end
        
        System.out.println("==================");
        System.out.println("==== PILIHAN  ====");
        System.out.println("==================");
        System.out.println("==== 1.iPhone ====");
        System.out.println("==== 2.Xiaomi ====");
        System.out.println("==== 3.RealMe ====");
        System.out.println("==================");
        
        System.out.print("Masukkan Pilihan: ");
        pilihan = in.nextInt();
        
        if(pilihan==1){
            System.out.println("=========================");
            System.out.println("==== PILIH TIPE      ====");
            System.out.println("=========================");
            System.out.println("==== 1.iPhone 7      ====");
            System.out.println("==== 2.iPhone 12 Pro ====");
            System.out.println("==== 3.iPhone 13 Pro ====");
            System.out.println("=========================");
            
            System.out.print("Masukkan tipe hp: ");
            tipe = in.nextInt();
            
            if(tipe==1){
                harga=iPhone7;
            }else if (tipe==2){
                harga=iPhone12Pro;
            }else if (tipe==3){
                harga=iPhone13Pro;
            }else {
                System.out.println("Tolong Masukkan Tipe Yang Tersedia");
            }
                
            
        }else if (pilihan==2){
            System.out.println("==========================");
            System.out.println("====    PILIH TIPE    ====");
            System.out.println("==========================");
            System.out.println("==== 1.Xiaomi Poco F5 ====");
            System.out.println("==== 2.Xiaomi Poco X5 ====");
            System.out.println("==== 3.Xiaomi Poco M5 ====");
            System.out.println("==========================");
            
            System.out.print("Masukkan tipe hp: ");
            tipe = in.nextInt();
            
            if(tipe==1){
                harga=pocoF5;
            }else if (tipe==2){
                harga=pocoX5;
            }else if (tipe==3){
                harga=pocoM5;
            }else {
                System.out.println("Tolong Masukkan Tipe Yang Tersedia");
            }
        }else if (pilihan==3){
            System.out.println("======================");
            System.out.println("====  PILIH TIPE  ====");
            System.out.println("======================");
            System.out.println("==== 1.Realme C30 ====");
            System.out.println("==== 2.Realme C21 ====");
            System.out.println("=== 3.Realme Narzo ===");
            System.out.println("======================");
            
            System.out.print("Masukkan tipe hp: ");
            tipe = in.nextInt();
            
            if(tipe==1){
                harga=realmeC30;
            }else if (tipe==2){
                harga=realmeC21;
            }else if (tipe==3){
                harga=realmeNarzo;
            }else {
                System.out.println("Tolong Masukkan Tipe Yang Tersedia");
            }
        }else {
            System.out.println("Tolong Masukkan Pilihan Yang Tersedia");
        }
        
        System.out.println("Punya Kartu Member?(yes/no)");
        in.nextLine();
        kartuMember = in.nextLine();
                            
        if(kartuMember.equalsIgnoreCase("yes")){
            diskon1 = harga*(0.05+discount);
            harga -= diskon1;
            System.out.println("mendapat diskon member 5%\n");
            
            System.out.println("Masukkan kode diskon");
            diskon = in.nextLine();
        
            if (diskon.equalsIgnoreCase("diskonnatal")){
                discount = 0.05;
                System.out.println("mendapat diskon tambahan 5%\n");
            }else {
                System.out.println("kode diskon salah\n");
            }
        }else if (kartuMember.equalsIgnoreCase("No")){
            harga=harga; 
        }else{
            System.out.println("Tolong Masukkan yes/no");
        }  
        
        System.out.println("HARGA");
        System.out.println(harga);
    }
}
