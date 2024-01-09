public class Day93{

    public static void main(String[]args){
        int jumlah = tambah (10, 9);
        System.out.println("Hasil Tambah "+jumlah);
        
        String nama = nama("miky", "tampan");
        System.out.println("Nama : "+nama);
    }
    public static int tambah (int x, int y){
        return x + y;
    }
    public static String nama(String namaDepan, String namaBelakang){
        return namaDepan + namaBelakang;
    }
        
}
