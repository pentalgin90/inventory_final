package by.htp.inventory.repositories;

import by.htp.inventory.entity.WifiCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WifiCardRepository extends JpaRepository<WifiCard, Long> {
}
