package by.htp.inventory.dao;

import by.htp.inventory.entity.Antena;

import java.util.List;

public interface AntenaDAO {

    void addNewAntena(Antena newAntena);
    Antena findAntena(long idAntena);
    List<Antena> findAllAntens();
    void deleteAntena(long idAntena);
    void updateMonitor(Antena antena);

}
