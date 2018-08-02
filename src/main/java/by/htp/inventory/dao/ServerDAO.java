package by.htp.inventory.dao;

import by.htp.inventory.entity.Server;

import java.util.List;

public interface ServerDAO {
    void addNewServer(Server newServer);
    Server findServer(long idServer);
    List<Server> findAllServers();
    void deleteServer(long idServer);
    void updateServer(Server server);
}
