package com.example.messgesupport;

import com.example.messgesupport.util.MessageSourceUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

        MessageSourceUtils messageSourceUtils = context.getBean(MessageSourceUtils.class);
        String message = messageSourceUtils.getMessage("user.notfound", null);
        String message2 = messageSourceUtils.getMessage("user.notfound", null);
        System.out.println(message);
        System.out.println(message2);
    }
}
