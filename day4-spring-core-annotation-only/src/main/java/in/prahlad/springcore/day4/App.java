package in.prahlad.springcore.day4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import in.prahlad.springcore.day4.service.OrderService;

@ComponentScan("in.prahlad.springcore.day4")
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx =
            new AnnotationConfigApplicationContext(App.class);
        ctx.getBean(OrderService.class).placeOrder();
    }
}