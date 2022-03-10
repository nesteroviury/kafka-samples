package ru.dev.study.kafka.samples.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Payload {
    private LocalDateTime createDateTime;
    private String data;
}
