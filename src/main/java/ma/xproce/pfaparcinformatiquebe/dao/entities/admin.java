package ma.xproce.pfaparcinformatiquebe.dao.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor@NoArgsConstructor
@Data
public class admin extends personne{
    private String responsabilite;

}
