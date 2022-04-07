package ru.dev.study.kafka.samples.dto;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
public class Payload {
    private LocalDateTime createDateTime = LocalDateTime.now();
    @Getter
    private String data;

    public Payload(String data) {
        this.data = data;
    }
}
