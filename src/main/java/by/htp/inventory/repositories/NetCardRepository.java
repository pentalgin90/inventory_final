package by.htp.inventory.repositories;

import by.htp.inventory.entity.NetCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetCardRepository extends JpaRepository<NetCard, Long> {
}
