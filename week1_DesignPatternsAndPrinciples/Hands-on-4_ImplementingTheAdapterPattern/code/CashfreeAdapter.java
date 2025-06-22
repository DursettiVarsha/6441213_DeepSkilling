public class CashfreeAdapter implements PaymentProcessor {
    private Cashfree cashfree;

    public CashfreeAdapter(Cashfree cashfree) {
        this.cashfree = cashfree;
    }

    @Override
    public void processPayment(double amount) {
        cashfree.sendPayment(amount);
    }

    @Override
    public void refundPayment(double amount) {
        cashfree.processRefund(amount);
    }
}
