public class Assignment {

    public static void main(String[] args) {

        sumWithFor();

        sumWithWhile();

        cubeNumber();

        calculateSumAndProduct();

        printBackwards();

        printThirdCharacter();

    }

    private static void sumWithWhile() {
        int initialNumber = 12;
        int sum = 0;
        int i = 1;

        while (i <= 20) {
            sum = sum + initialNumber;
            initialNumber++;
            i++;
        }

        System.out.println("Sum with while: " + sum);
        System.out.println();
    }

    private static void sumWithFor() {
        //1.Calculate the sum of the first 20 numbers, higher than 11.

        int sum = 0;
        for (int i = 12; i <= 31; i++) {
            sum = sum + i;
        }

        System.out.println("Sum with for: " + sum);
        System.out.println();
    }

    private static void cubeNumber() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("For number " + i + " the cube is: " + i*i*i);
        }
        System.out.println();
    }

    private static void calculateSumAndProduct (){
        int sum = 0, prod = 1;
        for (int i = 1; i<= 6; i++) {
            if (i%2 == 0) {
                prod = prod *i ;
            } else {
                sum = sum + i ;
            }
        }
        System.out.println("The sum of odd numbers lower than 6 is:" + " " +sum);
        System.out.println("The multiplication result of even numbers lower than 6 is: " + prod);
        System.out.println();
    }

    private static void printBackwards() {
        String message = "Message";
        for (int i = message.length() - 1; i >= 0; i--) {
            System.out.println(message.charAt(i));
        }
        System.out.println();
    }

    private static void printThirdCharacter () {
        String message = "Message";

        for (int i = 0; i <= message.length() -1; i++) {
            if ((i+1) % 3 == 0) {
                System.out.println(message.charAt(i));
            }
        }

    }
}


