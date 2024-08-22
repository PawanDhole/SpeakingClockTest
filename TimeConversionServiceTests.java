package com.example.timeconverter.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimeConversionServiceTests {

    private final TimeConversionService service = new TimeConversionService();

    @Test
    void testMidnight() {
        assertEquals("It's Midnight", service.convertTimeToWords("00:00"));
    }

    @Test
    void testMidday() {
        assertEquals("It's Midday", service.convertTimeToWords("12:00"));
    }

    @Test
    void testNormalTime() {
        assertEquals("It's 08 34", service.convertTimeToWords("08:34"));
    }

    @Test
    void testInvalidTime() {
        assertThrows(IllegalArgumentException.class, () -> service.convertTimeToWords("25:00"));
    }
}
