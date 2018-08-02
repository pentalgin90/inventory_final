package by.htp.inventory.dao.impl;

import by.htp.inventory.dao.UpsDAO;
import by.htp.inventory.entity.Ups;
import by.htp.inventory.repositories.UpsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UpsDAOImpl implements UpsDAO {
    @Autowired
    UpsRepository upsRepository;

    @Override
    public void addNewUps(Ups newUps) {
        upsRepository.saveAndFlush(newUps);
    }

    @Override
    public Ups findUps(long idUps) {
        return upsRepository.getOne(idUps);
    }

    @Override
    public List<Ups> findAllUps() {
        return upsRepository.findAll();
    }

    @Override
    public void deleteUps(long idUps) {
        upsRepository.deleteById(idUps);
    }

    @Override
    public void updateUps(Ups ups) {
        upsRepository.saveAndFlush(ups);
    }
}
