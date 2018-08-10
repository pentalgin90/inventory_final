package by.htp.inventory.service;

import by.htp.inventory.entity.Brand;

import java.util.List;

public interface BrandService {
    void addNewBrand(Brand newBrand);
    Brand findBattary(long idBrand);
    List<Brand> findAllBattarys();
    void deleteBrand(long idBrand);
    void updateBrand(Brand brand);
}
