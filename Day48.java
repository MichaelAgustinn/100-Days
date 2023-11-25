package coding.pkg100.days;

import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai : ");
        int batas = in.nextInt();
        
        for(int i=1; i <= batas; i++){
        for(int j=1; j <= i; j++){
            System.out.print(i);
        }
            System.out.println("");
        }
    }
}
