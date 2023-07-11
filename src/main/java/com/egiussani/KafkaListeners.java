package com.egiussani;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
        topics = "egiussani",
        groupId = "groupId",
            containerGroup = "messageFactory"
    )
    void listener(Message data) {
        System.out.println("Listener received: " + data.message() + " created at: " + data.createdAt());
    }

}
