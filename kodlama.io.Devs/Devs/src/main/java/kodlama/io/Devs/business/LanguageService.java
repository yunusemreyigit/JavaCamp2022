package kodlama.io.Devs.business;

import kodlama.io.Devs.business.requests.CreateLanguageRequest;
import kodlama.io.Devs.business.requests.DeleteLanguageRequest;
import kodlama.io.Devs.business.responses.GetAllLanguageResponse;

import java.util.List;

public interface LanguageService {

    void add(CreateLanguageRequest createLanguageRequest);

    void delete(DeleteLanguageRequest deleteLanguageRequest);
    List<GetAllLanguageResponse> list();
}
