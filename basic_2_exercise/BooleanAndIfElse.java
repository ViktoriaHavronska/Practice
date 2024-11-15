package basic_2_exercise;

import java.util.Scanner;

public class BooleanAndIfElse {
    public static void main(String[] args) {
        System.out.println("Do you have a driver’s license? ");
        Scanner scanner = new Scanner(System.in);
        String driver = scanner.nextLine();
        if (driver.equalsIgnoreCase("Yes")) {
            System.out.println("Do you have a car?");
            if (scanner.nextLine().equalsIgnoreCase("Yes")) {
                System.out.println("Do you have a  insurance?");
                if (scanner.nextLine().equalsIgnoreCase("Yes")) {
                    System.out.println("Person can legally drive");
                } else {
                    System.out.println("Person cannot legally drive");
                }
            } else {
                System.out.println("Person cannot legally drive");
            }
        } else {
            System.out.println("Person cannot legally drive");
        }
    }
}
