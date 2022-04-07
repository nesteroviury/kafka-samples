package ru.dev.study.kafka.samples.spring;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Service;
import ru.dev.study.kafka.samples.dto.Payload;

import java.util.Map;

import static org.springframework.kafka.support.KafkaHeaders.TOPIC;
import static ru.dev.study.kafka.samples.spring.KafkaConfig.AUTO_CREATED_TOPIC;

@RequiredArgsConstructor
@Service
public class Provider {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void send() {

        kafkaTemplate.send(new GenericMessage<>(
                new Payload("message"),
                new MessageHeaders(Map.of(TOPIC, AUTO_CREATED_TOPIC)))
        );
    }
}
