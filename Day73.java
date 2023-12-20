import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        while(true){
        System.out.print("masukkan angka: ");
         int angka = in.nextInt();
            
            if(angka%2==0){
                System.out.println("genap");
            }else {
                System.out.println("You And I, End!");
                break;
            }
            
        }
    }
}
