package com.gaara.ybbweb.repository;

import com.gaara.ybbweb.entity.LoggerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoggerJpaRepository
    extends JpaRepository<LoggerEntity, Long> {
}
