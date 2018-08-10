package by.htp.inventory.service.impl;

import by.htp.inventory.service.UpsService;
import by.htp.inventory.entity.Ups;
import by.htp.inventory.repositories.UpsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UpsServiceImpl implements UpsService {
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
