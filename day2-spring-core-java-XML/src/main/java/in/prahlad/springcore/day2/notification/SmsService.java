package in.prahlad.springcore.day2.notification;

public class SmsService implements MessageService {

    @Override
    public void send(String message) {
        System.out.println("SMS sent "+message);
    }
}