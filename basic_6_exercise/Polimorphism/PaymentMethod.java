package basic_6_exercise.Polimorphism;

import java.util.Scanner;

class PaymentMethod {

    public void processPayment(double amount) {
        System.out.println("Amount paid: " + amount);
    }

    public static void main(String[] args) {
        System.out.println("Payment Method");
        System.out.println("Choose your payment method:");
        System.out.println("1. Credit card payment");
        System.out.println("2. Pay Pal payment");
        System.out.println("3. Giftcard payment");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("Credit card")) {
            System.out.println("Payment Credit card: ");
            PaymentMethod creditCard = new CreditCard(400);
            creditCard.processPayment(300);
        }else if(input.equals("Pay Pal")) {
            System.out.println("Payment PayPal: ");
            PaymentMethod payPal = new PayPal(300);
            payPal.processPayment(300);
        }else if(input.equals("Giftcard")) {
            System.out.println("Payment Giftcard: ");
            PaymentMethod giftCard = new GiftCard(400);
            giftCard.processPayment(300);
        }else {
            System.out.println("Invalid input");
        }
    }
}
