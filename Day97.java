public class Day97 {
    public static void main(String[] args) {
        int[][][] array = {
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                {{11, 22, 33}, {44, 55, 66}, {77, 88, 99}},
                {{12, 23, 34}, {45, 56, 67}, {78, 89, 91}}
        };
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
