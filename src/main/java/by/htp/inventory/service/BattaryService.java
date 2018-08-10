package by.htp.inventory.service;

import by.htp.inventory.entity.Battary;

import java.util.List;

public interface BattaryService {

    void addNewBattary(by.htp.inventory.entity.Battary newBattary);
    by.htp.inventory.entity.Battary findBattary(long idBattary);
    List<by.htp.inventory.entity.Battary> findAllBattarys();
    void deleteBattary(long idBattary);
    void updateBattary(Battary battary);
}
