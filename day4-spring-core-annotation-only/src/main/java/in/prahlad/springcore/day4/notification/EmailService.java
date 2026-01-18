package in.prahlad.springcore.day4.notification;

import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailService implements MessageService 
{

    @Override
    public void sendMessage(String message) 
    {
        System.out.println("Email sent: " + message);
    }
}