package ma.xproce.pfaparcinformatiquebe.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class machine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String nom;
    private String type;
    private String  marque;
    private String  modele;

}
