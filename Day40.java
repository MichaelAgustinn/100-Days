package coding.pkg100.days;

import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner ner = new Scanner (System.in);
        int[] nomor = new int[3];
        
        for(int i=0; i < 3; i++){
            System.out.print("masukkan nilai dari indeks array: ");
            nomor[i] = ner.nextInt();
        }
        System.out.println("isi indeks array");
        for (int i = 0; i < 3; i++) {
            System.out.println(nomor[i]+" ");
        }
    }
}
