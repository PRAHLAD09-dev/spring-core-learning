package in.prahlad.springcore.day1.payment;

public class UpiPayment implements PaymentGateway
{

	@Override
	public void pay(double amount) 
	{
		System.out.println("Payment of ₹ " + amount + " done using UPI");

		
	}

}
