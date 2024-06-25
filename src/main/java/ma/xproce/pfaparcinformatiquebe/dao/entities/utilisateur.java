package ma.xproce.pfaparcinformatiquebe.dao.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.parameters.P;

@Entity
@Data
@AllArgsConstructor@NoArgsConstructor
public class utilisateur extends personne{
    private String poste;
}
