import by.htp.inventory.entity.Monitor;
import by.htp.inventory.repositories.MonitorRepository;
import by.htp.inventory.service.MonitorService;
import by.htp.inventory.service.impl.MonitorServiceImpl;
import org.junit.Test;

import java.util.List;


public class TestDAO {

   @Test
    public void testConnection() {
       MonitorService monitorService = new MonitorServiceImpl();
       List<Monitor> monitors = monitorService.findAllMonitors();
       monitors.forEach(monitor -> System.out.println(monitor));
    }
}