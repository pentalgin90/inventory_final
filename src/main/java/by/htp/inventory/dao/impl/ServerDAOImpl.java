package by.htp.inventory.dao.impl;

import by.htp.inventory.dao.ServerDAO;
import by.htp.inventory.entity.Server;
import by.htp.inventory.repositories.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServerDAOImpl implements ServerDAO {
    @Autowired
    ServerRepository serverRepository;

    @Override
    public void addNewServer(Server newServer) {
        serverRepository.saveAndFlush(newServer);
    }

    @Override
    public Server findServer(long idServer) {
        return serverRepository.getOne(idServer);
    }

    @Override
    public List<Server> findAllServers() {
        return serverRepository.findAll();
    }

    @Override
    public void deleteServer(long idServer) {
        serverRepository.deleteById(idServer);
    }

    @Override
    public void updateServer(Server server) {
        serverRepository.saveAndFlush(server);
    }
}
