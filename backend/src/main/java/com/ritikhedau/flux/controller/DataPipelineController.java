package com.ritikhedau.flux.controller;
import com.ritikhedau.flux.service.PipelineExecutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pipelines")
public class DataPipelineController {
    @Autowired private PipelineExecutorService service;

    @PostMapping("/{id}/run")
    public ResponseEntity<Void> run(@PathVariable Long id, @RequestBody String data) {
        service.executeTransformation(id, data);
        return ResponseEntity.ok().build();
    }
}