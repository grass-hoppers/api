package com.example.apinews.controller;

import com.example.apinews.enity.News;
import com.example.apinews.enity.NewsRepository;
import com.example.apinews.enity.Role;
import com.example.apinews.service.NewsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@AllArgsConstructor
public class NewsController {
    private final NewsService newsService;
    @GetMapping("/news/{role}")
    public ResponseEntity<?> getNews(@PathVariable Role role) {
        var news = newsService.findTopNews(role);
        return new ResponseEntity<>(news, HttpStatus.OK);
    }

    @GetMapping("/news/search/{role}")
    public ResponseEntity<?> findNews(@PathVariable Role role, @RequestParam String text) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
