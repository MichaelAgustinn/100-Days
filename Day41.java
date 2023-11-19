package coding.pkg100.days;

public class Day42 {
    public static void main(String[] args) {
        int [] angka = {1,2,3,4,5,6,7};
        System.out.println("isi indeks array");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i]);
            if(i!=angka.length-1){
            System.out.print(", ");
            }else{
            System.out.print(".");
            }
        }
        System.out.println("");
    }
}
