package by.htp.inventory.service;

import by.htp.inventory.entity.Terminal;

import java.util.List;

public interface TerminalService {
    //Terminal
    void addNewTerminal(Terminal newTerminal);
    Terminal findTerminal(long idTerminal);
    List<Terminal> findAllTerminals();
    void deleteTerminal(long idTerminal);
    void updateTerminal(Terminal terminal);
}
