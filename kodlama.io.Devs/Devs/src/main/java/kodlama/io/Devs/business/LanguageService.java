package kodlama.io.Devs.business;

import kodlama.io.Devs.business.requests.CreateLanguageRequest;
import kodlama.io.Devs.business.responses.GetAllLanguageResponse;

import java.util.List;

public interface LanguageService {

    void addLanguage(CreateLanguageRequest createLanguageRequest);

    void deleteLanguage(CreateLanguageRequest createLanguageRequest);
    List<GetAllLanguageResponse> listLanguages();
}
