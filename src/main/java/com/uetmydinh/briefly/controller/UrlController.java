package com.uetmydinh.briefly.controller;

import com.uetmydinh.briefly.dto.CreateUrlDTO;
import com.uetmydinh.briefly.service.UrlService;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("/api/url")
public class UrlController {
    private final UrlService urlService;

    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    @PostMapping("/create")
    public String shortenUrl(@RequestBody CreateUrlDTO url) {
        return urlService.shortenUrl(url.url());
    }

    @GetMapping("/short/{id}")
    public RedirectView get(@PathVariable String id) {
        RedirectView redirectView = new RedirectView(urlService.findOrigin(id));
        redirectView.setStatusCode(HttpStatusCode.valueOf(301));
        return redirectView;
    }


}
