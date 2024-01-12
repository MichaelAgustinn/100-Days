import java.util.Scanner;
public class Day96 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        
        String[] hewan = new String[11];
        
        for(int i = 0; i < hewan.length; i++){
            System.out.print("Hewan Ke-" + i + "\t: ");
            hewan[i] = in.nextLine();
        }
        System.out.println("Hewan - Hewan Yang di input : ");
        for (String printout : hewan){
            System.out.println(printout);
        }
        
        if(hewan.length > 3){
            for(int i = 3; i < hewan.length - 1; i++){
                hewan[i] = hewan[i + 1];
            }
            hewan[hewan.length - 1] = null;
        }
        System.out.println("Array Setelah Hapus Index Ke-3 : ");
        for(String printout2 : hewan){
            if(printout2 != null){
                System.out.println(printout2);
            }
        }
        
        System.out.print("Masukkan Nama Hewan Baru : ");
        hewan[hewan.length - 1] = in.nextLine();
        
        System.out.println("Hewan Index Ke-8 : "+hewan[8]);
        
        System.out.println("Array Setelah Penambahan : ");
        for(String printout3 : hewan){
            System.out.println(printout3);
        }
        in.close();
    }
}
