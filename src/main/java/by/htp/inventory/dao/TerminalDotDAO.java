package by.htp.inventory.dao;

import by.htp.inventory.entity.TerminalDot;

import java.util.List;

public interface TerminalDotDAO {

    void addNewTerminalDocStation(TerminalDot newTerminalDocStation);
    TerminalDot findTerminalDocStation(long idTerminalDocStation);
    List<TerminalDot> findAllTerminalDocStations();
    void deleteTerminalDocStation(long idTerminalDocStation);
    void updateTerminalDocStation(TerminalDot terminalDot);

}
