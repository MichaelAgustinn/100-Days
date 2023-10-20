package day12;

import java.util.Scanner;

public class Day12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan Nilai Mahasiswa : ");
        float nilai = sc.nextFloat();
        
        if(nilai <= 50){
            System.out.println("Nilai Kamu ERROR");
        }else if (nilai > 50 && nilai <= 60){
            System.out.println("Nilai Kamu D");
        }else if (nilai > 60 && nilai <= 70){
            System.out.println("Nilai Kamu C");
        }else if (nilai > 70 && nilai <= 80){
            System.out.println("Nilai Kamu B");
        }else {
            System.out.println("Nilai Kamu A");
        }
        
        }
    
}
