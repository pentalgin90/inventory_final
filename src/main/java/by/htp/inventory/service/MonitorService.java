package by.htp.inventory.service;

import by.htp.inventory.entity.Monitor;

import java.util.List;

public interface MonitorService {
    //Monitor
    void addNewMonitor(Monitor newMonitor);
    Monitor findMonitor(long idMonitor);
    List<Monitor> findAllMonitors();
    void deleteMonitor(long idMonitor);
    Monitor updateMonitor(Monitor monitor);
   // Monitor findMonitorForInventory(String inventoryID);
}
