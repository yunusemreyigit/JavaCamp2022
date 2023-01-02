package kodlama.io.Devs.business;

import kodlama.io.Devs.business.requests.CreateTechRequest;
import kodlama.io.Devs.business.responses.GetAllTechResponse;

import java.util.List;

public interface TechService {
    void add(CreateTechRequest createTechRequest);
    List<GetAllTechResponse> listTechs();
    void delete(CreateTechRequest createTechRequest);
}
