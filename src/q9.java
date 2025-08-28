import java.util.Arrays;

public class q9  {


    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(numbers));

        reverseArray(numbers);

        System.out.println("Reversed Array: " + Arrays.toString(numbers));
    }
}
