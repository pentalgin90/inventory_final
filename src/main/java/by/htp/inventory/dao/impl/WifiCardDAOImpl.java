package by.htp.inventory.dao.impl;

import by.htp.inventory.dao.WifiCardDAO;
import by.htp.inventory.entity.WifiCard;
import by.htp.inventory.repositories.WifiCardRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class WifiCardDAOImpl implements WifiCardDAO {
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
