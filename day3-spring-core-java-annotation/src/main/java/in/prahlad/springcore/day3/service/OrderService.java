package in.prahlad.springcore.day3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.prahlad.springcore.day3.notification.MessageService;
import in.prahlad.springcore.day3.payment.PaymentGateway;

@Service
public class OrderService 
{   
	    private PaymentGateway paymentGateway;
	    private MessageService messageService;

	    @Autowired
	    public OrderService(PaymentGateway paymentGateway ,MessageService messageService ) 
	    {
	        this.paymentGateway = paymentGateway;
	   
	        this.messageService = messageService;
	    }

	    public void placeOrder() 
	    {
	        paymentGateway.pay(5000.50);
	        messageService.send("Your order is confirmed");
	        System.out.println("Order placed successfully");
	  }

}
