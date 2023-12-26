import java.util.Scanner;

public class day81 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Kata: ");
        String kata = in.nextLine();

        String up = kata.toUpperCase();

        System.out.println("Membuat kata menjadi huruf kapital = " + up);

        in.close();
    }
}
