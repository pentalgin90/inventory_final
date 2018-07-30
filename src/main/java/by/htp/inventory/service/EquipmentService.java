package by.htp.inventory.service;

import by.htp.inventory.entity.*;

import java.util.List;

public interface EquipmentService {
    //Monitor
    void addNewMonitor(Monitor newMonitor);
    Monitor findMonitor(long idMonitor);
    List<Monitor> findAllMonitors();
    void deleteMonitor(long idMonitor);
    void updateMonitor(Monitor monitor, long idMonitor);

    //Computer
    void addNewComputer(Computer newComputer);
    Computer findComputer(long idComputer);
    List<Computer> findAllComputers();
    void deleteComputer(long idComputer);
    void updateComputer(Computer Computer, long idComputer);

    //Commutator
    void addNewCommutator(Commutator newCommutator);
    Commutator findCommutator(long idCommutator);
    List<Commutator> findAllCommutators();
    void deleteCommutator(long idCommutator);
    void updateCommutator(Commutator Commutator, long idCommutator);

    //Laptop
    void addNewLaptop(Laptop newLaptop);
    Laptop findLaptop(long idLaptop);
    List<Laptop> findAllLaptops();
    void deleteLaptop(long idLaptop);
    void updateLaptop(Laptop Laptop, long idLaptop);

    //Printer
    void addNewPrinter(Printer newPrinter);
    Printer findPrinter(long idPrinter);
    List<Printer> findAllPrinters();
    void deletePrinter(long idPrinter);
    void updatePrinter(Printer Printer, long idPrinter);

    //WifiDot
    void addNewWifiDot(WifiDot newWiFiDot);
    WifiDot findWifiDot(long idWiFiDot);
    List<WifiDot> findAllWifiDots();
    void deleteWifiDot(long idWiFiDot);
    void updateWifiDot(WifiDot wifiDot, long idWiFiDot);

    //Terminal
    void addNewTerminal(Terminal newTerminal);
    Terminal findTerminal(long idTerminal);
    List<Terminal> findAllTerminals();
    void deleteTerminal(long idTerminal);
    void updateTerminal(Terminal Terminal, long idTerminal);

    //TerminalDot
    void addNewTerminalDocStation(TerminalDot newTerminalDocStation);
    TerminalDot findTerminalDocStation(long idTerminalDocStation);
    List<TerminalDot> findAllTerminalDocStations();
    void deleteTerminalDocStation(long idTerminalDocStation);
    void updateTerminalDocStation(TerminalDot TerminalDocStation, long idTerminalDocStation);

    //Antena
    void addNewMonitor(Antena newAntena);
    Antena findAntena(long idAntena);
    List<Antena> findAllAntens();
    void deleteAntena(long idAntena);
    void updateMonitor(Antena antena, long idAntena);

    //Battary
    void addNewBattary(Battary newBattary);
    Battary findBattary(long idBattary);
    List<Battary> findAllBattarys();
    void deleteBattary(long idBattary);
    void updateBattary(Battary battary, long idBattary);

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
