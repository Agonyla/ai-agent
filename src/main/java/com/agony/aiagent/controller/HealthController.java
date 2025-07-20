package com.agony.aiagent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Agony
 * @create: 2025/7/20 14:33
 * @describe:
 */
@RestController
@RequestMapping("/health")
public class HealthController {
    
    @GetMapping
    public String healthCheck() {
        return "ok";
    }
}
