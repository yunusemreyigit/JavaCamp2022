package kodlama.io.Devs.webApi;

import kodlama.io.Devs.business.LanguageService;
import kodlama.io.Devs.business.TechService;
import kodlama.io.Devs.business.requests.CreateLanguageRequest;
import kodlama.io.Devs.business.requests.CreateTechRequest;
import kodlama.io.Devs.business.responses.GetAllLanguageResponse;
import kodlama.io.Devs.business.responses.GetAllTechtoLanguageResponse;
import kodlama.io.Devs.entities.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;
import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

    private LanguageService languageService;

    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getlist")
    public List<GetAllLanguageResponse> getList() {
        return languageService.listLanguages();
    }

    @PostMapping("/add")
    public void add(CreateLanguageRequest createLanguageRequest)
    {
        languageService.addLanguage(createLanguageRequest);
    }

    @DeleteMapping("/delete")
    public  void delete(CreateLanguageRequest createLanguageRequest)
    {
        languageService.deleteLanguage(createLanguageRequest);
    }
}
