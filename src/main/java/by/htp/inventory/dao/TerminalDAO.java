package by.htp.inventory.dao;

import by.htp.inventory.entity.Terminal;

import java.util.List;

public interface TerminalDAO {
    //Terminal
    void addNewTerminal(Terminal newTerminal);
    Terminal findTerminal(long idTerminal);
    List<Terminal> findAllTerminals();
    void deleteTerminal(long idTerminal);
    void updateTerminal(Terminal terminal);
}
