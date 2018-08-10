package by.htp.inventory.service;

import by.htp.inventory.entity.Server;

import java.util.List;

public interface ServerService {
    void addNewServer(Server newServer);
    Server findServer(long idServer);
    List<Server> findAllServers();
    void deleteServer(long idServer);
    void updateServer(Server server);
}
