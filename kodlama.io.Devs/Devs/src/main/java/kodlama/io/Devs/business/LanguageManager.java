package kodlama.io.Devs.business;

import jakarta.validation.constraints.Null;
import kodlama.io.Devs.business.requests.CreateLanguageRequest;
import kodlama.io.Devs.business.requests.DeleteLanguageRequest;
import kodlama.io.Devs.business.responses.GetAllLanguageResponse;
import kodlama.io.Devs.business.responses.GetAllTechtoLanguageResponse;
import kodlama.io.Devs.dataAccess.LanguageRepository;
import kodlama.io.Devs.entities.Language;
import kodlama.io.Devs.entities.Technology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public void add(CreateLanguageRequest createLanguageRequest) {
        Language language = new Language();
        language.setName(createLanguageRequest.getName());

        languageRepository.save(language);
    }

    @Override
    public void delete(DeleteLanguageRequest deleteLanguageRequest) {
        List<Language> languages = languageRepository.findAll();
        for (Language item : languages)
        {
            if (item.getName().equalsIgnoreCase(deleteLanguageRequest.getName()))
            {
               languageRepository.delete(item);
            }
        }
    }

    public List<GetAllLanguageResponse> list()
    {
        List<Language> languages = languageRepository.findAll();
        List<GetAllLanguageResponse> getAllLanguageResponses = new ArrayList<>();

        for (Language language: languages) {
            GetAllLanguageResponse response = new GetAllLanguageResponse();
            response.setId(language.getId());
            response.setName(language.getName());
            getAllLanguageResponses.add(response);
        }

        return getAllLanguageResponses;
    }

}
