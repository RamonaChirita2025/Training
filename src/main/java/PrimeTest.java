public class PrimeTest {

    public static void main(String[] args) {
        printPrimeNumbersLowerThan1000000();
    }

    private static void printPrimeNumbersLowerThan1000000() {
        for (int i = 1; i <= 1000000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
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
