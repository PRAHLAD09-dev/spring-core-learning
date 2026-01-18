package in.prahlad.springcore.day4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.prahlad.springcore.day4.payment.PaymentGateway;
import in.prahlad.springcore.day4.notification.MessageService;

@Service
public class OrderService {

    private final PaymentGateway paymentGateway;
    private final MessageService messageService;

    @Autowired
    public OrderService(
            @Qualifier("upiPayment") PaymentGateway paymentGateway,
            @Qualifier("emailService") MessageService messageService)
    {

        this.paymentGateway = paymentGateway;
        this.messageService = messageService;
    }

    public void placeOrder() {
        paymentGateway.pay(1000);
        messageService.sendMessage("Order placed successfully!");
        System.out.println("Order placed");
    }
}