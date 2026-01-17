package in.prahlad.springcore.day3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.prahlad.springcore.day3.config.AppConfig;
import in.prahlad.springcore.day3.service.OrderService;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
    }
}