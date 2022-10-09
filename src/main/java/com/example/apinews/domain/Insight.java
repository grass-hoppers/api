package com.example.apinews.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "insights")
public class Insight {
    @Id
    private long id;
    private String insight;
}
