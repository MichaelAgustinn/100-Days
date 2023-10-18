package day10;

import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
         
        System.out.print("Masukkan Nama Anda : ");
        String nama = in.nextLine();
        
        System.out.print("Masukkan NIM Anda : ");
        String nim = in.nextLine();
        
        if(nama.equalsIgnoreCase("Michael Agustin") && nim.equalsIgnoreCase ("D0223310")){
            System.out.println("Kamu Masuk Sebagai Michael Agustin");
            System.out.println("NIM\t\t : D0223310");
            System.out.println("Prodi/Kelas\t : Informatika A");
            System.out.println("Fakultas\t : Teknik");
            System.out.println("Angkatan\t : 2023");
        
        }else{
            System.out.println("Kamu belum terdaftar");
        }
        
    }
    
}
