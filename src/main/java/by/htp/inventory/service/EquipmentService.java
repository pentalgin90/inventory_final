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
    void addNewWifiDot(WiFiDot newWiFiDot);
    WiFiDot findWifiDot(long idWiFiDot);
    List<WiFiDot> findAllWifiDots();
    void deleteWifiDot(long idWiFiDot);
    void updateWifiDot(WiFiDot wiFiDot, long idWiFiDot);

    //Terminal
    void addNewTerminal(Terminal newTerminal);
    Terminal findTerminal(long idTerminal);
    List<Terminal> findAllTerminals();
    void deleteTerminal(long idTerminal);
    void updateTerminal(Terminal Terminal, long idTerminal);

    //TerminalDocStation
    void addNewTerminalDocStation(TerminalDocStation newTerminalDocStation);
    TerminalDocStation findTerminalDocStation(long idTerminalDocStation);
    List<TerminalDocStation> findAllTerminalDocStations();
    void deleteTerminalDocStation(long idTerminalDocStation);
    void updateTerminalDocStation(TerminalDocStation TerminalDocStation, long idTerminalDocStation);
}
