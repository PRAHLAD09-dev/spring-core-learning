package in.prahlad.springcore.day3.payment;

import org.springframework.stereotype.Component;

@Component
public class UpiPayment implements PaymentGateway
{

	@Override
	public void pay(double amount) {
		System.out.println("Payment of ₹" + amount + " done using UPI");
	}

}
