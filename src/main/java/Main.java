public class Main {

    public static void main(String[] args) {
//        25.mar.2025
        String name = "Ramona123";
        System.out.println(name);

        sumDiff(args);

        comparison();

        calculateSum();

        boolean result = isOddNumber(5);
        System.out.println(result);
        System.out.println(isOddNumber(8));

        drawFullShape(3, 4);
    }

    private static void comparison() {
        int a = 2;
        int b = 3;
        if (a > b) {
            System.out.println("a>b");
        } else if (a == b) {
            System.out.println("a = b");
        } else {
            System.out.println("a<b");
        }
    }

    private static void sumDiff(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        System.out.println(a + "+" + b + "=" + sum);
        int dif = a - b;
        System.out.println(a + "-" + b + "=" + dif);
        System.out.println(b);
    }

    private static void calculateSum() {
        int sum = 0;
        {
            for (int i = 0; i <= 100; i++)
                sum = sum + i;
        }
        System.out.println(sum);
    }

//        27. mar 2025
    public static boolean isOddNumber(int number) {
        return number % 2 != 0;
    }


    public static void drawFullShape(int width, int height) {
        for (int x = 0; x < height; x++) {
            for (int i = 0; i < width; i++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        printParameter(5);
        printParameter("test");
        printParameter(7, "Hello guys!");
    }

    public static void printParameter(String stringToReturn) {
        System.out.println(stringToReturn);
    }

    public static void printParameter(int intToReturn) {
        System.out.println(intToReturn);
    }

    public static void printParameter(int intToReturn, String stringToReturn) {
        System.out.println(intToReturn + " " + stringToReturn);
        System.out.println(stringToReturn);

    }

}


