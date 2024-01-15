public class Day99 {
    public static void main(String[] args) {
        
        String[][] string2d = {
                {"penyihir", "pisang", "api"},
                {"perisai", "swordman", "panah"},
                {"gitar", "violin", "pensil"}
        };

        
        for (int i = 0; i < string2d.length; i++) {
            for (int j = 0; j < string2d[i].length; j++) {
                System.out.print(string2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
