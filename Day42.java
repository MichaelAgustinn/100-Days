package coding.pkg100.days;

import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int batas=0;
        
        System.out.print("Masukkan jumlah index array: ");
        batas = in.nextInt();
        
        int[] nomor = new int[batas];
        
        for (int i = 0; i < batas; i++) {
            System.out.print("Masukkan index ["+i+"]: ");
            nomor[i] = in.nextInt();
        }
        
        System.out.println("isi index array");
        for (int i = 0; i < batas; i++) {
            System.out.print(nomor[i]);
            if(i!=batas-1){
                System.out.print(", ");
            }
        }
        System.out.println("");
    }
}
