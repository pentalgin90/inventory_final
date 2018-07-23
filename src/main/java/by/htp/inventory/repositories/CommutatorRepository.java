package by.htp.inventory.repositories;

import by.htp.inventory.entity.Commutator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CommutatorRepository extends JpaRepository<Commutator, Long> {
}
