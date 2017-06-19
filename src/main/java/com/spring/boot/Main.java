package com.spring.boot;

import com.spring.boot.hello.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Aditya Gupta
 */
@SpringBootApplication
public class Main {
    public static  void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Main.class,args);
        HelloWorld f = ctx.getBean(HelloWorld.class);
        f.print();
    }

}
