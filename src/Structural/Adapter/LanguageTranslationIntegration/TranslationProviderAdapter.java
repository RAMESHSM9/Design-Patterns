package Structural.Adapter.LanguageTranslationIntegration;

import java.util.List;

public interface TranslationProviderAdapter {
    public String translate(TranslationRequest translationRequest);
    public List<String> getSupportedLanguages();
}
