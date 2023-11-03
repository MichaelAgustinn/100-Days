package day26;

import java.util.Scanner;

public class Day26 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukkan nilai a : ");
        int a = in.nextInt();
        System.out.print("Masukkan nilai b : ");
        int b = in.nextInt();
        
        if(b>a){
            for (int nilai=a; a<=b; a++){
                System.out.print(a+" ");
            }
        }else{
        for(int nilai=b; b<=a; b++){
            System.out.print(b+" ");
        }    
        }
        System.out.println("");
    }
    
}
