import java.util.Scanner;

public class testjava {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int batas = 0, b = 0, a = 0;

        System.out.print("Masukkan batas: ");
        batas = in.nextInt();

        for (int i = 1; i <= batas; i++) {
            a++;
            if (i % 3 == 0) {
                if (a != 3) {
                    System.out.print("+");
                }
                System.out.print(i);
                b += i;
            }
        }
        System.out.print("=" + b);
        in.close();
    }
}
