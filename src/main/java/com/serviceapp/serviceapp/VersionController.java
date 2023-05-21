package com.serviceapp.serviceapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    private static final String VERSION = "1.0.0";

    @GetMapping("/version")
    public String getVersion() {
        return "Application version: " + VERSION;
    }
}