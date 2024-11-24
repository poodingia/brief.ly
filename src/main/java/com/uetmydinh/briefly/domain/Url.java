package com.uetmydinh.briefly.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document("Url")
public class Url {
    @Id
    private String id;
    private String URL;
    private Instant createdAt;

    public Url() {
    }

    public Url(String id, String url, Instant createdAt) {
        super();
        this.id = id;
        this.URL = url;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
