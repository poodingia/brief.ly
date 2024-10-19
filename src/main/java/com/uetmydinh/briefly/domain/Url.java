package com.uetmydinh.briefly.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Url")
public class Url {
    @Id
    private String id;
    private String URL;

    public Url() {
    }

    public Url(String id, String url) {
        super();
        this.id = id;
        this.URL = url;
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
}
