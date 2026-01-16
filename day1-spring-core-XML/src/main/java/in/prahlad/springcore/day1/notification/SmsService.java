package in.prahlad.springcore.day1.notification;

public class SmsService implements MessageService
{

	@Override
	public void sendMessage(String message) 
	{
		System.out.println("SMSsent: "+message);
	}
		


}
