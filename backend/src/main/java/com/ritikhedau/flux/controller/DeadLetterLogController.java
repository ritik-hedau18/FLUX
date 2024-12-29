package com.ritikhedau.flux.controller;

import com.ritikhedau.flux.entity.DeadLetterLog;
import com.ritikhedau.flux.repository.DeadLetterLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/dlq-logs")
public class DeadLetterLogController {
    @Autowired
    private DeadLetterLogRepository repository;

    @GetMapping
    public ResponseEntity<List<DeadLetterLog>> list() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public ResponseEntity<DeadLetterLog> create(@RequestBody DeadLetterLog log) {
        return ResponseEntity.ok(repository.save(log));
    }
}