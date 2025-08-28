import java.util.Arrays;

public class q5 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};

        int[] referenceCopy = original;

        referenceCopy[0] = 99;

        System.out.println("After modifying reference copy:");
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Reference Copy: " + Arrays.toString(referenceCopy));

        int[] realCopy = Arrays.copyOf(original, original.length);

        realCopy[1] = 77;

        System.out.println("\nAfter modifying real copy:");
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Real Copy: " + Arrays.toString(realCopy));
    }
}
