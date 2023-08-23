package com.example.msg_pub.publisher;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PublisherService {
    @Value("${exchange.name}")
    private String exchange;
    @Value("${routing.key}")
    private String routingKey;

    private static final Logger LOGGER = LoggerFactory.getLogger(PublisherService.class);

    private RabbitTemplate rabbitTemplate;

    public PublisherService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void publishMessage(MessageForm form){
        LOGGER.info(String.format("Message sent -> %s", form));
        rabbitTemplate.convertAndSend(exchange, routingKey, form);

    }



    @Autowired
    public void setRabbitTemplate(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }
}
