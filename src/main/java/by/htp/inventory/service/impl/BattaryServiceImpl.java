package by.htp.inventory.service.impl;

import by.htp.inventory.service.BattaryService;
import by.htp.inventory.entity.Battary;
import by.htp.inventory.repositories.BattaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BattaryServiceImpl implements BattaryService {
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
