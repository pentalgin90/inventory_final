package by.htp.inventory.repositories;

import by.htp.inventory.entity.Antena;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AntenaRepository extends JpaRepository<Antena, Long> {
}
