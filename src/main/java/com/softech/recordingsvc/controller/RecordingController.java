package com.softech.recordingsvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicsvc/v1")
public class RecordingController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello!!!";
    }
}
