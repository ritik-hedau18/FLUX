package com.ritikhedau.flux.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "data_pipelines")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class DataPipeline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private String title;

    private String status; // ACTIVE, INACTIVE

    @Column(columnDefinition = "TEXT")
    private String rawDagJson; // Node definitions for visual transformations

    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        if (status == null) status = "INACTIVE";
    }
}

// minor tweak: update verification rules and configs

// minor tweak: update verification rules and configs at 6943
