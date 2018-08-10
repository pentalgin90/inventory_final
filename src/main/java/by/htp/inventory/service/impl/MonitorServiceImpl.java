package by.htp.inventory.service.impl;

import by.htp.inventory.service.MonitorService;
import by.htp.inventory.entity.Monitor;
import by.htp.inventory.repositories.MonitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MonitorServiceImpl implements MonitorService {


    @Autowired
    private MonitorRepository monitorRepository;

    @Override
    public void addNewMonitor(Monitor newMonitor) {
        monitorRepository.saveAndFlush(newMonitor);
    }

    @Override
    @Transactional
    public Monitor findMonitor(long idMonitor) {
        return monitorRepository.getOne(idMonitor);
    }

    @Override
    public List<Monitor> findAllMonitors() {
        return monitorRepository.findAll();
    }

    @Override
    public void deleteMonitor(long idMonitor) {
        monitorRepository.deleteById(idMonitor);
    }

    @Override
    public Monitor updateMonitor(Monitor monitor) {
        return monitorRepository.saveAndFlush(monitor);
    }

   /* @Override
    public Monitor findMonitorForInventory(String inventoryID) {
        return monitorRepository.findByInventoryID(inventoryID);
    }*/
}
