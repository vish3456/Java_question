import java.util.Arrays;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,6,7};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr2));

    }
}
