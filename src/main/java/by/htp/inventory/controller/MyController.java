package by.htp.inventory.controller;

import by.htp.inventory.dao.impl.MonitorDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
	public class MyController {

	    @RequestMapping(value="/welcome", method = RequestMethod.GET)
	    public String printWelcome(ModelMap model) {

	        model.addAttribute("message", "Spring 4 MVC - Hello World");
	        return "hello";

	    }
	    @RequestMapping(value="/listEquipment", method = RequestMethod.GET)
	    public String listEquipment(){

	    	return "listEquipment";
		}
}
