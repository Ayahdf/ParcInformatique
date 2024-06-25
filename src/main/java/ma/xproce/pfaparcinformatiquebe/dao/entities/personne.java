package ma.xproce.pfaparcinformatiquebe.dao.entities;

import jakarta.persistence.*;
import jdk.jfr.Unsigned;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class personne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String nom;
    private String prenom;
    private String email;
    private String password;


}
