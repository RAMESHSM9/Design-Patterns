package Structural.Adapter.LanguageTranslationIntegration;

import Structural.Adapter.LanguageTranslationIntegration.external.MicrosoftTranslateApi;

import java.util.List;

public class MicrosoftTranslationAdapter implements TranslationProviderAdapter{

    private  final MicrosoftTranslateApi microsoftTranslateApi = new  MicrosoftTranslateApi();
    @Override
    public String translate(TranslationRequest translationRequest) {
       return microsoftTranslateApi.translate(translationRequest.getText(), translationRequest.getSourceLanguage(), translationRequest.getTargetLanguage());
    }

    @Override
    public List<String> getSupportedLanguages() {
        return microsoftTranslateApi.getSupportedLanguages();
    }
}
