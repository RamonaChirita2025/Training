public class Playground {
    public static void main(String[] args) {

        String name = "John";
        System.out.println("Hello" + " " + name);
        System.out.println(name.indexOf("h"));
        System.out.println(name.length());
        for (int i = 0; i <= name.length() - 1; i++) {
            if ((i + 1) % 2 == 0) {
                System.out.println(name.charAt(i));
            }
        }

        String carName = "Volvo";
        System.out.println(carName);
        System.out.println(carName.length());

        int x = 5, y = 10;
        int z = x + y;
        System.out.println(z);
        System.out.println(Math.min(x, y));
        System.out.println(Math.max(x, y));

        boolean myBool = false;
        System.out.println(myBool);

        char myLetter = 'R';
        System.out.println(myLetter);

        double myDouble = 5.99d;
        int myInt = (int) myDouble;

        System.out.println(myInt);

        int maxSpeed = 120;
        System.out.println(maxSpeed);

        String[] cars = {"Volvo", "KIA", "Audi", "BMV"};
        System.out.println(cars[1]);

        String stringWithVowels = "Extract that to its own method. Use it wisely!";
        stringWithVowels = stringWithVowels.replaceAll("[AaEeIiOoUu]", "*");
        System.out.println(stringWithVowels);
    }
}
