package in.prahlad.springcore.day4.payment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class UpiPayment implements PaymentGateway 
{
    @Override
    public void pay(double amount) 
    {
        System.out.println("💰 Paid ₹" + amount + " via UPI");
    }


}