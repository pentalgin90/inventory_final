package by.htp.inventory.service.impl;


import by.htp.inventory.service.WifiDotService;
import by.htp.inventory.entity.WifiDot;
import by.htp.inventory.repositories.WifiDotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WifiDotServiceImpl implements WifiDotService {
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
