package com.mastercard.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/api/v1/hello")
    public Map<String, String> hello() {
        return Map.of(
            "service", "test-springboot-3",
            "status", "UP",
            "cloud", "aws"
        );
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }
}
