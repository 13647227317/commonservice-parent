package com.wy.springcloud.commonservice.adminserverdemo;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class AdminserverDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminserverDemoApplication.class, args);
    }

}
