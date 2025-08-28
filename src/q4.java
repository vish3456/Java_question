import java.util.Scanner;

class PrimeArray {

    public static int[] generatePrimes(int n) {
        int[] primes = new int[n];
        int count = 0;
        int num = 2;

        while (count < n) {
            if (isPrime(num)) {
                primes[count] = num;
                count++;
            }
            num++;
        }
        return primes;
    }


    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of primes: ");
        int n = sc.nextInt();
        int[] primeNumbers = generatePrimes(n);

        System.out.println("First " + n + " prime numbers are:");
        for (int prime : primeNumbers) {
            System.out.print(prime + " ");
        }
    }
}
