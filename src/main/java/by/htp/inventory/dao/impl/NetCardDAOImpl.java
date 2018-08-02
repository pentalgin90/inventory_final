package by.htp.inventory.dao.impl;

import by.htp.inventory.dao.NetCardDAO;
import by.htp.inventory.entity.NetCard;
import by.htp.inventory.repositories.NetCardRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NetCardDAOImpl implements NetCardDAO {
    @Autowired
    NetCardRepository netCardRepository;

    @Override
    public void addNewNetCard(NetCard newNetCard) {
        netCardRepository.saveAndFlush(newNetCard);
    }

    @Override
    public NetCard findNetCard(long idNetCard) {
        return netCardRepository.getOne(idNetCard);
    }

    @Override
    public List<NetCard> findAllNetCards() {
        return netCardRepository.findAll();
    }

    @Override
    public void deleteNetCard(long idNetCard) {
        netCardRepository.deleteById(idNetCard);
    }

    @Override
    public void updateNetCard(NetCard netCard) {
        netCardRepository.saveAndFlush(netCard);
    }
}
