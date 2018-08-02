package by.htp.inventory.dao;

import by.htp.inventory.entity.Battary;

import java.util.List;

public interface BattaryDAO {

    void addNewBattary(by.htp.inventory.entity.Battary newBattary);
    by.htp.inventory.entity.Battary findBattary(long idBattary);
    List<by.htp.inventory.entity.Battary> findAllBattarys();
    void deleteBattary(long idBattary);
    void updateBattary(Battary battary);
}
