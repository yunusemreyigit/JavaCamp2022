package kodlama.io.Devs.webApi;

import kodlama.io.Devs.business.TechService;
import kodlama.io.Devs.business.requests.CreateTechRequest;
import kodlama.io.Devs.business.responses.GetAllTechResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tech")
public class TechController {

    private TechService techService;
    public TechController(TechService techService) {
        this.techService = techService;
    }

    @GetMapping("/getlist")
    public List<GetAllTechResponse> getAll()
    {
        return techService.listTechs();
    }

    @PostMapping("/add")
    public void add(CreateTechRequest createTechRequest)
    {
        techService.add(createTechRequest);
    }
    @DeleteMapping("/delete")
    public void  delete(CreateTechRequest createTechRequest)
    {
        techService.delete(createTechRequest);
    }
}
