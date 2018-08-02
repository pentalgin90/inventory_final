package by.htp.inventory.dao.impl;

import by.htp.inventory.dao.PrinterDAO;
import by.htp.inventory.entity.Printer;
import by.htp.inventory.repositories.PrinterRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PrinterDAOImpl implements PrinterDAO{
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
