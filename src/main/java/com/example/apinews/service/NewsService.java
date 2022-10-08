package com.example.apinews.service;

import com.example.apinews.enity.News;
import com.example.apinews.enity.NewsRepository;
import com.example.apinews.enity.Role;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    @Autowired
    private NewsRepository newsRepository;
    @Value("${news.data.coef}")
    private Long dateCoef;
    @Value("${news.words.coef}")
    private Long wordsCoef;

    public List<News> findTopNews(Role role) {
        return newsRepository.findTopNews(role.toString(), dateCoef, wordsCoef);
    }
}
