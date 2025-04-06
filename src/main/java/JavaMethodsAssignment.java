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
        System.out.println(checkPassword("wr6dfvd"));
        System.out.println();

        System.out.println(wordWithVocals("Dreams"));
        System.out.println(wordWithVocals("Dream"));
        System.out.println(wordWithVocals("Drea"));
        System.out.println();

        System.out.println(generateRandom());
        System.out.println(maxOfThreeNumbers(3, 1, 6));
        System.out.println(maxOfThreeNumbers(2, 7, 1));
        System.out.println(maxOfThreeNumbers(5, 1, 4));
        System.out.println(maxOfThreeNumbers(5, 5, 4));
        System.out.println(maxOfThreeNumbers(1, 1, 1));
        System.out.println();

        System.out.println(countWords("sdfdfd dfdfdfd dfwefrf  frgv   234345f   "));
        System.out.println();

        System.out.println(operation("*", 1, 3));
        System.out.println(operation("/", 4, 2));
        System.out.println(operation("-", 7, 5));
        System.out.println(operation("+", 2, 4));
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

}

