package ProgettoFullStack.FullStack.repositories;

import ProgettoFullStack.FullStack.entities.Dipendenti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DipendentiRepository extends JpaRepository<Dipendenti,Long> {
}
