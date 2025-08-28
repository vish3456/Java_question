import java.util.Arrays;

public class q6 {
    public static void main(String[] args) {

        int[] numbers = {7, 2, 9, 4, 1};


        Arrays.sort(numbers);

        int index = Arrays.binarySearch(numbers, 4);

        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        System.out.println("Index of 4: " + index);
    }
}
