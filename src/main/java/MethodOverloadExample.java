public class MethodOverloadExample {
    public static void main (String [] args) {
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
