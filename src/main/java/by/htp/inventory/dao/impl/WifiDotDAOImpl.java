package by.htp.inventory.dao.impl;


import by.htp.inventory.dao.WifiDotDAO;
import by.htp.inventory.entity.WifiDot;
import by.htp.inventory.repositories.WifiDotRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class WifiDotDAOImpl implements WifiDotDAO {
    @Autowired
    WifiDotRepository wifiDotRepository;

    @Override
    public void addNewWifiDot(WifiDot newWiFiDot) {
        wifiDotRepository.saveAndFlush(newWiFiDot);
    }

    @Override
    public WifiDot findWifiDot(long idWiFiDot) {
        return wifiDotRepository.getOne(idWiFiDot);
    }

    @Override
    public List<WifiDot> findAllWifiDots() {
        return wifiDotRepository.findAll();
    }

    @Override
    public void deleteWifiDot(long idWiFiDot) {
        wifiDotRepository.deleteById(idWiFiDot);
    }

    @Override
    public void updateWifiDot(WifiDot wifiDot) {
        wifiDotRepository.saveAndFlush(wifiDot);
    }
}
