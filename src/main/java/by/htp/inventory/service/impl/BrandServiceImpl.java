package by.htp.inventory.service.impl;


import by.htp.inventory.entity.Brand;
import by.htp.inventory.repositories.BrandRepository;
import by.htp.inventory.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    BrandRepository brandRepository;

    @Override
    public void addNewBrand(Brand newBrand) {
        brandRepository.saveAndFlush(newBrand);
    }

    @Override
    public Brand findBattary(long idBrand) {
        return brandRepository.getOne(idBrand);
    }

    @Override
    public List<Brand> findAllBattarys() {
        return brandRepository.findAll();
    }

    @Override
    public void deleteBrand(long idBrand) {
        brandRepository.deleteById(idBrand);
    }

    @Override
    public void updateBrand(Brand brand) {
        brandRepository.saveAndFlush(brand);
    }
}
