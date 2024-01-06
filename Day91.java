import java.util.Scanner;
public class Day91 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int ganjil = 0, genap = 0,angka;
        
        System.out.print("Masukkan Angka : ");
        angka = in.nextInt();
        
        for (int i=1; i<=angka; i++){
            if(i%2 ==0){
                genap+=1;
            }
            else{
                ganjil+=1;
            }
        }
        System.out.println("Total Angka Genap  : "+genap);
        System.out.println("Total Angka Ganjil : "+ganjil);
    }
}
