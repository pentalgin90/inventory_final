package by.htp.inventory.service.impl;

import by.htp.inventory.service.TerminalDotService;
import by.htp.inventory.entity.TerminalDot;
import by.htp.inventory.repositories.TerminalDotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TerminalDotServiceImpl implements TerminalDotService {
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
