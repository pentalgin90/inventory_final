package by.htp.inventory.service.impl;

import by.htp.inventory.service.LaptopService;
import by.htp.inventory.entity.Laptop;
import by.htp.inventory.repositories.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LaptopServiceImpl implements LaptopService {
    @Autowired
    private LaptopRepository laptopRepository;

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
