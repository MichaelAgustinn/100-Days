package day20;

import java.util.Scanner;

public class Day20 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan Nama Anda: ");
        String nama = in.nextLine();
        
        System.out.print("Berapa Kali Anda Ingin Mengulangi: ");
        int n = in.nextInt();
        
        for (int m = 1; m <= n; m++){
            System.out.println(m+". "+nama);
        }
    }
    
}
