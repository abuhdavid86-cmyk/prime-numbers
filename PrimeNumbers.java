public class PrimeNumbers {

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Prime numbers between 0 and 500:");
        int count = 0;
        for (int num = 0; num <= 500; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
        }
        System.out.println("\n\nTotal primes found: " + count);
    }
}