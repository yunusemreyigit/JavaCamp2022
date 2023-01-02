package kodlama.io.Devs.business;

import kodlama.io.Devs.business.requests.CreateLanguageRequest;
import kodlama.io.Devs.business.responses.GetAllLanguageResponse;
import kodlama.io.Devs.dataAccess.LanguageRepository;
import kodlama.io.Devs.entities.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LanguageManager implements LanguageService{
    LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository)
    {
        this.languageRepository = languageRepository;
    }

    @Override
    public void addLanguage(CreateLanguageRequest createLanguageRequest) {
        Language language = new Language();
        language.setName(createLanguageRequest.getName());

        languageRepository.save(language);
    }

    @Override
    public void deleteLanguage(CreateLanguageRequest createLanguageRequest) {
        for (Language item : languageRepository.findAll())
        {
            if (item.getName().equals(createLanguageRequest.getName()))
            {
                languageRepository.delete(item);
            }
        }
    }

    public List<GetAllLanguageResponse> listLanguages()
    {
        List<Language> languages = languageRepository.findAll();
        List<GetAllLanguageResponse> getAllLanguageResponses = new ArrayList<GetAllLanguageResponse>();

        for (Language language: languages) {
            GetAllLanguageResponse response = new GetAllLanguageResponse();
            response.setId(language.getId());
            response.setName(language.getName());

            getAllLanguageResponses.add(response);
        }

        return getAllLanguageResponses;
    }
}
