package kodlama.io.Devs.business.responses;

import kodlama.io.Devs.entities.Language;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllTechResponse {
     int id;
     String name;
     String languageName;
}
