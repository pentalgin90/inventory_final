package by.htp.inventory.service;

import by.htp.inventory.entity.Computer;

import java.util.List;

public interface ComputerService {
    //Computer
    void addNewComputer(Computer newComputer);
    Computer findComputer(long idComputer);
    List<Computer> findAllComputers();
    void deleteComputer(long idComputer);
    void updateComputer(Computer computer);
}
