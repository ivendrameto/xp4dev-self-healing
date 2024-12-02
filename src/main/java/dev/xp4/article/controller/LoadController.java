package dev.xp4.article.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1/load")
public class LoadController {

    @GetMapping("/")
    public String generateLoad() {
        log.info("Generating load...");
        // Simular carga de CPU e memória
        int[] array = new int[1000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
        }
        return "Load generated!";
    }

}
