package by.htp.inventory.service;

import by.htp.inventory.entity.TerminalDot;

import java.util.List;

public interface TerminalDotService {

    void addNewTerminalDocStation(TerminalDot newTerminalDocStation);
    TerminalDot findTerminalDocStation(long idTerminalDocStation);
    List<TerminalDot> findAllTerminalDocStations();
    void deleteTerminalDocStation(long idTerminalDocStation);
    void updateTerminalDocStation(TerminalDot terminalDot);

}
