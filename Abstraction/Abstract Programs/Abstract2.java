abstract class OnlinePayment {
    abstract void processPayment(double amount);
}


class CreditCardPayment extends OnlinePayment {
    void processPayment(double amount) {
        System.out.println("Credit Card Payment of $" + amount + " processed.");
    }
}


class PayPalPayment extends OnlinePayment {
    void processPayment(double amount) {
        System.out.println("PayPal Payment of $" + amount + " processed.");
    }
}


public class Abstract2 {
    public static void main(String[] args) {
        OnlinePayment creditCard = new CreditCardPayment();
        OnlinePayment paypal = new PayPalPayment();
       
        creditCard.processPayment(100);
        paypal.processPayment(200);
    }
}