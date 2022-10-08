package com.example.apinews.enity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
    @Query(value = """
            SELECT DISTINCT n.*,
                            EXTRACT(MINUTES FROM (n.public_date - NOW())) * :dateCoef + n.words_weight * :wordsCoef as priority
            FROM news_processed n
                     join news_roles nr on nr.news_id = n.id and nr.roles = :role
            ORDER BY priority desc
            LIMIT 10
            """, nativeQuery = true)
    List<News> findTopNews(String role, long dateCoef, long wordsCoef);
}
