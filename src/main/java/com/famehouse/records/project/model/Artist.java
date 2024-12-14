package com.famehouse.records.project.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String bio;

    @Column(length = 512)
    private String imageUrl;
}
