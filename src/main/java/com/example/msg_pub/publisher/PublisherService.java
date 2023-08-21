package com.example.msg_pub.publisher;



import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PublisherService {
    private Queue queue;
    private RabbitTemplate rabbitTemplate;

    public void publishMessage(MessageForm form){
        rabbitTemplate.convertAndSend(queue.getName(), form);
    }

    @Autowired
    public void setQueue(Queue queue) {
        this.queue = queue;
    }

    @Autowired
    public void setRabbitTemplate(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }
}
