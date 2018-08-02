package by.htp.inventory.dao;

import by.htp.inventory.entity.Ups;

import java.util.List;

public interface UpsDAO {
    void addNewUps(Ups newUps);
    Ups findUps(long idUps);
    List<Ups> findAllUps();
    void deleteUps(long idUps);
    void updateUps(Ups ups);

}
