package by.htp.inventory.controller;

import by.htp.inventory.entity.Monitor;
import by.htp.inventory.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/monitor")
public class MonitorController {
    @Autowired
    MonitorService monitorService;
    @RequestMapping(value = "/monitors", method = RequestMethod.POST)
    public String monitors(ModelMap model){
        List<Monitor> monitors = monitorService.findAllMonitors();
        model.addAttribute("monitors", monitors);
        return "monitors";
    }
    public String deleteMonitor(ModelMap model){
        return null;
    }
}
