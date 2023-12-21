import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int batas =0,a=0;
        
        System.out.print("Masukkan batas: ");
        batas = in.nextInt();
  
        for(int i=1; i<=batas; i++){
        if(i%3==0 && i<batas){
        a++;
        }
        }
        System.out.println(a);
    }
}
