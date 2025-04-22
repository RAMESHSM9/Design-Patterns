package Structural.Adapter.LanguageTranslationIntegration;

import Structural.Adapter.LanguageTranslationIntegration.external.GoogleTranslateApi;
import Structural.Adapter.LanguageTranslationIntegration.external.GoogleTranslationRequest;

import java.util.List;

public class GoogleTranslationAdapter implements TranslationProviderAdapter{
    private final GoogleTranslateApi googleTranslateApi = new GoogleTranslateApi();

    @Override
    public String translate(TranslationRequest translationRequest) {
        return googleTranslateApi.convert(new GoogleTranslationRequest(translationRequest.getText(), translationRequest.getSourceLanguage(), translationRequest.getTargetLanguage(), translationRequest.getConfidenceThreshold()));
    }

    @Override
    public List<String> getSupportedLanguages() {
        return googleTranslateApi.getLanguages();
    }
}
