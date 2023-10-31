package day23;

import java.util.Scanner;

public class Day23 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double hasil = 0;
        
        System.out.print("Masukkan Angka Pertama: ");
        double angka1 = in.nextDouble();
        
        System.out.print("Masukkan Salah Satu Operator (+) (-) (*) (/) : ");
        char operator = in.next().charAt(0);
        
        System.out.print("Masukkan Angka Kedua: ");
        double angka2 = in.nextDouble();
        
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("angka yang di bagi dengan nol tidak terdefinisi.");
                }
                break;
            default:
                System.out.println("Operator yang anda masukkan tidak valid.");
                break;
        }
        System.out.println("Hasil : "+hasil);
    }
    
}
