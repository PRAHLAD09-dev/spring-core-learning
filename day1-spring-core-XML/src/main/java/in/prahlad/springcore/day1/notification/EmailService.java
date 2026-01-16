package in.prahlad.springcore.day1.notification;

public class EmailService implements MessageService
{

  @Override
  public void sendMessage(String message)
  {
	  System.out.println("Email sent: "+ message);
  }
	

}