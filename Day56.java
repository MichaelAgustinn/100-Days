package Main;

import java.util.Scanner;

public class Main {

    public static double volumeBola(double PI, double jariJari){
    return (4*PI*(jariJari*jariJari*jariJari)/3);
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        double hasil;
        
        System.out.print("masukkan jari-jari: ");
        double jariJari = in.nextDouble();
        
        hasil = volumeBola(3.14,jariJari);
        
        System.out.println("Hasil Volume Bola = "+hasil);
        
        }
}
