import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] angka = {5, 2, 8, 1, 7, 3, 9, 4, 6};
        
        System.out.println("Array sebelum diurutkan: "+Arrays.toString(angka));
        System.out.println("");
      
        Arrays.sort(angka);
        
        System.out.println("Array setelah diurutkan: "+Arrays.toString(angka));
    }
}
