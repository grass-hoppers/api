package com.example.apinews.repository;

import com.example.apinews.domain.Insight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsightRepository extends JpaRepository<Insight, Long> {
}
