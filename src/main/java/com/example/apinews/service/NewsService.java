package com.example.apinews.service;

import com.example.apinews.domain.News;
import com.example.apinews.repository.NewsRepository;
import com.example.apinews.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    @Autowired
    private NewsRepository newsRepository;

    public List<News> findTopNews(Role role) {
        if(role == Role.ACCOUNTANT) {
            return  newsRepository.findTopNews(List.of("финансы"));
        } else {
            return newsRepository.findTopNews(List.of("Бизнес"));
        }
    }
}
