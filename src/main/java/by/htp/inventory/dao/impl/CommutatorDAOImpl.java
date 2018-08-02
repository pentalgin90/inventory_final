package by.htp.inventory.dao.impl;

import by.htp.inventory.dao.CommutatorDAO;
import by.htp.inventory.entity.Commutator;
import by.htp.inventory.repositories.CommutatorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CommutatorDAOImpl implements CommutatorDAO {
    @Autowired
    CommutatorRepository commutatorRepository;

    @Override
    public void addNewCommutator(Commutator newCommutator) {
        commutatorRepository.saveAndFlush(newCommutator);
    }

    @Override
    public Commutator findCommutator(long idCommutator) {
        return commutatorRepository.getOne(idCommutator);
    }

    @Override
    public List<Commutator> findAllCommutators() {
        return commutatorRepository.findAll();
    }

    @Override
    public void deleteCommutator(long idCommutator) {
        commutatorRepository.deleteById(idCommutator);
    }

    @Override
    public void updateCommutator(Commutator commutator) {
        commutatorRepository.saveAndFlush(commutator);
    }
}
