public class PrimeTest {

    public static void main(String[] args) {
        long timeBefore = System.currentTimeMillis();
        printPrimeNumbersLowerThan1000000();
        long timeAfter = System.currentTimeMillis();
        System.out.println("Generating the prime numbers until 1000000 took: " + (timeAfter - timeBefore) / 1000 + " seconds");
    }

    private static void printPrimeNumbersLowerThan1000000() {
        int numberOfPrimeNumbers = 0;
        for (int i = 1; i <= 1000000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                numberOfPrimeNumbers++;
            }
        }

        System.out.println("Number of prime numbers until 1000000: " + numberOfPrimeNumbers);
    }

    private static boolean isPrime(int number) {
        for (int i = 1; i < number / 2; i++) {
            if (i != 1 && (number % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
