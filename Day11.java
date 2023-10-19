package day11;

public class Day11 {

    
    public static void main(String[] args) {
/*
Harga PC Yang Ingin Di Beli = 150000000
Penghasilan Bulanan = 13000000
Tagihan Rumah = 4000000
Biaya Anak = 4000000 (anakPertama: 2jt, anakLainnya: 1jt*2)
Sisa Penghasilan Yang Dapat Di Tabung/bulan = 5000000
Berapa Tahun Agar Sambo Dapat Membeli PC?
*/        

    double HargaPC = 150000000;
    double TabunganBulanan = 5000000;
    
    System.out.println("Lama Waktu Yang Dibutuhkan Sambo Untuk Membeli PC adalah ");
    System.out.print((HargaPC/TabunganBulanan)+" Bulan ");
    System.out.print("Atau "+(HargaPC/TabunganBulanan/12)+(" Tahun"));
    }
    
}
