package com.ritikhedau.flux.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pipeline_executions")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class PipelineExecution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long pipelineId;

    private String status; // RUNNING, SUCCESS, FAILED

    private Integer recordsProcessed;

    private Integer recordsFailed;

    private LocalDateTime startedAt;

    private LocalDateTime endedAt;

    @PrePersist
    protected void onCreate() {
        startedAt = LocalDateTime.now();
        if (recordsProcessed == null) recordsProcessed = 0;
        if (recordsFailed == null) recordsFailed = 0;
    }
// minor tweak: performance check updates
}
