package com.uetmydinh.briefly.repository;

import com.uetmydinh.briefly.domain.Url;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlRepository extends MongoRepository<Url, String> {

}
