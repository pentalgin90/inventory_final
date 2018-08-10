package by.htp.inventory.controller;

import by.htp.inventory.entity.*;
import by.htp.inventory.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value="/")
	public class MyController {
        @Autowired
            MonitorService monitorService;
        @Autowired
            LaptopService laptopService;
        @Autowired
            AntenaService antenaService;
        @Autowired
            BattaryService battaryService;
        @Autowired
            CommutatorService commutatorService;
        @Autowired
            ComputerService computerService;
        @Autowired
            NetCardService netCardService;
        @Autowired
            PrinterService printerService;
        @Autowired
            ServerService serverService;
        @Autowired
            TelephoneService telephoneService;
        @Autowired
            TerminalService terminalService;
        @Autowired
            UpsService upsService;
        @Autowired
            WifiCardService wifiCardService;
        @Autowired
            WifiDotService wifiDotService;
        @Autowired
            TerminalDotService terminalDotService;
	    @RequestMapping(value="/addEquipment", method = RequestMethod.GET)
	    public String printWelcome(ModelMap model) {


	        return "hello";

	    }
	    @RequestMapping(value="/listEquipment", method = RequestMethod.GET)
	    public String listEquipment(ModelMap model){
            List<Monitor> monitors = monitorService.findAllMonitors();
            int amountMonitors = monitors.size();
            List<Laptop> laptops = laptopService.findAllLaptops();
            int amountLaptops = laptops.size();
            List<Antena> antenas = antenaService.findAllAntens();
            int amountAntenas = antenas.size();
            List<Battary> battaries = battaryService.findAllBattarys();
            int amountBattaries = battaries.size();
            List<Commutator> commutators = commutatorService.findAllCommutators();
            int amountCommutators = commutators.size();
            List<Computer> computers = computerService.findAllComputers();
            int amountComputers = computers.size();
            List<NetCard> netCards = netCardService.findAllNetCards();
            int amountNetCards = netCards.size();
            List<Printer> printers = printerService.findAllPrinters();
            int amountPrinters = printers.size();
            List<Server> servers = serverService.findAllServers();
            int amountServers = servers.size();
            List<Telephone> telephones = telephoneService.findAllTelephons();
            int amountTelephones = telephones.size();
            List<Terminal> terminals = terminalService.findAllTerminals();
            int amountTerminals = terminals.size();
            List<TerminalDot> terminalDots = terminalDotService.findAllTerminalDocStations();
            int amountTerminalDots = terminalDots.size();
            List<Ups> upsList = upsService.findAllUps();
            int amountUps = upsList.size();
            List<WifiCard> wifiCards = wifiCardService.findAllWifiCards();
            int amountWifiCards = wifiCards.size();
            List<WifiDot> wifiDots = wifiDotService.findAllWifiDots();
            int amountWifiDots = wifiDots.size();
            model.addAttribute("amountMonitors", amountMonitors);
            model.addAttribute("amountLaptops", amountLaptops);
            model.addAttribute("amountAntenas" , amountAntenas);
            model.addAttribute("amountBattaries", amountBattaries);
            model.addAttribute("amountCommutators", amountCommutators);
            model.addAttribute("amountComputers", amountComputers);
            model.addAttribute("amountNetCards", amountNetCards);
            model.addAttribute("amountPrinters", amountPrinters);
            model.addAttribute("amountServers", amountServers);
            model.addAttribute("amountTerminals", amountTerminals);
            model.addAttribute("amountTelephones", amountTelephones);
            model.addAttribute("amountUps", amountUps);
            model.addAttribute("amountWifiCards", amountWifiCards);
            model.addAttribute("amountWifiDots", amountWifiDots);
            model.addAttribute("amountTerminalDots", amountTerminalDots);
	    	return "listEquipment";
		}


}
