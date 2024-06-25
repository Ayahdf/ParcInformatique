package ma.xproce.pfaparcinformatiquebe.dao.repositories;

import ma.xproce.pfaparcinformatiquebe.dao.entities.ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ticketDAO extends JpaRepository<ticket,Integer> {
}
