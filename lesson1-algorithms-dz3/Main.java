public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
        
        int mainDiagonalSum = findMainDiagonalSum(matrix);
        System.out.println("Main diagonal sum: " + mainDiagonalSum);
        
        int counterDiagonalSum = findCounterDiagonalSum(matrix);
        System.out.println("Counter diagonal sum: " + counterDiagonalSum);
    }
    
    public static int findMainDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
    
    public static int findCounterDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][matrix.length - 1 - i];
        }
        return sum;
    }

    
}
