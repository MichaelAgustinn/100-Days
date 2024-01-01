import java.util.Scanner;

public class day85 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Kata: ");
        String kata = in.nextLine();

        String reverse = new StringBuilder(kata).reverse().toString();

        System.out.println("Sebelum Reverse: " + kata);
        System.out.println("Sesudah Reverse: " + reverse);

        in.close();
    }
}
