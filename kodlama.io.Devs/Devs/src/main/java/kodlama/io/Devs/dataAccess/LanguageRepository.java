package kodlama.io.Devs.dataAccess;

import kodlama.io.Devs.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LanguageRepository extends JpaRepository<Language,Integer>{ }
