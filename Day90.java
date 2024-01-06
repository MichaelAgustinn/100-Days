package coding100days;

public class Day90 {
    
    String namaDepan, namaBelakang;
    int umur;
    
    public void output(){
        System.out.println("Nama Depan    : "+namaDepan);
        System.out.println("Nama Belakang : "+namaBelakang);
        System.out.println("Umur          : "+umur);
    }
    public static void main(String []args){
        Day90 in = new Day90();
        in.namaDepan = "miky";
        in.namaBelakang = "tampan";
        in.umur = 17;
        
        in.output();
    }
}
