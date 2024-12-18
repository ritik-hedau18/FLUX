package com.ritikhedau.flux.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "dead_letter_logs")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class DeadLetterLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long executionId;

    private String stepName; // Ingestion, Filter, Map, etc.

    @Column(columnDefinition = "TEXT")
    private String rawPayloadText; // Unparsable raw record payload

    private String errorMessage; // Specific parse anomaly reason

    private Boolean replayed; // Whether re-submitted after mitigation

    private LocalDateTime loggedAt;

    @PrePersist
    protected void onCreate() {
        loggedAt = LocalDateTime.now();
        if (replayed == null) replayed = false;
    }
// minor tweak: performance check updates
// minor tweak: performance check updates
}
