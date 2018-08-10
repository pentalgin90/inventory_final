package by.htp.inventory.service;

import by.htp.inventory.entity.Antena;

import java.util.List;

public interface AntenaService {

    void addNewAntena(Antena newAntena);
    Antena findAntena(long idAntena);
    List<Antena> findAllAntens();
    void deleteAntena(long idAntena);
    void updateMonitor(Antena antena);

}
