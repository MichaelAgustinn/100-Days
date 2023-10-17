package day9;

import java.util.Scanner;

public class Day9 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
//        jika memasukkan nama asli = salah :"
        System.out.print("Masukkan Nama : ");
        String nama = in.nextLine();
        
        if(nama.equalsIgnoreCase("Michael Agustin")){
            System.out.println("Salah");
        }else {
            System.out.println("Benar");
        }
    }
    
}
