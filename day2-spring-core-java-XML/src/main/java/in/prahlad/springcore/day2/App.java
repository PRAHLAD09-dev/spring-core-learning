package in.prahlad.springcore.day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.prahlad.springcore.day2.service.OrderService;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
            new ClassPathXmlApplicationContext("spring.xml");

        OrderService orderService =
            context.getBean("orderService", OrderService.class);

        orderService.placeOrder();
    }
}