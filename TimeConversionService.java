package com.example.timeconverter.service;

import org.springframework.stereotype.Service;

@Service
public class TimeConversionService {

    public String convertTimeToWords(String time) {
        if (time == null || !time.matches("\\d{2}:\\d{2}")) {
            throw new IllegalArgumentException("Invalid time format. Expected HH:mm.");
        }

        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        if (hour == 0 && minute == 0) return "It's Midnight";
        if (hour == 12 && minute == 0) return "It's Midday";

        String hourInWords = convertHourToWords(hour);
        String minuteInWords = convertMinuteToWords(minute);

        return String.format("It's %s %s", hourInWords, minuteInWords);
    }

    private String convertHourToWords(int hour) {
        if (hour == 0) hour = 12;
        return new java.text.DecimalFormat("00").format(hour);
    }

    private String convertMinuteToWords(int minute) {
        return new java.text.DecimalFormat("00").format(minute);
    }
}
