package com.example.timeconverter.controller;

import com.example.timeconverter.service.TimeConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

    @Autowired
    private TimeConversionService timeConversionService;

    @GetMapping("/convert")
    public String convertTime(@RequestParam String time) {
        return timeConversionService.convertTimeToWords(time);
    }
}
