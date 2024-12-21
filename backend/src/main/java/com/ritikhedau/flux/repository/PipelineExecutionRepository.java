package com.ritikhedau.flux.repository;

import com.ritikhedau.flux.entity.PipelineExecution;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PipelineExecutionRepository extends JpaRepository<PipelineExecution, Long> {
    List<PipelineExecution> findByPipelineId(Long pipelineId);
}

// minor tweak: update verification rules and configs
