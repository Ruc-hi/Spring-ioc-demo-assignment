package org.example;

import org.example.model.Customer;
import org.example.model.Order;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            Customer myCustomer = context.getBean("customer",Customer.class);
            System.out.println(myCustomer);
            Order order = context.getBean("order", Order.class);
            System.out.println(order);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}