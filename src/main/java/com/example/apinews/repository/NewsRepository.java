package com.example.apinews.repository;

import com.example.apinews.domain.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
    @Query(value = """
            SELECT * FROM news_relevance n
            WHERE n.topic IN (:topics)
            ORDER BY n.importance desc
            LIMIT 10
            """, nativeQuery = true)
    List<News> findTopNews(List<String> topics);
}
