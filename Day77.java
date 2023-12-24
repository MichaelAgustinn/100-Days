import java.util.Scanner;
public class testjava {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int batas =0,b=0;
        
        System.out.print("Masukkan batas: ");
        batas = in.nextInt();
  
        for(int i=1; i<=batas; i++){
        if(i%3==0 && i<batas){
            System.out.print(i);
        if (i!=b) {
            System.out.print("+");
        }else{
            System.out.print("=");
        }
        b+=i;
        }
        }
        System.out.print(b);
        in.close();
    }
}
