package by.htp.inventory.service.impl;

import by.htp.inventory.service.WifiCardService;
import by.htp.inventory.entity.WifiCard;
import by.htp.inventory.repositories.WifiCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WifiCardServiceImpl implements WifiCardService {
    @Autowired
    WifiCardRepository wifiCardRepository;

    @Override
    public void addNewWifiCard(WifiCard newWifiCard) {
        wifiCardRepository.saveAndFlush(newWifiCard);
    }

    @Override
    public WifiCard findWifiCard(long idWifiCard) {
        return wifiCardRepository.getOne(idWifiCard);
    }

    @Override
    public List<WifiCard> findAllWifiCards() {
        return wifiCardRepository.findAll();
    }

    @Override
    public void deleteWifiCard(long idWifiCard) {
        wifiCardRepository.deleteById(idWifiCard);
    }

    @Override
    public void updateWifiCard(WifiCard wifiCard) {
        wifiCardRepository.saveAndFlush(wifiCard);
    }
}
