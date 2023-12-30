public class day84 {
    
    public static void main(String[] args) {
        int angka[][] = {
            {1,2,3},
            {3,1,2},
            {2,3,1}
        };
        for (int i=0; i<angka.length;i++){
            for (int j=0; j<angka[i].length; j++){
                System.out.print(angka[i][j]+" ");
            }
            System.out.println();
        }
}
}
