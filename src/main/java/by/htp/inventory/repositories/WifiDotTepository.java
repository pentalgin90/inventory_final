package by.htp.inventory.repositories;

import by.htp.inventory.entity.WiFiDot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WifiDotTepository extends JpaRepository<WiFiDot, Long> {
}
