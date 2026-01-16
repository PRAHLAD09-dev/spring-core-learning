package in.prahlad.springcore.day1.payment;

public class OrderService 
{
	private PaymentGateway paymentGateway;

	public OrderService(PaymentGateway paymentGateway) 
	{

		this.paymentGateway = paymentGateway;
	}
	
	public void placeOrder()
	{
		paymentGateway.pay(999);
		System.out.println("Order placed succesfully");
	}
	

}
