package com.example.apinews.controller;

import com.example.apinews.domain.Role;
import com.example.apinews.repository.InsightRepository;
import com.example.apinews.repository.TrendRepository;
import com.example.apinews.service.NewsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
@AllArgsConstructor
public class NewsController {
    private final NewsService newsService;
    private final InsightRepository insightRepository;
    private final TrendRepository trendRepository;
    @GetMapping("/news/{role}")
    public ResponseEntity<?> getNews(@PathVariable Role role) {
        var news = newsService.findTopNews(role);
        return new ResponseEntity<>(news, HttpStatus.OK);
    }

    @GetMapping("/trends")
    public ResponseEntity<?> getTrends() {
        return new ResponseEntity<>(trendRepository.findTopTrends(), HttpStatus.OK);
    }
    @GetMapping("/insights")
    public ResponseEntity<?> getInsights() {
        return new ResponseEntity<>(insightRepository.findAll(), HttpStatus.OK);

    }

}
