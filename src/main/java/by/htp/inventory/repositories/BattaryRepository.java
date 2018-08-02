package by.htp.inventory.repositories;

import by.htp.inventory.entity.Battary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BattaryRepository extends JpaRepository<Battary, Long> {
}
