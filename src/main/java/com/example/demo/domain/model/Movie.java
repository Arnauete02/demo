package com.example.demo.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    public UUID movieid;

    public String title;
    public String imageurl;
}
