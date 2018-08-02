package by.htp.inventory.dao.impl;

import by.htp.inventory.dao.TerminalDAO;
import by.htp.inventory.dao.TerminalDotDAO;
import by.htp.inventory.entity.Terminal;
import by.htp.inventory.entity.TerminalDot;
import by.htp.inventory.repositories.TerminalDotRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TerminalDotDAOImpl implements TerminalDotDAO {
    @Autowired
    TerminalDotRepository terminalDotRepository;


    @Override
    public void addNewTerminalDocStation(TerminalDot newTerminalDocStation) {
        terminalDotRepository.saveAndFlush(newTerminalDocStation);
    }

    @Override
    public TerminalDot findTerminalDocStation(long idTerminalDocStation) {
        return terminalDotRepository.getOne(idTerminalDocStation);
    }

    @Override
    public List<TerminalDot> findAllTerminalDocStations() {
        return terminalDotRepository.findAll();
    }

    @Override
    public void deleteTerminalDocStation(long idTerminalDocStation) {
        terminalDotRepository.deleteById(idTerminalDocStation);
    }

    @Override
    public void updateTerminalDocStation(TerminalDot terminalDot) {
        terminalDotRepository.saveAndFlush(terminalDot);
    }
}
