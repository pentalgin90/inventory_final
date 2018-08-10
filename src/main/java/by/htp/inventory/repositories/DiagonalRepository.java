package by.htp.inventory.repositories;

import by.htp.inventory.entity.Diagonal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagonalRepository extends JpaRepository<Diagonal, Long> {
}
