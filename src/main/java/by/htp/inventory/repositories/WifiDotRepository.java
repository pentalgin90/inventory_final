package by.htp.inventory.repositories;

import by.htp.inventory.entity.WifiDot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WifiDotRepository extends JpaRepository<WifiDot, Long> {
}
