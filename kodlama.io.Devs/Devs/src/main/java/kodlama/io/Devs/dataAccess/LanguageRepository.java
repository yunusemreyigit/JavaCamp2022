package kodlama.io.Devs.dataAccess;

import kodlama.io.Devs.entities.Language;

import java.util.List;

public interface LanguageRepository {
    void postLanguage(Language language); //add
    void delete(Language language);
    void updateLanguage(Language language);
    void listLanguages();
     String getLanguage(int id);
     List<Language> getLanguages();
}
