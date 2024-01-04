import java.util.Scanner;

public class day88 {
  static boolean Palindrome(String xyz) {
    return xyz.equals(new StringBuilder(xyz).reverse().toString());
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Masukkan Kata: ");
    String kata = in.nextLine();

    if (Palindrome(kata)) {
      System.out.println("Ini Palindrome");
    } else {
      System.out.println("ini bukan Palindrome");
    }

    in.close();
  }
}
