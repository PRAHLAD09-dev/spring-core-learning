package in.prahlad.springcore.ioc.payment;

public class CardPayment implements PaymentGateway 
{

	@Override
	public void pay(double amount) {
    System.out.println("Payment of ₹ "+ amount +" done using CARd");
		
	}
	

}
