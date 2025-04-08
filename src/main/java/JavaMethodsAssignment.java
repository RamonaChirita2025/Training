import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JavaMethodsAssignment {

    public static void main(String[] args) {

        System.out.println(checkPassword("34wrdsedfgyre4fs!"));
        System.out.println(checkPassword("34wrdsedfgyre4fs"));
        System.out.println(checkPassword("4wrdsedfgyre4fs!"));
        System.out.println(checkPassword("4wrdsedfgyre4fs"));
        System.out.println(checkPassword("wrdsedfLFGgyre4f"));
        System.out.println(checkPassword("wR6df2d"));
        System.out.println();

        System.out.println(wordWithVocals("Dreams"));
        System.out.println(wordWithVocals("Dream"));
        System.out.println(wordWithVocals("Drea"));
        System.out.println();

        System.out.println(generateRandom());
        System.out.println();

        System.out.println(maxOfThreeNumbers(3, 1, 6));
        System.out.println(maxOfThreeNumbers(2, 7, 1));
        System.out.println(maxOfThreeNumbers(5, 1, 4));
        System.out.println(maxOfThreeNumbers(5, 5, 4));
        System.out.println(maxOfThreeNumbers(1, 3, 3));
        System.out.println(maxOfThreeNumbers(1, 1, 1));
        System.out.println();

        System.out.println(countWords("sdfdfd dfdfdfd dfwefrf  frgv   234345f   "));
        System.out.println();

        System.out.println(operation("*", 1, 3));
        System.out.println(operation("/", 4, 2));
        System.out.println(operation("-", 7, 5));
        System.out.println(operation("+", 2, 4));
        System.out.println();

        calculateSumOfOddNumber();
        System.out.println();

        reverseNumber(452);
        reverseNumber(1943);
        reverseNumber(20);
        System.out.println();

        System.out.println(isMagicNumber(102));
        System.out.println(isMagicNumber(2));
        System.out.println(isMagicNumber(9));
        System.out.println();

        isPalindrome("Test");
        isPalindrome("Hannah");
        isPalindrome("apa");
        System.out.println();

        containsCharacter("Tatiana");
        containsCharacter("number");
        containsCharacter("test");
        containsCharacter(" ");
        System.out.println();


    }

    // 1. verificare parola
    private static boolean checkPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        List<String> allLetters = List.of("A", "a", "B", "b", "C", "c", "D", "d", "E", "e", "F", "f", "G", "g",
                "H", "h", "I", "i", "J", "j", "K", "k", "L", "l", "M", "m", "N", "n", "O", "o", "P", "p",
                "Q", "q", "R", "r", "S", "s", "T", "t", "U", "u", "V", "v", "W", "w", "X", "x", "Y", "y", "Z", "z");
        List<String> allDigits = List.of("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");

        List<String> digitsFromPassword = new ArrayList<>();
        for (int index = 0; index < password.length(); index++) {
            String character = String.valueOf(password.charAt(index));
            if (!allLetters.contains(character) && !allDigits.contains(character)) {
                return false;
            }
            if (allDigits.contains(character)) {
                digitsFromPassword.add(character);
            }
        }

        if (digitsFromPassword.size() < 2) {
            return false;
        }

        return true;
    }

    // 2. verificare consoane / vocale
    public static String wordWithVocals(String wordWithVocals) {
        if (wordWithVocals.length() > 5) {
            return wordWithVocals.replaceAll("[AaEeIiOoUu]", "");
        } else if (wordWithVocals.length() < 5) {
            return wordWithVocals.replaceAll("[BbCcDdFfGgHhJjKkLlMmNnPpQqRrSsTtVvWwYyZz]", "");
        } else {
            return wordWithVocals;
        }
    }

    // 3. random number
    public static int generateRandom() {
        Random random = new Random();
        return random.nextInt(101);
    }

    // 4. maximul dintre 3 numere
    public static int maxOfThreeNumbers(int a, int b, int c) {
        if (a >= b && a > c) {
            return a;
        }
        if (b > a && b >= c) {
            return b;
        }
        if (c >= a && c > b) {
            return c;
        }
        if (a == b && b == c) {
            return a;
        }
        return 0;
    }

    // 5. numarul de cuvinte dintr-un string
    public static int countWords(String input) {
        String[] words = input.split(" ");
        int numberOfWords = 0;
        for (int wordsIndex = 0; wordsIndex < words.length; wordsIndex++) {
            String word = words[wordsIndex];
            if (!word.isBlank()) {
                numberOfWords++;
            }
        }
        return numberOfWords;
    }

    // 6. calculator
    public static int operation(String sign, int a, int b) {
        switch (sign) {
            case "+" -> {
                return a + b;
            }
            case "/" -> {
                return a / b;
            }
            case "-" -> {
                return a - b;
            }
            case "*" -> {
                return a * b;
            }
        }
        return -1;
    }

    //    additional:
    //
    // 1. media aritmetica a tuturor numerelor impare , pana la un numar dat
    public static void calculateSumOfOddNumber() {
        int sum = 0;
        for (int i = 0; i <= 9; i++) {
            if ((i % 2) != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    // 2. inversul numarului e.g: 12345 -> 54321
    public static void reverseNumber(int number) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(number));
        System.out.println(stringBuilder.reverse());
    }
    // 3.numar magic
    public static boolean isMagicNumber (int number) {
        String numberAsString = String.valueOf(number);
        int sumOfDigits = 0;
        for (int i = 0; i < numberAsString.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
            sumOfDigits = sumOfDigits + digit;
        }
        if (number % sumOfDigits == 0 && number/sumOfDigits == 1){
            return true;
        } else {
            return false;
        }
    }

    // 4. palindrom

    public static void isPalindrome(String s) {
        String myString = s, reverseMyString = "";
        int myStringLength = myString.length();
        for (int i = (myStringLength - 1); i >= 0; --i) {
            reverseMyString = reverseMyString + myString.charAt(i);
        }
        if (myString.toLowerCase().equals(reverseMyString.toLowerCase())) {
            System.out.println(myString + " is a palindrome!");
        } else {
            System.out.println(myString+ " is not a palindrome!");
        }
    }

    // 5. stringul conține un caracter dat si returneaza pozitiile pe care se afla
    public static void containsCharacter(String myString) {
        if (myString.contains("t") || myString.contains("T")) {
            for (int i = 0; i < myString.length(); i++) {
                char character = myString.charAt(i);
                if (character == 't' || character == 'T') {
                    System.out.println(i+1);
                }
            }
        }
        else{
            System.out.println("The word doesn't contains 't' character.");
        }
    }
}