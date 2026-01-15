package in.prahlad.springcore.ioc.payment;

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
