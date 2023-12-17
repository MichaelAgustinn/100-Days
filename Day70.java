import java.util.Scanner;
public class test {
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("masukkan batas(ganjil): ");
    int batas = 0;
    batas = in.nextInt();
    
    if(batas%2==1){
        for (int i = 0; i <= batas; i++) {
            for (int j = batas; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    
        for (int i = batas - 1; i >= 0; i--) {
            for (int j = i; j < batas; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }else {
        System.out.println("error: tolong masukkan angka ganjil");
    }
}
}
