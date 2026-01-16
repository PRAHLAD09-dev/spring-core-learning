package in.prahlad.springcore.day2.service;

import in.prahlad.springcore.day2.payment.PaymentGateway;
import in.prahlad.springcore.day2.notification.MessageService;

public class OrderService {

    private PaymentGateway paymentGateway;
    private MessageService messageService;

    // Constructor Injection
    public OrderService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    // Setter Injection
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void placeOrder() {
        paymentGateway.pay(2000);
        messageService.send("Your order is confirmed");
        System.out.println("Order placed successfully");
    }
}