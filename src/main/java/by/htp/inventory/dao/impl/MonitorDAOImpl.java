package by.htp.inventory.dao.impl;

import by.htp.inventory.dao.MonitorDAO;
import by.htp.inventory.entity.Monitor;
import by.htp.inventory.repositories.MonitorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MonitorDAOImpl implements MonitorDAO {


    @Autowired
    MonitorRepository monitorRepository;

    @Override
    public void addNewMonitor(Monitor newMonitor) {
        monitorRepository.saveAndFlush(newMonitor);
    }

    @Override
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
}
