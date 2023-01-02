package kodlama.io.Devs.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "technology")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Technology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;

//    @JoinColumn(name = "id")
//    private Language language;
}
