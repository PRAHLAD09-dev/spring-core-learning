package in.prahlad.springcore.ioc.notification;

public class NotificationService 
{
   private MessageService messageService;


   public void setMessageService(MessageService messageService) 
   {
	this.messageService = messageService;
   }
   
   public void notifyUser()
   {
	   messageService.sendMessage("Your order is confirmed.");
   }
}
