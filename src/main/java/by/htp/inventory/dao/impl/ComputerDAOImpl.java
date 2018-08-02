package by.htp.inventory.dao.impl;

import by.htp.inventory.dao.ComputerDAO;
import by.htp.inventory.entity.Computer;
import by.htp.inventory.repositories.ComputerPerository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ComputerDAOImpl implements ComputerDAO {
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
