public class Razorpay {
    public void initiateTransaction(double amount) {
        System.out.println("Razorpay: Transaction of Rs." + amount + " initiated.");
    }

    public void reverseTransaction(double amount) {
        System.out.println("Razorpay: Refund of Rs." + amount + " reversed.");
    }
}
