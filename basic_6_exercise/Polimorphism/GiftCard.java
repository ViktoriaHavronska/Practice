package basic_6_exercise.Polimorphism;

class GiftCard extends PaymentMethod {
    public int balance;

    public GiftCard(int balance) {
        this.balance = balance;
    }

    public void processPayment(double amount) {
        super.processPayment(amount);
        if (balance >= amount) {
            System.out.println("Payment successful");
            balance -= amount;
            System.out.println("the balance of funds " + balance);
        } else {
            System.out.println("Payment failed");
        }
    }
}
