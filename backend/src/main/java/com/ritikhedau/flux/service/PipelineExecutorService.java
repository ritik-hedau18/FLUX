package com.ritikhedau.flux.service;
import com.ritikhedau.flux.entity.DataPipeline;
import com.ritikhedau.flux.entity.DeadLetterLog;
import com.ritikhedau.flux.repository.DataPipelineRepository;
import com.ritikhedau.flux.repository.DeadLetterLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class PipelineExecutorService {
    @Autowired private DataPipelineRepository pipelineRepo;
    @Autowired private DeadLetterLogRepository dlqRepo;

    public void executeTransformation(Long pipelineId, String inputData) {
        DataPipeline p = pipelineRepo.findById(pipelineId).orElse(null);
        if (p == null) return;
        
        try {
            // Simulate transformation
            if (inputData == null || inputData.contains("ERROR")) {
                throw new IllegalArgumentException("Invalid data payload format detected.");
            }
            p.setLastRunStatus("SUCCESS");
            p.setLastRunTime(LocalDateTime.now());
            pipelineRepo.save(p);
        } catch (Exception e) {
            p.setLastRunStatus("FAILED");
            p.setLastRunTime(LocalDateTime.now());
            pipelineRepo.save(p);
            
            dlqRepo.save(DeadLetterLog.builder()
                .pipelineId(pipelineId)
                .payload(inputData)
                .errorMessage(e.getMessage())
                .loggedAt(LocalDateTime.now())
                .build());
        }
    }
}