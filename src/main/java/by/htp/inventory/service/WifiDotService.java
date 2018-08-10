package by.htp.inventory.service;

import by.htp.inventory.entity.WifiDot;

import java.util.List;

public interface WifiDotService {

    void addNewWifiDot(WifiDot newWiFiDot);
    WifiDot findWifiDot(long idWiFiDot);
    List<WifiDot> findAllWifiDots();
    void deleteWifiDot(long idWiFiDot);
    void updateWifiDot(WifiDot wifiDot);

}
