package by.htp.inventory.repositories;

import by.htp.inventory.entity.Terminal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerminalRepositpry extends JpaRepository<Terminal, Long> {
}
