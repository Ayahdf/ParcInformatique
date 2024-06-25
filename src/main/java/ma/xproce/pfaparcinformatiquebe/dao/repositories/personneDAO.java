package ma.xproce.pfaparcinformatiquebe.dao.repositories;

import ma.xproce.pfaparcinformatiquebe.dao.entities.personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface personneDAO extends JpaRepository<personne,Integer> {
}
