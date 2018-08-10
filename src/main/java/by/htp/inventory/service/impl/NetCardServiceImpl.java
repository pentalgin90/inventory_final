package by.htp.inventory.service.impl;

import by.htp.inventory.service.NetCardService;
import by.htp.inventory.entity.NetCard;
import by.htp.inventory.repositories.NetCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NetCardServiceImpl implements NetCardService {
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
