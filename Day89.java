import java.util.Scanner;
public class day89 {

    public static void main(String []args){
        Scanner in = new Scanner (System.in);
        double total= 0;

        System.out.print("Masukkan Batas Isi: ");
        int isi = in.nextInt();

        for(int i = 1; i <=isi; i++){
            System.out.print("Masukkan Nilai Ke-"+i+" : ");
            double nilai = in.nextDouble();
            total+=nilai;
        }
        double rataRata = total / isi;

        System.out.print("Nilai Rata-Rata Adalah : "+rataRata);
      in.close();
    }
}
