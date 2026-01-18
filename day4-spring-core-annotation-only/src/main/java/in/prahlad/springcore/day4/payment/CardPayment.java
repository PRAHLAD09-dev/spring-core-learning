package in.prahlad.springcore.day4.payment;

import org.springframework.stereotype.Component;

@Component
public class CardPayment implements PaymentGateway 
{
    public void pay(double amount) 
    {
        System.out.println("Paid via Card: " + amount);
    }
}
