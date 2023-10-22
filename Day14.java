package day14;

import java.util.Scanner;

public class Day14 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);   
    
        double hasil = 0;
        
        System.out.print("Masukkan Angka : ");
        double angka1 = input.nextDouble();
        
        System.out.print("Operator : ");
        char operator = input.next().charAt(0);

        System.out.print("Angka ke 2 : ");
        double angka2 = input.nextDouble();
        
        if (operator == '+'){
            hasil = angka1 + angka2;
            System.out.println("Hasilnya Adalah : "+hasil);
        }
        else if (operator == '-'){
            hasil = angka1 - angka2;
            System.out.println("Hasilnya Adalah : "+hasil);
        }
        else if (operator == '*'){
            hasil = angka1 * angka2;
            System.out.println("Hasilnya Adalah : "+hasil);
        }
        else if (operator == '/'){
            hasil = angka1 / angka2;
            System.out.println("Hasilnya Adalah : "+hasil);
        }
        else if(operator == '%'){
            hasil = angka1 % angka2;
            System.out.println("Hasilnya Adalah : "+hasil);
        }
        else {
            System.out.println("Sistem tidak mengetahui operator yang anda gunakan");
        }
        
        
    }
    
}
