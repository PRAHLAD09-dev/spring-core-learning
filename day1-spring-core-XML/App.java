package in.prahlad.springcore.day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.prahlad.springcore.ioc.payment.OrderService;
import in.prahlad.springcore.ioc.notification.NotificationService;

public class App {

    public static void main(String[] args) {

        // Spring IOC container start
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");

        // Constructor IOC (Payment)
        OrderService orderService =
                context.getBean("orderService", OrderService.class);
        orderService.placeOrder();

        // Setter IOC (Notification)
        NotificationService notificationService =
                context.getBean("notificationService", NotificationService.class);
        notificationService.notifyUser();
    }
}
//Spring provides two IOC containers:
//1) BeanFactory (deprecated, lazy loading)
//2) ApplicationContext (used in real-world projects)
