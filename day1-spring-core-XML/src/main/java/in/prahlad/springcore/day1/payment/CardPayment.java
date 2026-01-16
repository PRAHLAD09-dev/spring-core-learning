package in.prahlad.springcore.day1.payment;

public class CardPayment implements PaymentGateway 
{

	@Override
	public void pay(double amount) {
    System.out.println("Payment of ₹ "+ amount +" done using CARd");
		
	}
	

}
