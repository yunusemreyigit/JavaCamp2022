package kodlama.io.Devs.dataAccess;

import kodlama.io.Devs.entities.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LanguageRepositoryInMemory implements LanguageRepository{

    private ArrayList<Language> languages;

    public LanguageRepositoryInMemory() {
        this.languages = new ArrayList<Language>();
        languages.add(new Language(1,"C#"));
        languages.add(new Language(2,"Java"));
        languages.add(new Language(3,"Python"));
    }

    public List<Language> getLanguages()
    {
        return this.languages;
    }
    @Override
    public void postLanguage(Language language) {
        languages.add(language);
    }

    @Override
    public void delete(Language language) {
        System.out.println(language.getName() +" is deleted.");
        languages.remove(language);
    }

    @Override
    public void updateLanguage(Language language) {
    //update language
    }

    @Override
    public void listLanguages() {
        for (Language language: languages) {
            System.out.println(language.getName());
        }
    }

    @Override
    public String getLanguage(int id) {
        for(Language language : languages)
        {
            if(language.getId() == id)
            {
                return language.getName();
            }
        }
        return "There is no language.";
    }
}
