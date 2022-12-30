package kodlama.io.Devs.business;

import kodlama.io.Devs.entities.Language;

import java.util.List;

public interface LanguageService {

    void postLanguage(Language language);

    void deleteLanguage(Language language);
    void updateLanguage(Language language);
    void getLanguages();
    List<Language> listLanguages();
}
