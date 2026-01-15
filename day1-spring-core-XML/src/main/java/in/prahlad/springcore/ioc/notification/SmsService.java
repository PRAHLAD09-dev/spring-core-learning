package in.prahlad.springcore.ioc.notification;

public class SmsService implements MessageService
{

	@Override
	public void sendMessage(String message) 
	{
		System.out.println("SMSsent: "+message);
	}
		


}
