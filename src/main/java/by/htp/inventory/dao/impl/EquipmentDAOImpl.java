package by.htp.inventory.dao.impl;

import by.htp.inventory.dao.EquipmentDAO;
import by.htp.inventory.entity.*;
import by.htp.inventory.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EquipmentDAOImpl implements EquipmentDAO {


    @Autowired
    NetCardRepository netCardRepository;
    @Autowired
    PrinterRepository printerRepository;
    @Autowired
    ServerRepository serverRepository;
    @Autowired
    TelephoneRepository telephoneRepository;

    @Autowired
    UpsRepository upsRepository;
    @Autowired





    @Override
    public void addNewMonitor(Antena newAntena) {

    }

    @Override
    public Antena findAntena(long idAntena) {
        return null;
    }

    @Override
    public List<Antena> findAllAntens() {
        return null;
    }

    @Override
    public void deleteAntena(long idAntena) {

    }

    @Override
    public void updateMonitor(Antena antena, long idAntena) {

    }

    @Override
    public void addNewBattary(Battary newBattary) {

    }

    @Override
    public Battary findBattary(long idBattary) {
        return null;
    }

    @Override
    public List<Battary> findAllBattarys() {
        return null;
    }

    @Override
    public void deleteBattary(long idBattary) {

    }

    @Override
    public void updateBattary(Battary battary, long idBattary) {

    }

    @Override
    public void addNewNetCard(NetCard newNetCard) {

    }

    @Override
    public NetCard findNetCard(long idNetCard) {
        return null;
    }

    @Override
    public List<NetCard> findAllNetCards() {
        return null;
    }

    @Override
    public void deleteNetCard(long idNetCard) {

    }

    @Override
    public void updateNetCard(NetCard netCard, long idNetCard) {

    }

    @Override
    public void addNewServer(Server newServer) {

    }

    @Override
    public Server findServer(long idServer) {
        return null;
    }

    @Override
    public List<Server> findAllServers() {
        return null;
    }

    @Override
    public void deleteServer(long idServer) {

    }

    @Override
    public void updateServer(Server server, long idServer) {

    }

    @Override
    public void addNewTelephone(Telephone newTelephone) {

    }

    @Override
    public Telephone findTelephone(long idTelephone) {
        return null;
    }

    @Override
    public List<Telephone> findAllTelephons() {
        return null;
    }

    @Override
    public void deleteTelephone(long idTelephone) {

    }

    @Override
    public void updateTelephone(Telephone telephone, long idTelephone) {

    }

    @Override
    public void addNewUps(Ups newUps) {

    }

    @Override
    public Ups findUps(long idUps) {
        return null;
    }

    @Override
    public List<Ups> findAllUps() {
        return null;
    }

    @Override
    public void deleteUps(long idUps) {

    }

    @Override
    public void updateUps(Ups ups, long idUps) {

    }

    @Override
    public void addNewWifiCard(WifiCard newWifiCard) {

    }

    @Override
    public WifiCard findWifiCard(long idWifiCard) {
        return null;
    }

    @Override
    public List<WifiCard> findAllWifiCards() {
        return null;
    }

    @Override
    public void deleteWifiCard(long idWifiCard) {

    }

    @Override
    public void updateWifiCard(WifiCard wifiCard, long idWifiCard) {

    }
}
