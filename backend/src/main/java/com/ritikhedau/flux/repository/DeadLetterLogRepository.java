package com.ritikhedau.flux.repository;

import com.ritikhedau.flux.entity.DeadLetterLog;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DeadLetterLogRepository extends JpaRepository<DeadLetterLog, Long> {
    List<DeadLetterLog> findByExecutionId(Long executionId);
}
