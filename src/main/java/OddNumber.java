public class OddNumber {
    public static void main(String[] args) {
        boolean result = isOddNumber(5);
        System.out.println(result);
        System.out.println(isOddNumber(8));
    }

    public static boolean isOddNumber(int number) {
        return number % 2 != 0;
    }
}
