package day8;

import java.util.Scanner;

public class Day8 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double gajiLembur = 55000 ;
        
        System.out.print("Masukkan Gaji Pokok Anda : ");
        double gajiPokok = input.nextDouble();
        
        System.out.print("Berapa Jam Anda Lembur : ");
        double jamLembur = input.nextDouble();
        
        System.out.print("Gaji Bersih Anda Adalah ");
        System.out.println(gajiLembur*jamLembur+gajiPokok);
        
    }
    
}
