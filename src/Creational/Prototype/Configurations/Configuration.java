package Prototype.Configurations;

public class Configuration implements ClonableObject<Configuration> {

    private String themeColor;
    private Boolean autoSave;
    private String language;
    private Boolean darkMode;
    private Integer fontSize;
    private String fontFamily;
    private ConfigurationType type;

    public Configuration(String themeColor, Boolean autoSave, String language, Boolean darkMode, Integer fontSize, String fontFamily, ConfigurationType type) {
        this.themeColor = themeColor;
        this.autoSave = autoSave;
        this.language = language;
        this.darkMode = darkMode;
        this.fontSize = fontSize;
        this.fontFamily = fontFamily;
        this.type = type;
    }

    public String getThemeColor() {
        return themeColor;
    }

    public Boolean getAutoSave() {
        return autoSave;
    }

    public String getLanguage() {
        return language;
    }

    public Boolean getDarkMode() {
        return darkMode;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public ConfigurationType getType() {
        return type;
    }

    public Configuration(Configuration configuration)
    {
        this.themeColor = configuration.getThemeColor();
        this.autoSave = configuration.getAutoSave();
        this.language = configuration.getLanguage();
        this.darkMode = configuration.getDarkMode();
        this.fontSize = configuration.getFontSize();
        this.fontFamily = configuration.getFontFamily();
        this.type = configuration.getType();
    }

    @Override
    public Configuration cloneObject() {
        return new Configuration(this);
    }
}
