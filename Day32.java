package coding.pkg100.days;

import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka awal: ");
        int a = in.nextInt();

        System.out.print("Masukkan angka akhir: ");
        int b = in.nextInt();

        int hasil = 0;

        for (int angka = a; angka <= b; angka++) {
            System.out.print(angka);
            if(angka!=b){
            System.out.print('+');
            }else
            System.out.print('=');
            hasil = hasil+angka;
        }
        System.out.println(hasil);
    }
}
