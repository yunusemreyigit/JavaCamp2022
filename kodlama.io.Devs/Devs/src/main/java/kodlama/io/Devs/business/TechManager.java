package kodlama.io.Devs.business;

import kodlama.io.Devs.business.requests.CreateTechRequest;
import kodlama.io.Devs.business.responses.GetAllLanguageResponse;
import kodlama.io.Devs.business.responses.GetAllTechResponse;
import kodlama.io.Devs.dataAccess.TechLanguageRepository;
import kodlama.io.Devs.entities.Language;
import kodlama.io.Devs.entities.Technology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TechManager implements TechService{


    //LanguageRepository languageRepository;
    TechLanguageRepository techLanguageRepository;

    @Autowired
    public TechManager(TechLanguageRepository techLanguageRepository) {
        this.techLanguageRepository = techLanguageRepository;
    }
    @Override
    public void add(CreateTechRequest createTechRequest) {
        Technology technology = new Technology();
        technology.setName(createTechRequest.getName());
        techLanguageRepository.save(technology);
    }

    @Override
    public List<GetAllTechResponse> listTechs() {
        List<Technology> technologies = techLanguageRepository.findAll();
        List<GetAllTechResponse> getAllTechResponses = new ArrayList<GetAllTechResponse>();

        for (Technology technology: technologies)
        {
            GetAllTechResponse response = new GetAllTechResponse();
            response.setId(technology.getId());
            response.setName(technology.getName());

            getAllTechResponses.add(response);
        }

        return getAllTechResponses;
    }

    @Override
    public void delete(CreateTechRequest createTechRequest) {
        for(Technology technology: techLanguageRepository.findAll())
        {
            if(technology.getName().equals(createTechRequest.getName()))
            {
                techLanguageRepository.delete(technology);
            }
        }
    }
}
