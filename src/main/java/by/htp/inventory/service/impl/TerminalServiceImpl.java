package by.htp.inventory.service.impl;

import by.htp.inventory.service.TerminalService;
import by.htp.inventory.entity.Terminal;
import by.htp.inventory.repositories.TerminalRepositpry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TerminalServiceImpl implements TerminalService {
    @Autowired
    TerminalRepositpry terminalRepositpry;

    @Override
    public void addNewTerminal(Terminal newTerminal) {
        terminalRepositpry.saveAndFlush(newTerminal);
    }

    @Override
    public Terminal findTerminal(long idTerminal) {
        return terminalRepositpry.getOne(idTerminal);
    }

    @Override
    public List<Terminal> findAllTerminals() {
        return terminalRepositpry.findAll();
    }

    @Override
    public void deleteTerminal(long idTerminal) {
        terminalRepositpry.deleteById(idTerminal);
    }

    @Override
    public void updateTerminal(Terminal terminal) {
        terminalRepositpry.saveAndFlush(terminal);
    }
}
