package in.prahlad.springcore.day4.notification;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SmsService implements MessageService 
{

    @Override
    public void sendMessage(String message) 
    {
        System.out.println("SMS sent: " + message);
    }
}