package coding.pkg100.days;

import java.util.Scanner;

public class Day52 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int batas=0;
        System.out.print("masukkan batas: ");
        batas = in.nextInt();
        
        if(batas%2==1){
            for (int i = 1; i <= batas; i++) {
                if(i%2==0){
                    System.out.print(i+" ");
                }
            }
        }else {
            System.out.println(batas);
        }
    }
}
