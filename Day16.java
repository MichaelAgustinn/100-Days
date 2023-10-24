package day16;

import java.util.Scanner;

public class Day16 {

    public static void main(String[] args) {
	Scanner i = new Scanner (System.in);  
        
        System.out.print("Masukkan nilai UTS: ");
        int nilaiUts = i.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        int nilaiUas = i.nextInt();
        int nilaiUjian;
        nilaiUjian = nilaiUts+nilaiUas;
        nilaiUjian /= 2;
                
        String hasil = (nilaiUts+nilaiUas >= 60) ? "Lulus" : "Tidak Lulus";

        System.out.println("Nilai ujian: " + nilaiUjian);
        System.out.println("Status kelulusan: " + hasil);
    }
    
}
