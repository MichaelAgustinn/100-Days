public class Day100 {
    public static void main(String[] args) {
        
        int[][] array2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Array 2D:");
        for (int[] row : array2D) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();

        
        int[][][] array3D = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};
        System.out.println("Array 3D:");
        for (int[][] matrix : array3D) {
            for (int[] row : matrix) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
