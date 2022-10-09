package com.example.apinews.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
@Data
@Builder
@Table(name = "news_relevance")
@NoArgsConstructor
@AllArgsConstructor
public class News {
    @Id
    @GeneratedValue
    private Long id;

    private String header;

    private String link;

    private Long date;

    @JsonIgnore
    private double importance;
}
