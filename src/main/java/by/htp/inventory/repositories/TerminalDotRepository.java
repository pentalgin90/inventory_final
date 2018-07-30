package by.htp.inventory.repositories;

import by.htp.inventory.entity.TerminalDot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerminalDotRepository extends JpaRepository<TerminalDot, Long> {
}
