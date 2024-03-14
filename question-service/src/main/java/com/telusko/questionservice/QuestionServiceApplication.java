package com.telusko.questionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
@RestController
public class QuestionServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(QuestionServiceApplication.class, args);
    }

    @GetMapping("/health")
    public ResponseEntity<?> test() {
        return ResponseEntity.ok(Map.of("200 ok", "QuestionServiceApplication is working"));
    }


}
