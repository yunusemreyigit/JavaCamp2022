package kodlama.io.Devs.dataAccess;

import kodlama.io.Devs.entities.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechLanguageRepository extends JpaRepository<Technology,Integer> {
}
