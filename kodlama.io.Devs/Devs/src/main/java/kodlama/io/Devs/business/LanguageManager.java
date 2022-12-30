package kodlama.io.Devs.business;

import kodlama.io.Devs.dataAccess.LanguageRepository;
import kodlama.io.Devs.entities.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService{
    LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository)
    {
        this.languageRepository = languageRepository;
    }

    @Override
    public void postLanguage(Language language) {    //add
        for (Language lang: languageRepository.getLanguages()) {
            if (lang.getId() == language.getId() || lang.getName().equals(language.getName()) || language.getName().isEmpty()) {
                System.out.println("Language can not be added.");
            }
            else{
            languageRepository.postLanguage(language);
            }
        }
    }

    @Override
    public void deleteLanguage(Language language) {
        languageRepository.delete(language);
    }

    @Override
    public void updateLanguage(Language language) {
        //update işlemleri
    }

    @Override
    public void getLanguages() {
        languageRepository.listLanguages();
    }

    public List<Language> listLanguages()
    {
        return languageRepository.getLanguages();
    }
}
