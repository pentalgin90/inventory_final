package by.htp.inventory.dao;

import by.htp.inventory.entity.NetCard;

import java.util.List;

public interface NetCardDAO {

    void addNewNetCard(NetCard newNetCard);
    NetCard findNetCard(long idNetCard);
    List<NetCard> findAllNetCards();
    void deleteNetCard(long idNetCard);
    void updateNetCard(NetCard netCard);
}
