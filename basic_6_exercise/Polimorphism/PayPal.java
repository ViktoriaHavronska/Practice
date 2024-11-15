package basic_6_exercise.Polimorphism;

class PayPal extends PaymentMethod {

    public int balance;

    public PayPal(int balance) {
        this.balance = balance;
    }

    public void processPayment(double amount) {
        super.processPayment(amount);
        if (balance >= amount) {
            System.out.println("Payment successful");
        } else {
            System.out.println("Payment failed");
        }

    }
}
