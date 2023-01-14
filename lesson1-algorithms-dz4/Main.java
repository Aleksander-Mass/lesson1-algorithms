import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int n = 1;
        boolean right = true;
        
        System.out.println("Original array: " + Arrays.toString(array));
        shift(array, n, right);
        System.out.println("Shifted array: " + Arrays.toString(array));
    }
    
    public static void shift(int[] array, int n, boolean right) {
        if (n < 0) {
            n = array.length + n;
        }
        int[] shiftedArray = new int[array.length];
        if (right) {
            System.arraycopy(array, array.length - n, shiftedArray, 0, n);
            System.arraycopy(array, 0, shiftedArray, n, array.length - n);
        } else {
            System.arraycopy(array, n, shiftedArray, 0, array.length - n);
            System.arraycopy(array, 0, shiftedArray, array.length - n, n);
        }
        System.arraycopy(shiftedArray, 0, array, 0, array.length);
    }

    
}
