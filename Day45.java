package coding.pkg100.days;
import java.util.Scanner;
public class Day44 {
    public static void main(String[] args) {
      Scanner i = new Scanner(System.in);
        
        double potongan2,potongan1, gajiBersih = 0, gaji, gajiPotong;
        String pekerjaan;
        
        potongan1 = 0.05;
        potongan2 = 0.1;
        
        System.out.print("Apakah Pekerjaanmu PNS (Yes/No): ");
        pekerjaan = i.nextLine();
        
        System.out.print("Masukkan Gaji Bulanan: ");
        gaji = i.nextDouble();
        
        if(pekerjaan.equalsIgnoreCase("No")){
            if(gaji >=3000000 && gaji < 5000000){
                gajiPotong = gaji*potongan1;
                gajiBersih = gaji-gajiPotong;
                System.out.println("Gaji Terpotong Pajak 5%");
            }else if(gaji >=5000000){
                gajiPotong = gaji*potongan2;
                gajiBersih = gaji-gajiPotong;
            										System.out.println("Gaji Terpotong Pajak 10%");
            }else {
                gajiBersih = gaji;
                System.out.println("Gaji Tidak Terkena Potongan Pajak");
            }
        }else if(pekerjaan.equalsIgnoreCase("Yes")){
            if(gaji >=3000000 && gaji < 5000000){
                gajiPotong = gaji*(potongan1+potongan1);
                gajiBersih = gaji-gajiPotong;
                System.out.println("Gaji Terpotong Pajak 10%");
            }else if(gaji >=5000000){
                gajiPotong = gaji*(potongan2+potongan1);
                gajiBersih = gaji-gajiPotong;
            										System.out.println("Gaji Terpotong Pajak 15%");
            }else {
                gajiBersih = gaji;
                System.out.println("Gaji Tidak Terkena Potongan Pajak");
            }
        }else {
            System.out.println("tolong masukkan yes/no");
        }
        System.out.println("Gaji bersih anda adalah: "+gajiBersih);
    }
}
