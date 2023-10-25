package day17;

import java.util.Scanner;

public class Day17 {

    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        
        System.out.print("Berapa derajat seakrang: ");
        double suhuRuangan = masuk.nextDouble();
                
        String perintah = (suhuRuangan <= 15) ? "Nyalakan Pemanas Ruangan" : "Matikan Pemanas Ruangan";

        System.out.println("Sekarang kita berada di "+suhuRuangan+" derajat"); 
        System.out.println("maka "+ perintah);
        
    }
    
}
