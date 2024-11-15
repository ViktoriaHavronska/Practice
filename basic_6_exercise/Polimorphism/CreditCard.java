package basic_6_exercise.Polimorphism;

class CreditCard extends PaymentMethod {
   public int sum;

    public CreditCard(int amount) {
        this.sum = amount;
    }

    public void processPayment(double amount) {
        super.processPayment(amount);
        System.out.println("Sum " + amount);
    }

}
