package com.uetmydinh.briefly.service;

import com.uetmydinh.briefly.domain.Url;
import com.uetmydinh.briefly.repository.UrlRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UrlService {
    private final Logger log = LoggerFactory.getLogger(UrlService.class);

    private final UrlRepository urlRepository;

    public UrlService(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }


    public String makeID(int length) {
        StringBuilder id = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int charactersLength = characters.length();
        int counter = 0;
        while (counter < length) {
            int index = (int) (Math.random() * charactersLength);
            id.append(characters.charAt(index));
            counter++;
        }
        return id.toString();
    }

    public String findOrigin(String id) {
        log.info("id: {}", id);
        Url url = urlRepository.findById(id).orElse(null);
        log.info("url: {}", url);
        if (url == null) {
            return null;
        }
        return url.getURL();
    }

    public void create(String id, String url) {
        Url savedUrl = urlRepository.save(new Url(id, url));
        log.info("savedUrl: {}", savedUrl);
    }

    public String shortenUrl(String url) {
        String id = makeID(5);
        String originURL = findOrigin(id);
        log.info("New URL: {}", url);
        log.info("originURL: {}", originURL);
        if (originURL == null) {
            create(id, url);
            return id;
        }
        return "";
    }
}
