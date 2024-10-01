package com.example.Translate.Service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TranslateServiceTest {

    @Test
    public void testTranslate() {
        TranslateService translateService = new TranslateService();
        assertEquals("hello", translateService.translate("hola"));
        assertEquals("goodbye", translateService.translate("adiós"));
        assertEquals("Translation not found", translateService.translate("buenos días"));
    }
}
