package ma.xproce.pfaparcinformatiquebe.dao.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor@NoArgsConstructor
public class technicien extends personne{
    private String specialite;
}
