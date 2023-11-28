package coding.pkg100.days;

import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
        int batas=0;
        System.out.print("masukkan batas: ");
        batas = in.nextInt();
        
        if(batas==1 || batas==2){
            System.out.println("kosong");
        }
        
        for(int i=2; i<=batas; i++){
            if(i%3==0){
            System.out.print(i+" ");
        }
    }
}
