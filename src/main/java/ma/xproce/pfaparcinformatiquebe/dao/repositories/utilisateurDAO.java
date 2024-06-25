package ma.xproce.pfaparcinformatiquebe.dao.repositories;

import ma.xproce.pfaparcinformatiquebe.dao.entities.utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface utilisateurDAO extends JpaRepository<utilisateur,Integer> {
}
