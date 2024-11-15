package basic_2_exercise;

import java.util.Scanner;

public class CombinationOfAll {
    public static void main(String[] args) {
        System.out.println("Do you want play game?");
        Scanner sc = new Scanner(System.in);
        String game = sc.nextLine();

        if (game.equalsIgnoreCase("yes")) {
            System.out.println("Find a number between 1 and 10");
            int number = sc.nextInt();


            while (number != 6) {

                if (number < 6) {
                    System.out.println("Number is higher.Try again! ");
                } else if (number > 6) {
                    System.out.println("Number is lower.Try again! ");
                }
                number = sc.nextInt();
            }
            System.out.println("You win!");
        } else {
            System.out.println("Game over!");
        }

        sc.close();
    }
}



