import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = generateRandomArray(10, 1, 100);

        System.out.println("Original array: " + Arrays.toString(array));

        int[] arrayForSelectionSort = array.clone();
        SelectionSort.sort(arrayForSelectionSort);
        System.out.println("Sorted with SelectionSort: " + Arrays.toString(arrayForSelectionSort));

        int[] arrayForInsertionSort = array.clone();
        InsertionSort.sort(arrayForInsertionSort);
        System.out.println("Sorted with InsertionSort: " + Arrays.toString(arrayForInsertionSort));
    }

    public static int[] generateRandomArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }
}