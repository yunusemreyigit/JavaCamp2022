package kodlama.io.Devs.business.responses;

import kodlama.io.Devs.entities.Technology;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllLanguageResponse {
    int id;
    String name;
}
