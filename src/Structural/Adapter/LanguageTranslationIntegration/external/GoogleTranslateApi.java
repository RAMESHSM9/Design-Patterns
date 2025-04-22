package Structural.Adapter.LanguageTranslationIntegration.external;

import java.util.List;

import static Structural.Adapter.LanguageTranslationIntegration.external.ApiUtils.logGoogleGetSupportedLanguages;
import static Structural.Adapter.LanguageTranslationIntegration.external.ApiUtils.logGoogleTranslate;

public class GoogleTranslateApi {

    public String convert(GoogleTranslationRequest request) {
        // Implementation for translating text using Google Translate API
        logGoogleTranslate();
        return "Translated text";
    }

    public List<String> getLanguages() {
        // Implementation for fetching supported languages from Google Translate
        logGoogleGetSupportedLanguages();
        return List.of("hindi", "marathi", "kannada");
    }
}
