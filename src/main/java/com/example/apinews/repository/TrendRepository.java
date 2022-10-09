package com.example.apinews.repository;

import com.example.apinews.domain.Trend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TrendRepository extends JpaRepository<Trend, Long> {
    @Query(value = """
            SELECT * FROM trends t
            ORDER BY t.freaquency desc
            LIMIT 20
            """, nativeQuery = true)
    List<Trend> findTopTrends();
}
