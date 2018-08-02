package by.htp.inventory.dao;

import by.htp.inventory.entity.*;

import java.util.List;

public interface EquipmentDAO {



    //NetCard
    void addNewNetCard(NetCard newNetCard);
    NetCard findNetCard(long idNetCard);
    List<NetCard> findAllNetCards();
    void deleteNetCard(long idNetCard);
    void updateNetCard(NetCard netCard, long idNetCard);

    //Server
    void addNewServer(Server newServer);
    Server findServer(long idServer);
    List<Server> findAllServers();
    void deleteServer(long idServer);
    void updateServer(Server server, long idServer);

    //Telephone
    void addNewTelephone(Telephone newTelephone);
    Telephone findTelephone(long idTelephone);
    List<Telephone> findAllTelephons();
    void deleteTelephone(long idTelephone);
    void updateTelephone(Telephone telephone, long idTelephone);

    //Ups
    void addNewUps(Ups newUps);
    Ups findUps(long idUps);
    List<Ups> findAllUps();
    void deleteUps(long idUps);
    void updateUps(Ups ups, long idUps);

    //WifiCard
    void addNewWifiCard(WifiCard newWifiCard);
    WifiCard findWifiCard(long idWifiCard);
    List<WifiCard> findAllWifiCards();
    void deleteWifiCard(long idWifiCard);
    void updateWifiCard(WifiCard wifiCard, long idWifiCard);

}
