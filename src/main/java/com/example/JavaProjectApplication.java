package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.example.base.dao")
@ComponentScan(basePackages = {"com.example.base.controller", "com.example.base.service"})
public class JavaProjectApplication {
    
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(JavaProjectApplication.class, args);
        
        System.out.println("该服务的名称是:{} " + context.getEnvironment().getProperty("spring.application.name"));
        System.out.println("该服务的IP地址是:{} " + context.getEnvironment().getProperty("server.address"));
        System.out.println("该服务的启动端口是:{} " + context.getEnvironment().getProperty("server.port"));
        
        String ip = context.getEnvironment().getProperty("server.address");
        String port = context.getEnvironment().getProperty("server.port");
        System.out.println("http://" + ip + ":" + port);
    }
    
}
