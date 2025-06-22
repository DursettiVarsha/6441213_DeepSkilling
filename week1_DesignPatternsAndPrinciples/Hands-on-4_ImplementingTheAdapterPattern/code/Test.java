public class Test {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPalAdapter(new PayPal());
        PaymentProcessor cashfree = new CashfreeAdapter(new Cashfree());
        PaymentProcessor razorpay = new RazorpayAdapter(new Razorpay());

        System.out.println("=== PayPal ===");
        paypal.processPayment(1500.0);
        paypal.refundPayment(500.0);

        System.out.println("\n=== Cashfree ===");
        cashfree.processPayment(2000.0);
        cashfree.refundPayment(800.0);

        System.out.println("\n=== Razorpay ===");
        razorpay.processPayment(1000.0);
        razorpay.refundPayment(300.0);
    }
}
