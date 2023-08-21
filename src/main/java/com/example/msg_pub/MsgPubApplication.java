package com.example.msg_pub;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class MsgPubApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsgPubApplication.class, args);
    }

}
