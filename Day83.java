import java.util.Scanner;

public class day83 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int percobaan = 0;

        while (percobaan < 3) {
            System.out.print("Masukkan Kata Sandi: ");
            String pass = in.nextLine();

            if (pass.equalsIgnoreCase("mikytampan")) {
                System.out.println("Login Sukses");
                break;
            } else {
                System.out.println("Kata Sandi Salah");
                percobaan++;
            }
            if (percobaan == 3) {
                System.out.println("Batas Maksimal Percobaan Telah Habis");
                break;
            }
        }
        in.close();
    }
}
