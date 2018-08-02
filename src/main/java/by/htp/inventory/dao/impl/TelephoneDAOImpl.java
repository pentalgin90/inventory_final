package by.htp.inventory.dao.impl;

import by.htp.inventory.dao.TelephoneDAO;
import by.htp.inventory.entity.Telephone;
import by.htp.inventory.repositories.TelephoneRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class TelephoneDAOImpl implements TelephoneDAO {
    @Autowired
    TelephoneRepository telephoneRepository;
    @Override
    public void addNewTelephone(Telephone newTelephone) {
        telephoneRepository.saveAndFlush(newTelephone);
    }

    @Override
    public Telephone findTelephone(long idTelephone) {
        return telephoneRepository.getOne(idTelephone);
    }

    @Override
    public List<Telephone> findAllTelephons() {
        return telephoneRepository.findAll();
    }

    @Override
    public void deleteTelephone(long idTelephone) {
        telephoneRepository.deleteById(idTelephone);
    }

    @Override
    public void updateTelephone(Telephone telephone) {
        telephoneRepository.saveAndFlush(telephone);
    }
}
