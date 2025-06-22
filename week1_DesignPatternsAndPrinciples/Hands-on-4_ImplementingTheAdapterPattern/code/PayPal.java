public class PayPal {
    public void makePayment(double amount) {
        System.out.println("PayPal: Payment of Rs." + amount + " made.");
    }

    public void makeRefund(double amount) {
        System.out.println("PayPal: Refund of Rs." + amount + " issued.");
    }
}
