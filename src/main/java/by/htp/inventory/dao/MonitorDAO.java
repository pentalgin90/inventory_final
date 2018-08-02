package by.htp.inventory.dao;

import by.htp.inventory.entity.Monitor;

import java.util.List;

public interface MonitorDAO {
    //Monitor
    void addNewMonitor(Monitor newMonitor);
    Monitor findMonitor(long idMonitor);
    List<Monitor> findAllMonitors();
    void deleteMonitor(long idMonitor);
    Monitor updateMonitor(Monitor monitor);
}
