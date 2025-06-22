public class Test {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456", "D Var");
        context.setPaymentStrategy(creditCard);
        context.pay(2500.00);
        PaymentStrategy paypal = new PayPalPayment("dvar.paypal@example.com");
        context.setPaymentStrategy(paypal);
        context.pay(1800.50);
    }
}
