package by.htp.inventory.service.impl;

import by.htp.inventory.service.ServerService;
import by.htp.inventory.entity.Server;
import by.htp.inventory.repositories.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServerServiceImpl implements ServerService {
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
