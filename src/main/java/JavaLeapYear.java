import java.util.Scanner;
public class JavaLeapYear {
    public static void main(String[] args){
            int year;
            System.out.println("Enter an Year :: ");
            Scanner sc = new Scanner(System.in);
            year = sc.nextInt();
            if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
                System.out.println("Specified year is a leap year." + " " + "February has 29 day!");
            else
                System.out.println("Specified year is not a leap year." + " " + "February has 28 day!");
        }
    }
