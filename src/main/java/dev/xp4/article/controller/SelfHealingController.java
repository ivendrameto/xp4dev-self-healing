package dev.xp4.article.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/who-are-you")
public class SelfHealingController {

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public String xp4dev() {
        return "xp4.dev";
    }

}
