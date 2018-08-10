package by.htp.inventory.service.impl;

import by.htp.inventory.service.ComputerService;
import by.htp.inventory.entity.Computer;
import by.htp.inventory.repositories.ComputerPerository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ComputerServiceImpl implements ComputerService {
    @Autowired
    ComputerPerository computerPerository;

    @Override
    public void addNewComputer(Computer newComputer) {
        computerPerository.saveAndFlush(newComputer);
    }

    @Override
    public Computer findComputer(long idComputer) {
        return computerPerository.getOne(idComputer);
    }

    @Override
    public List<Computer> findAllComputers() {
        return computerPerository.findAll();
    }

    @Override
    public void deleteComputer(long idComputer) {
        computerPerository.deleteById(idComputer);
    }

    @Override
    public void updateComputer(Computer computer) {
        computerPerository.saveAndFlush(computer);
    }
}
