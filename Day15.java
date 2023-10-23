package day15;

import java.util.Scanner;

public class Day15 {

    public static void main(String[] args) {
        Scanner i = new Scanner (System.in);
        double potonganGaji = 0;
        double gajiBersih = 0;
        
        System.out.print("Masukkan Gaji Anda : ");
        double gaji = i.nextDouble();
        
        if (gaji >= 5000000 && gaji < 8000000){
        potonganGaji = gaji * 0.05;
        gajiBersih = gaji - potonganGaji;
            System.out.println("Gaji Bersih Anda Adalah : "+gajiBersih);
            System.out.println("Karna terkena pajak sebesar 5%");
        }else if (gaji >= 8000000){
        potonganGaji = gaji * 0.1;
        gajiBersih = gaji - potonganGaji;
            System.out.println("Gaji Bersih Anda Adalah : "+gajiBersih);
            System.out.println("Karna terkena pajak sebesar 10%");
        }else {
            System.out.println("Gaji Bersih Anda Adalah : "+gaji);
            System.out.println("Karena tidak terkena pajak");
        }
        
    }
    
}
