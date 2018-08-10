package by.htp.inventory.repositories;

import by.htp.inventory.entity.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


public interface MonitorRepository extends JpaRepository<Monitor, Long>{
    /*@Query("select b from Bank b where b.name = :inventoryID")
    Monitor findByInventoryID(@Param("inventoryID") String inventoryID);*/
}
