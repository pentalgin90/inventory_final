package by.htp.inventory.dao.impl;

import by.htp.inventory.dao.LaptopDAO;
import by.htp.inventory.entity.Laptop;
import by.htp.inventory.repositories.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LaptopDAOImpl implements LaptopDAO {
    @Autowired
    LaptopRepository laptopRepository;

    @Override
    public void addNewLaptop(Laptop newLaptop) {
        laptopRepository.saveAndFlush(newLaptop);
    }

    @Override
    public Laptop findLaptop(long idLaptop) {
        return laptopRepository.getOne(idLaptop);
    }

    @Override
    public List<Laptop> findAllLaptops() {
        return laptopRepository.findAll();
    }

    @Override
    public void deleteLaptop(long idLaptop) {
        laptopRepository.deleteById(idLaptop);
    }

    @Override
    public void updateLaptop(Laptop laptop) {
        laptopRepository.saveAndFlush(laptop);
    }
}
