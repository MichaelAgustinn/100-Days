package day28;

import java.util.Scanner;

public class Day28 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int angka; 
        
        do {
            System.out.print("ketik angka apapun (0 untuk keluar): ");
            angka = in.nextInt();

            System.out.println("Anda memasukkan: " + angka);
        } while (angka != 0);
        System.out.println("Anda Telah Keluar");
    }
    
}
