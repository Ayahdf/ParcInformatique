package ma.xproce.pfaparcinformatiquebe.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;

@Entity
@Data
@AllArgsConstructor@NoArgsConstructor
public class role
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String nom;
    
}
