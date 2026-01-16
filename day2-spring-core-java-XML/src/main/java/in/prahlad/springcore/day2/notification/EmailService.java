package in.prahlad.springcore.day2.notification;

public class EmailService implements MessageService {

	@Override
	public void send(String message) {
		
		System.out.println("Email Sent:"+message);
		
	}

}
