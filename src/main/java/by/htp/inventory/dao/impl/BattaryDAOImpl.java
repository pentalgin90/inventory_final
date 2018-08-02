package by.htp.inventory.dao.impl;

import by.htp.inventory.dao.BattaryDAO;
import by.htp.inventory.entity.Battary;
import by.htp.inventory.repositories.BattaryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BattaryDAOImpl implements BattaryDAO {
    @Autowired
    BattaryRepository battaryRepository;

    @Override
    public void addNewBattary(Battary newBattary) {
        battaryRepository.saveAndFlush(newBattary);
    }

    @Override
    public Battary findBattary(long idBattary) {
        return battaryRepository.getOne(idBattary);
    }

    @Override
    public List<Battary> findAllBattarys() {
        return battaryRepository.findAll();
    }

    @Override
    public void deleteBattary(long idBattary) {
        battaryRepository.deleteById(idBattary);
    }

    @Override
    public void updateBattary(Battary battary) {
        battaryRepository.saveAndFlush(battary);
    }
}
