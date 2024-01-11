import java.util.Scanner;
public class Day95 {
    
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        
        while(true){
            System.out.print("Masukkan Password : ");
            String sandi = in.nextLine();
            
            if(sandi.equals("Testing123")){
                System.out.println("Login Berhasil");
                break;
            }
            else{
                System.out.println("Login Gagal. Masukan Password Dengan Benar");
            }
        }
    }
}
