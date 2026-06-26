abstract class Payment {
	public abstract String processPayment(double amount);
}

interface Refundable {
	public void refund(double amount);
}

class PayPal extends Payment implements Refundable{
	@Override
    public String processPayment(double amount) {
        return ("Payed " + amount + " with PayPal.");
    }
     @Override
    public void refund(double amount) {
    }
}	

class CreditCard extends Payment implements Refundable{
	@Override
    public String processPayment(double amount) {
        return ("Payed " + amount + " with a CreditCard.");
    }
    @Override
    public void refund(double amount) {
    }
}	

class BankTransfer extends Payment {
	@Override
    public String processPayment(double amount) {
        return ("Payed " + amount + " with BankTransfer.");
    }
}	

public class P2_OOP {
    public void paymentSystem(Payment payment) {
        System.out.println(payment.processPayment(20));
    }
    public static void main(String[] args) {
    	P2_OOP main = new P2_OOP();
        main.paymentSystem(new PayPal());
        main.paymentSystem(new CreditCard());
        main.paymentSystem(new BankTransfer());
    }
}
