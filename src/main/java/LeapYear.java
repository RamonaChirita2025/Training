public class LeapYear {
    public static void main(String[] args) {
        calculateLeapYear(0);
    }
        public static void calculateLeapYear(int x){
            for (x= 1900; x <= 2016; x++) {
                if (x % 100 == 0 && x % 400 != 0) {
                    System.out.println(x + " " + "is a leap year. February has 29 days.");
                } else if (x % 4 == 0 && x % 100 != 0) {
                    System.out.println(x + " " + "is a leap year. February has 29 days.");
                } else {
                    System.out.println(x + " " + "is not a leap year. February has 28 days.");
                }
            }
        }
    }





