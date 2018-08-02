package by.htp.inventory.dao;

import by.htp.inventory.entity.Commutator;

import java.util.List;

public interface CommutatorDAO {

    void addNewCommutator(Commutator newCommutator);
    Commutator findCommutator(long idCommutator);
    List<Commutator> findAllCommutators();
    void deleteCommutator(long idCommutator);
    void updateCommutator(Commutator commutator);
}
