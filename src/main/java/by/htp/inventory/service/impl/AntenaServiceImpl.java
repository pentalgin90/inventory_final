package by.htp.inventory.service.impl;

import by.htp.inventory.service.AntenaService;
import by.htp.inventory.entity.Antena;
import by.htp.inventory.repositories.AntenaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AntenaServiceImpl implements AntenaService {
    @Autowired
    AntenaRepository antenaRepository;

    @Override
    public void addNewAntena(Antena newAntena) {
        antenaRepository.saveAndFlush(newAntena);
    }

    @Override
    public Antena findAntena(long idAntena) {
        return antenaRepository.getOne(idAntena);
    }

    @Override
    public List<Antena> findAllAntens() {
        return antenaRepository.findAll();
    }

    @Override
    public void deleteAntena(long idAntena) {
        antenaRepository.deleteById(idAntena);
    }

    @Override
    public void updateMonitor(Antena antena) {
        antenaRepository.saveAndFlush(antena);
    }
}
