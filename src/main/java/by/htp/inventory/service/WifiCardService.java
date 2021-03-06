package by.htp.inventory.service;

import by.htp.inventory.entity.WifiCard;

import java.util.List;

public interface WifiCardService {
    void addNewWifiCard(WifiCard newWifiCard);
    WifiCard findWifiCard(long idWifiCard);
    List<WifiCard> findAllWifiCards();
    void deleteWifiCard(long idWifiCard);
    void updateWifiCard(WifiCard wifiCard);
}
