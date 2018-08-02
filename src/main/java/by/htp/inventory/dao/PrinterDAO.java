package by.htp.inventory.dao;

import by.htp.inventory.entity.Printer;

import java.util.List;

public interface PrinterDAO {
    void addNewPrinter(Printer newPrinter);
    Printer findPrinter(long idPrinter);
    List<Printer> findAllPrinters();
    void deletePrinter(long idPrinter);
    void updatePrinter(Printer printer);
}
