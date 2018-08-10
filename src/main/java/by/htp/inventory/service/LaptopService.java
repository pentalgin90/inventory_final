package by.htp.inventory.service;

import by.htp.inventory.entity.Laptop;

import java.util.List;

public interface LaptopService {

    void addNewLaptop(Laptop newLaptop);
    Laptop findLaptop(long idLaptop);
    List<Laptop> findAllLaptops();
    void deleteLaptop(long idLaptop);
    void updateLaptop(Laptop laptop);

}
