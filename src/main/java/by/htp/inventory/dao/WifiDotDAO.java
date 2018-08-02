package by.htp.inventory.dao;

import by.htp.inventory.entity.WifiDot;

import java.util.List;

public interface WifiDotDAO {

    void addNewWifiDot(WifiDot newWiFiDot);
    WifiDot findWifiDot(long idWiFiDot);
    List<WifiDot> findAllWifiDots();
    void deleteWifiDot(long idWiFiDot);
    void updateWifiDot(WifiDot wifiDot);

}
