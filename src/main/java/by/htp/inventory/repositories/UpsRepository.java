package by.htp.inventory.repositories;

import by.htp.inventory.entity.Ups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpsRepository extends JpaRepository<Ups, Long> {
}
