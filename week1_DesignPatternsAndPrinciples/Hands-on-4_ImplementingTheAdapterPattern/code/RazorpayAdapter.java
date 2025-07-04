public class RazorpayAdapter implements PaymentProcessor {
    private Razorpay razorpay;

    public RazorpayAdapter(Razorpay razorpay) {
        this.razorpay = razorpay;
    }

    @Override
    public void processPayment(double amount) {
        razorpay.initiateTransaction(amount);
    }

    @Override
    public void refundPayment(double amount) {
        razorpay.reverseTransaction(amount);
    }
}
