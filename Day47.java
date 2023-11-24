package coding.pkg100.days;
import java.util.Scanner;
public class Day44 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        
        System.out.print("masukkan nilai: ");
        int nilai = in.nextInt();
        
        for(int i=1; i <= nilai; i++){
        for(int j=1; j <= i; j++){
            System.out.print(j);
        }
            System.out.println("");
        }
    }
}
