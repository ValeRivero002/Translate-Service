package com.example.Translate.Service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TranslateService {

    // Mapa para simular traducciones
    private Map<String, String> translations;

    public TranslateService() {
        translations = new HashMap<>();
        // Agregar traducciones simuladas
        translations.put("hola", "hello");
        translations.put("adiós", "goodbye");
        translations.put("gracias", "thank you");
    }

    // Método para traducir un texto
    public String translate(String text) {
        return translations.getOrDefault(text.toLowerCase(), "Translation not found");
    }
}
