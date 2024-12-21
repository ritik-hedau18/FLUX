package com.ritikhedau.flux.repository;

import com.ritikhedau.flux.entity.DataPipeline;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DataPipelineRepository extends JpaRepository<DataPipeline, Long> {
    List<DataPipeline> findByUserId(Long userId);
}
