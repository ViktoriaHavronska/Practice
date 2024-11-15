package basic_2_exercise;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("Give number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (0<= num) {
            System.out.println(num);
            num = num - 1;
        }
        System.out.println("Start!");

    }
}
