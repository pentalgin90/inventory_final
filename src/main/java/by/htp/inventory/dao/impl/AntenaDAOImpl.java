package by.htp.inventory.dao.impl;

import by.htp.inventory.dao.AntenaDAO;
import by.htp.inventory.entity.Antena;
import by.htp.inventory.repositories.AntenaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AntenaDAOImpl implements AntenaDAO {
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
