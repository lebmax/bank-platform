package ru.ugaforever.bank.chassis.dto.kafka;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OutboxEvent {
    private Long transferId;
    private String eventType;
    private String payload;
    private Instant timestamp;
}
