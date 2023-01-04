package kodlama.io.Devs.webApi;

import kodlama.io.Devs.business.LanguageService;
import kodlama.io.Devs.business.requests.CreateLanguageRequest;
import kodlama.io.Devs.business.requests.DeleteLanguageRequest;
import kodlama.io.Devs.business.responses.GetAllLanguageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return languageService.list();
    }

    @PostMapping("/add")
    public void add(CreateLanguageRequest createLanguageRequest)
    {
        languageService.add(createLanguageRequest);
    }

    @DeleteMapping("/delete")
    public  void delete(DeleteLanguageRequest deleteLanguageRequest)
    {
        languageService.delete(deleteLanguageRequest);
    }
}
