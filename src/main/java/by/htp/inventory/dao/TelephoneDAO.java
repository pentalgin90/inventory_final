package by.htp.inventory.dao;

import by.htp.inventory.entity.Telephone;

import java.util.List;

public interface TelephoneDAO {
    //Telephone
    void addNewTelephone(Telephone newTelephone);
    Telephone findTelephone(long idTelephone);
    List<Telephone> findAllTelephons();
    void deleteTelephone(long idTelephone);
    void updateTelephone(Telephone telephone);
}
