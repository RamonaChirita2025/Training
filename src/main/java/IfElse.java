public class IfElse {

    public static void main(String[] args) {
    comparison();
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
}



