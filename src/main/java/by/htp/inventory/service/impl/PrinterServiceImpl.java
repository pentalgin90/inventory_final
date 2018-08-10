package by.htp.inventory.service.impl;

import by.htp.inventory.service.PrinterService;
import by.htp.inventory.entity.Printer;
import by.htp.inventory.repositories.PrinterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PrinterServiceImpl implements PrinterService {
    @Autowired
    PrinterRepository printerRepository;

    @Override
    public void addNewPrinter(Printer newPrinter) {
        printerRepository.saveAndFlush(newPrinter);
    }

    @Override
    public Printer findPrinter(long idPrinter) {
        return printerRepository.getOne(idPrinter);
    }

    @Override
    public List<Printer> findAllPrinters() {
        return printerRepository.findAll();
    }

    @Override
    public void deletePrinter(long idPrinter) {
        printerRepository.deleteById(idPrinter);
    }

    @Override
    public void updatePrinter(Printer printer) {
        printerRepository.saveAndFlush(printer);
    }
}
