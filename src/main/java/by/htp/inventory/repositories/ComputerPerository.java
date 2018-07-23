package by.htp.inventory.repositories;

import by.htp.inventory.entity.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerPerository extends JpaRepository<Computer, Long> {
}
