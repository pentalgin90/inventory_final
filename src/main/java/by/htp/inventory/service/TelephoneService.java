package by.htp.inventory.service;

import by.htp.inventory.entity.Telephone;

import java.util.List;

public interface TelephoneService {
    //Telephone
    void addNewTelephone(Telephone newTelephone);
    Telephone findTelephone(long idTelephone);
    List<Telephone> findAllTelephons();
    void deleteTelephone(long idTelephone);
    void updateTelephone(Telephone telephone);
}
