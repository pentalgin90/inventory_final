package by.htp.inventory.repositories;

import by.htp.inventory.entity.TerminalDocStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerminalDocStationRepository extends JpaRepository<TerminalDocStation, Long> {
}
