package com.example.apinews.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "trends")
public class Trend {
    @Id
    private long id;
    private String trend;

    @JsonIgnore
    @Column(name = "freaquency")
    private double frequency;
}
